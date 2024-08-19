#!/usr/bin/env bash

# Enter directory path to scan
isPromptError=true

while [ $isPromptError == true ]; do

	printf "Input the path of the folder: "
	read FILE_PATH

	if [[ ! -d "$FILE_PATH" ]]; then
		echo "ERROR::MISSING FOLDER!"
	fi

	if [[ -z "$( ls -A "$FILE_PATH" )" ]]; then
		echo "ERROR:: Directory is empty, nothing to organize."
	else
		for file in $( ls -p "$FILE_PATH" 2>/dev/null ); do
			echo "$(basename "$file")"
		done
		isPromptError=false
	fi
done
