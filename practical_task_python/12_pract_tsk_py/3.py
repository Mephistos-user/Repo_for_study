x = 0
y = 0
s = 5

x2 = 8
y2 = 8

delta_x = abs(x2 - x)
delta_y = abs(y2 - y)

res_x = []
optim_x = []
ostat_x = []
dey_x = []
res_y = []
res = 0

for i in range(s, delta_x + 1):
    #if delta_x % i == 0:
        res_x.append(i)
#for i in res_x:
#    optim_x.append(delta_x // i)
for i in range(s, delta_x + 1):
    optim_x.append(delta_x // i)#количество шагов по длине шага
    ostat_x.append(delta_x % i)#оставшееся расстояние
for i in res_x:
    if i == 1:
        dey_x.append(delta_x)
    else:
        dey_x.append((delta_x // i) + (i - 1) + (delta_x % i))        


print('Длинна шага ', res_x)

print('Деление без остатка ', optim_x)
print('Остаток от деления ', ostat_x)
#dey_x.sort()
print('Количество действий', dey_x)
