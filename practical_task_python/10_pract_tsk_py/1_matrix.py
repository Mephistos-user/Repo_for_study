import random

row = int(input('Введите количество строк: '))
column = int(input('Введите количество столбцов: '))
matrix_1 = [[]]
matrix_2 = [[]]
matrix_3 = [[]]
#функция создания матрицы
def matrix(x, y):
    m = [[random.randint(-99, 99) for j in range(x)] for i in range(y)]
    return m
#функция вывода матрицы
def output_matrix(lst):
    for i in lst:
        print(*i)

#функция сложения матриц
def addition_matrix(x, y):
    for i in row:
        for j in column:
            m[i][j] = matrix_1[i][j] + matrix_2[i][j]
    return m

matrix_1 = matrix(row, column)
matrix_2 = matrix(row, column)
matrix_3 = addition_matrix(row, column)

print('Матрица_1:\n', output_matrix(matrix_1), '\n')
print('Матрица_2:\n', output_matrix(matrix_2), '\n')
print('Результирующая матрица_3:\n', output_matrix(matrix_1), '\n')