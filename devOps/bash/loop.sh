for var in "${ArrayName[@]}"
do
  echo "${var}"
  # do something on $var
done

echo "Total files in array : ${#files[*]}"
total=${#files[*]}
