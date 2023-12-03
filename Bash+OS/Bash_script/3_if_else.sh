#!/bin/bash
if [ "$#" - lt 1 ]; then # $# - колличество аргументов, которые переданы
# в bash-script
# "-lt" - флаг, указывающий "если меньше чем (lt - lower then)"

echo "Недостаточно аргументов. Введите имя. Пример $0 Vasya" 
exit 1
fi
echo "Hello, $1!"