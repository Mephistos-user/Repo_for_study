# Сортировка вставкой
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
for i in range(1, n):
    val = arr[i]# проверяемое значение в текущей иттерации
    j = i - 1# индекс числа слева от проверяемого
    while val < arr[j] and j >= 0:# по убыванию val > arr[j]
        arr[j + 1] = arr[j]# смещаем вправо
        j -= 1
    arr[j + 1] = val# записываем проверяемое значение в ячейку правее 
                    # не прошедшего проверку условия
       
########################################################

print("Sorted:")
print(arr)