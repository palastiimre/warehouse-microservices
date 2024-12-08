#!/bin/bash

files() {
  local yml_files=($(find "$(pwd)" -maxdepth 1 -name "*.yml"))
  echo "YML files in directory:"
  echo "$yml_files"

      # Check if any YAML files are found in the current folder.
      if [ ${#yml_files[@]} -eq 0 ]; then
          echo "No yml files found in the current folder."
          exit 1
      fi
}

up() {
    local yml_files=($(find "$(pwd)" -maxdepth 1 -name "*.yml"))

    # Check if any YAML files are found in the current folder.
    if [ ${#yml_files[@]} -eq 0 ]; then
        echo "No yml files found in the current folder."
        exit 1
    fi

    for file in "${yml_files[@]}"; do
        eval docker-compose -f "$file" up -d
        echo "All compose-related containers are started for $(basename "$file")."
    done
}


down() {
    local yml_files=($(find "$(pwd)" -maxdepth 1 -name "*.yml"))

    # Check if any YAML files are found in the current folder.
    if [ ${#yml_files[@]} -eq 0 ]; then
        echo "No yml files found in the current folder."
        exit 1
    fi

    local output=""
    for file in "${yml_files[@]}"; do
        output=$(eval docker-compose -f "$file" down 2>&1)
        if [[ $output == *"No resource found to remove"* ]]; then
            echo "No compose files are running for $(basename "$file")."
        else
            echo "All compose-related containers are removed for $(basename "$file")."
        fi
    done
}


ACTION=""
index=1
for PARAMETER in "$@"
do
    if [[ "$index" -eq 1 ]]; then
      ACTION="$PARAMETER"
    fi
done



case $ACTION in
    files)
      files
      ;;
    up)
        up
      ;;
    down)
      down
      ;;
esac