#symlink
ln -s $FILE_PATH $LINK_PATH

#{} to mark the current variable to expand
${PATH}subfolder

#check if port is open and accessible, -z means sending no data, just scanning the daemon
nc -z $HOST $PORT

#delete the folder if it exists, note that the spaces around -d predicate matter! 
[ -d $FOLDER ] && rm -r $FOLDER

#But -d does not work with wildcards!
if ls /path/to/your/files* 1> /dev/null 2>&1; then
      echo "files do exist"


unzip $FROM -d $TARGET_DIR

host $FIND_IP_OF_HOST

# > vs >>

SLEEP_DURATION=$((TEST_DURATION + 10))
echo "Sleep for $SLEEP_DURATION"

######

screen -S sessionName
screen -d -R sessionName

#ctrl-a + d to detach from screen
#back to the same terminal
screen -r

CURRENT_BASH_DIR=$(dirname "$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd -P )")

#search only files with certain extensions
grep -r --include=*.scala 'spray' ./ | less

#find all .c file starting at the current dir, note find can be chained to other commands too!
find . -name \*.c -print
