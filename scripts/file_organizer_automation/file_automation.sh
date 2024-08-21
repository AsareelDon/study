#!/usr/bin/env bash

# Enter directory path to scan
isPromptError=true
DIRECTORIES=("Pictures" "Vidoes" "Documents")
SUB_DIRECTORIES=("PDF" "DOCS" "Excel")

while [ $isPromptError == true ]; do

	printf "Input the path of the folder: "
	read FILE_PATH

	if [[ ! -d "$FILE_PATH" ]]; then
		echo "ERROR::MISSING FOLDER!"

	elif [[ -z "$( ls -A "$FILE_PATH" 2>/dev/null )" ]]; then
		echo "ERROR:: Directory is empty, nothing to organize."
	else
		for DIR in ${DIRECTORIES[@]}; do
			if [[! -d "$DIR" ]]; then
				mkdir "$DIR"
				echo "$DIR"
			else
				echo "$DIR is already exists!"
			fi
		done

		for file in $( ls -p "$FILE_PATH" 2>/dev/null ); do
			extension="${file##*.}"
			case "$extension" in
				txt)
					echo "$file has a extension of $extension"
					;;
				*)
					echo "No extension"
					;;
			esac
		done
		isPromptError=false
	fi
done
