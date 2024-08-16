#!/usr/bin/env bash

stopCalculator=true
while [ $stopCalculator == true ]; do	
	printf "Enter first numbers : "
	read firstNumber

	printf "Enter second number: "
	read secondNumber

	echo "1. Addition"
	echo "2. Subtraction"
	echo "3. Multiplication"
	echo "4. Division"
	printf "Input the number of expression above: "
	read expression

	case "$expression" in
		1)
			echo "-> $(("$firstNumber" + "$secondNumber"))"
			;;
		2)
			echo "-> $(("$firstNumber" - "$secondNumber"))"
			;;
		3)
			echo "-> $(("$firstNumber" * "$secondNumber"))"
			;;
		4) 
			echo "-> $(("$firstNumber" / "$secondNumber"))"
			;;
		*)
			echo "Expression is unknown, please try again."
			;;
	esac
	
	echo "(1) Continue"
	echo "(0) Exit"
	read selectedOpt

	if [[ $selectedOpt != 1 ]]; then
		stopCalculator=false
	fi
done
