# Eratosthenes Sieve
# Решето Эратосфена
import random
# поиск всех натуральных чисел до 100
n = 100
arr = []
for i in range(n):
    arr.append(i)

arr[1] = 0
########################################################

for i in range(n):
    if arr[i] != 0:
        j = i * 2
        while j < n:
            arr[j] = 0
            j += i         

########################################################

for elem in arr:
    if elem != 0:
        # end=' '
        # чтобы не переносить значение на новою строку
        print(elem, end=' ')