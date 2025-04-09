# Merge sort
# Сортировка слиянием
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
def merge(arrl, arrr):
    sorted_arr = list()
    current_left = 0
    current_right = 0

    lenl = len(arrl)
    lenr = len(arrr)
    for i in range(lenl + lenr):
        if current_left < lenl and current_right < lenr:
            if arrl[current_left] < arrr[current_right]: # arrl[current_left] > arrr[current_right] - по убыванию
                sorted_arr.append(arrl[current_left])
                current_left += 1
            else:
                sorted_arr.append(arrr[current_right])
                current_right += 1
        else:
            if current_left == lenl:
                for j in range(current_right, lenr):
                    sorted_arr.append(arrr[j])
            else:
                for j in range(current_left, lenl):
                    sorted_arr.append(arrl[j])
            break
    return sorted_arr

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left_side = list()
    right_side = list()

    for i in range(0, mid):
        val = arr[i]
        left_side.append(val)
    # тоже самое с помощью срезов Python
    # left_side = arr[:mid]
    for i in range(mid, len(arr)):
        val = arr[i]
        right_side.append(val)
    # тоже самое с помощью срезов Python
    # right_side = arr[mid:]

    left_side = merge_sort(left_side)
    right_side = merge_sort(right_side)

    result = merge(left_side, right_side)
    return result


########################################################
arr = merge_sort(arr)
print("-------")
print("Sorted:")
print(arr)