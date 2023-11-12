a = 5
a = 5 + 6
print(a)
b = 6 - 7
print(b)
c = 4 * 5
print(c)
d = 7 // 5#целочисленное деление
print(d)
e = 7 % 5#деление с остатком
print(e)
f = 2** 5#степень

g = 5
g +=10
print(g)

h = input()#вводит как строку
print(h*5)#55555 - строка
i = int(input())#преобразование в целочисленное
j = int(input())
print(i*j)
#первый способ преобразования
k, l = map(int, input().split())#map - преобразует к int все значения строк, split - разделение строки по пробелам на несколько строк
print(k*l)
#второй способ преобразования
m, n , o = input().split()
m = int(m)
n = int(n)
o = int(o)
print(m + n + o)

#сумма двух введенных чисел первый способ
a = int(input())
b = int(input())
c = a + b
print(c)
#сумма двух введенных чисел второй способ
a, b = map(int, input().split())
c = a + b
print(c)
#приоритет операций
c = (a + b) * 4
print(c)

a = 10
b = 3
print(a//b)# = 3
print(a/b)# = 3.333333

a = float(input())
print(a)
