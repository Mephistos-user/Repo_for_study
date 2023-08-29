# Binar search
# Бинарный поиск
import random

n = 40
arr = list()
for i in range(n):
    number = random.randint(1, 100)
    arr.append(number)

to_search = random.randint(1, 100)
answer = -1
########################################################
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
            


########################################################
print(arr)
print(to_search)
print("--------")

if answer != -1:
    print(f"Элемент в списке был, его индекс: {answer}")
else:
    print("Элемента в списке не было")