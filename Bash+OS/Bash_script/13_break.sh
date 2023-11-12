#!/bin/bash
count=0
while [ $count -lt 10 ]
do
    (( count++ ))
    echo "count: $count"
    if [ "$count" -gt 5 ]
    then
        break
    fi
done