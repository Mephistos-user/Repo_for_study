#!/bin/bash
if [ "$#" - lt 1 ]; then
echo "Недостаточно аргументов. Введите имя. Пример $0 Vasya" 
exit 1
fi

if [ "$1" = "Vasya" ]; then
    echo "Whatsupp, Vasiliy?" 
elif [ "$1" = "Masha" ];
then
    echo "Hey, Masha" 
elif [ "$1" = "Michael" ];
then
    echo "Hi there, Michael" 
else
    echo "Hi, $1"
fi









echo "Hello, $1!"