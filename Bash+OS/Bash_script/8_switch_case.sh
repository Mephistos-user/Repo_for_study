#!/bin/bash

name=$1

case "name" in
    "Vasya" )
    greatString="Whatsupp"
    nameString="Vasiliy"
    ;;
    "Masha" )
    greatString="Hey"
    nameString="Maria"
    ;;
    * ) # - аналог default в других ЯП
    greatString="Hello"
    nameString="stranger"
esac # как и в if -  завершение условия (case задом на перед)

echo "$greatString, $nameString!"