#первый список
n1 = int(input())
lst1 = []
for i in range(n1):
    tmp1 = int(input())
    lst1.append(tmp1)
#второй список
n2 = int(input())
lst2 = []
for i in range(n2):
    tmp2 = int(input())
    lst2.append(tmp2)
#преобразуем списки в множества
s1 = set(lst1)
s2 = set(lst2)

res = s1 & s2
print(len(res))

