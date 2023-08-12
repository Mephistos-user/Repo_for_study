my_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]

def lst(l, n = 0):
    if n >= len(l):
        return print('Конец списка')
    print(l[n])
    lst(l, n+1)

lst(my_list)