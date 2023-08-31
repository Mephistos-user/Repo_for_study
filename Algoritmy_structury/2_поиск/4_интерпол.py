# Interpolation search
# Интерполяционный поиск
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
left = 0
right = len(arr) - 1
while (left <= right and
       to_search >= arr[left] and
       to_search <= arr[right]):
    
    part1 = float(right - left) / (arr[right] - arr[left])
    #print('part1')
    #print(part1)
    part2 = to_search - arr[left] # на сколько искомое число больше 
                                  # числа левой границы
    #print('part2')
    #print(part2)
    # Поскольку индекс должен быть целым числом
    # мы преобразуем part1 * part2 в целое
    index = left + int(part1 * part2)
    #print('index')
    #print(index)

    if arr[index] == to_search:
        answer = index
        break
    if arr[index] < to_search:
        left = index + 1
    else: 
        right = index - 1

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