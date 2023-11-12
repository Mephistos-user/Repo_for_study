import random

row = int(input('Введите количество строк: '))
column = int(input('Введите количество столбцов: '))
matrix_1 = [[]]
matrix_2 = [[]]
matrix_3 = [[]]
#функция создания матрицы
def matrix(x, y):
    m = [[random.randint(-99, 99) for j in range(y)] for i in range(x)]
    return m
#функция вывода матрицы
def output_matrix(lst):
    for i in lst:
        print(*i)

#функция сложения матриц
def addition_matrix(x, y):
   # m = [[]]
    #for i in range(x):
       # for j in range(y):
    m = [[matrix_1[i][j] + matrix_2[i][j] for j in range(y)] for i in range(x)]
    return m

matrix_1 = matrix(row, column)
matrix_2 = matrix(row, column)
matrix_3 = addition_matrix(row, column)

print('Матрица_1: ')
output_matrix(matrix_1)
print('Матрица_2: ')
output_matrix(matrix_2)
print('Результирующая матрица_3: ')
output_matrix(matrix_3)