#!/bin/bash

# циклом проходим до 20 иттераций для команды rm
for (( i=1; i <= 20; i++ ))
do
# удаляем 20 фотографий с названиями img1.jpg - img20.jpg
    rm attachments/img$i.jpg
done

# если нужно удалить весь каталог с содержимым:
#rm -r attachments 