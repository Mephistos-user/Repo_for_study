# Cocktail sort
# Shuffle sort
# шейкерная/коктельная сортировка
# сортировка перемешиванием
# двунаправленная сортировка
import random

n = 20
arr = list()
for i in range(n):
    number = random.randint(1, 100)
    arr.append(number)

print("Not sorted:")
print(arr)
print("-------")

########################################################
left_index = 0
rigth_index = n - 1
is_sorted = True# флаг проверки были ли сделаны перестановки в текущем проходе
while left_index <= rigth_index:
    for i in range(left_index, rigth_index):
        left = arr[i]
        rigth = arr[i + 1]
        if left > rigth:# если условие left < rigth то сортировка по убыванию 
            is_sorted = False# если изменения есть то флаг False
            arr[i] = rigth
            arr[i + 1] = left
    rigth_index = rigth_index - 1
    print(arr)
    for i in range(rigth_index, left_index, -1):
        rigth = arr[i]
        left = arr[i - 1]
        if left > rigth:# если условие left < rigth то сортировка по убыванию 
            is_sorted = False# если изменения есть то флаг False
            arr[i] = left
            arr[i - 1] = rigth
    left_index = left_index + 1
    print(arr)
    if is_sorted is True:
        break
    else:
        is_sorted = True

########################################################

print("Sorted:")
print(arr)