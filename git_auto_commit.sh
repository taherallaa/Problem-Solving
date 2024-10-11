#!/bin/bash

# Check for new (untracked) files
new_files=$(git ls-files --others --exclude-standard)

if [[ -z $new_files ]]; then
  echo "There is no new problem."
  exit 1
fi

# Ask how many files to commit
read -p "How many files do you want to commit? " file_count

# Initialize an empty string to store file names
files=""

# Loop to get file names
for ((i = 1; i <= file_count; i++)); do
  read -p "Enter file name $i: " file_name
  files+="$file_name "
done

# Add all changes in the current directory
git add .

# Get current date
current_date=$(date +"%Y-%m-%d")

# Commit with a message
git commit -m "I solved $files... problem + $current_date"

# Push the changes to the remote repository
git push
