n = int(input('Введите число: '))

#функция факториала
def factorial(x):
    f = 1
    for i in range (1, x + 1):
        f *= i
    return f

#список факториалов
lst = list()
if factorial(n) == 1:
    lst.append(1)
else:
    for i in range(factorial(n), 0, -1):
        lst.append(factorial(i))

print(lst)