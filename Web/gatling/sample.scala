package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {
  val targetURL = "http://computer-database.gatling.io"
  val numAtOnceUser = 1;

  val httpConf = http
    .baseURL(targetURL) // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val headers_10 = Map("Content-Type" -> "application/x-www-form-urlencoded") // Note the headers specific to a given request

  val scn = scenario("Scenario Name") // A scenario is a chain of requests and pauses
    .exec(http("request_1")
      .get("/"))
    .pause(7) // Note that Gatling has recorded real time pauses
    .exec(http("request_2")
      .get("/computers?f=macbook"))
    .pause(2)
    .exec(http("request_10") // Here's an example of a POST request
      .post("/computers")
      .headers(headers_10)
      .formParam("name", "Beautiful Computer") // Note the triple double quotes: used in Scala for protecting a whole chain of characters (no need for backslash)
      .formParam("introduced", "2012-05-30")
      .formParam("discontinued", "")
      .formParam("company", "37"))

  setUp(scn.inject(atOnceUsers(numAtOnceUser)).protocols(httpConf))
}