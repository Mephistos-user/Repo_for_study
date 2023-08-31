# Binar search
# Бинарный поиск
import random
from time import time

n = 4_000_000
start = time()
arr = list()
for i in range(n):
    number = random.randint(1, 100)
    arr.append(number)

to_search = random.randint(1, 100)
answer = -1

end = time()
print(end - start)
########################################################
start = time()
arr.sort() # сортировка ОБЯЗАТЕЛЬНА!!!
first = 0
last = n - 1
while first <= last and answer == -1:
    middle_index = (first + last) // 2

    if arr[middle_index] == to_search:
        answer = middle_index
    else:
        if arr[middle_index] > to_search:
            last = middle_index - 1
        else:
            first = middle_index + 1
            
end = time()
print(end - start)
########################################################
# print(arr)
print(to_search)
print("--------")

if answer != -1:
    print(f"Элемент в списке был, его индекс: {answer}")
else:
    print("Элемента в списке не было")