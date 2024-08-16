#!/usr/bin/env bash

string=$1
file=$2

# Store string if not exist in the file, otherwise prompt message
# Interpreted as fixed and regular string then stop process in first match for repeated string.
if grep -Fq "$string" "$file"; then
    echo "'${string^^}' already exists in $file"
else
    echo "$string" >> "$file"
    echo "'${string^^}' saved successfully in $file!"
fi
