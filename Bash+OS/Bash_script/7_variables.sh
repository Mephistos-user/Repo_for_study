#!/bin/bash

greatString="Hello" 
nameString="stranger"
# при присваивании значений аргументам пробелы ло и после "=" ставить нельзя

if [ "$#" - lt 1 ];
then
echo "Недостаточно аргументов. Введите имя. Пример $0 Vasya" 
exit 1
fi

if [ "$1" = "Vasya" ];
then
    greatString="Whatsupp"
    nameString="Vasiliy"
elif [ "$1" = "Masha" ];
then
    nameString="Maria"
elif [ "$1" = "Michael" ];
then
    greatString="Shalom"
    nameString="Michael"
fi
echo "$greatString, $nameString"