#!/bin/bash

# создаем дирректорию для скачивания "/attachments":
mkdir -p attachments

# циклом проходим до 20 иттераций для команды curl
for (( i=1; i <= 20; i++ ))
do

    # скачиваем и сохраняем с заданным названием "img$i.jpg":    
    curl https://picsum.photos/800/400 -L > attachments/img$i.jpg

    # или:
    #curl -L https://picsum.photos/800/400 --output attachments/img$i.jpg
    
# сайт работает только с VPN!

done