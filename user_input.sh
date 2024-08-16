#!/usr/bin/env bash

isNotEmpty=true
while [ $isNotEmpty == true ]; do
	echo "Enter your name: "
	read name

	if [[ ! -z "$name" ]]; then
		echo "Hello! $name, welcome to bash script"
		isNotEmpty=false
	else
		echo "Please enter your name, thank you!"
	fi
done
		
