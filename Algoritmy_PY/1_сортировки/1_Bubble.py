# Сортировка пузырьком
import random

n = 10
arr = list()
for i in range(n):
    number = random.randint(1, 100)
    arr.append(number)

print("Not sorted:")
print(arr)
print("-------")

########################################################
itter = n - 1 # иттератор вложенного цикла
is_sorted = True # флаг проверки были ли сделаны перестановки в текущем проходе
for i in range(n):
    print(itter)
    for j in range(itter):
        left = arr[j]
        rigth = arr[j + 1]
        if left > rigth:# если условие left < rigth то сортировка по убыванию 
            arr[j] = rigth
            arr[j + 1] = left
            is_sorted = False# если изменения есть то флаг False
    itter -= 1 # уменьшаем размер иттерации во вложенном цикле,
               # т.к. крайнее правое значение по окончанию прохода проверять уже не нужно
    print(arr)
    if is_sorted is True:
        break # выходим из цикла если в ходе прохода изменений в массиве не было
    else:
        is_sorted = True

        # Еще один вариант:
        #if arr[j] > arr[j + 1]:
        #    temp = arr[j]
        #    arr[j] = arr[j + 1]
        #    arr[j + 1] = temp
########################################################
print("-------")
print("Sorted:")
print(arr)