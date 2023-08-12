x = 0
y = 0
s = 1

x2 = -8
y2 = 12

delta_x = abs(x2 - x)
delta_y = abs(y2 - y)

res_x = []
optim_x = []
ostat_x = []
dey_x = []
res_y = []
optim_y = []
ostat_y = []
dey_y = []
#res = 0
# if s <= delta_x: 
for i in range(s, delta_x + 1):
    #if delta_x % i == 0:
    res_x.append(i)#возможная длина шага
#for i in res_x:
#    optim_x.append(delta_x // i)

    optim_x.append(delta_x // i)#количество шагов по длине шага
    ostat_x.append(delta_x % i)#оставшееся расстояние
#for i in range(s, delta_x +1):
    if delta_x <= 3: #???
        dey_x.append(delta_x)
    elif i == s and delta_x % i == 0:
        dey_x.append(delta_x // i)
    elif i == s:
        dey_x.append((delta_x // i) + 1 + (i - (delta_x % i)))
    elif delta_x % i == 0:
        dey_x.append((i - s) + (delta_x // i))
    else:
        dey_x.append((i - s) + (delta_x // i) + 1 + (i - (delta_x % i)))      


print('Длинна шага x ', res_x) 
print('Деление без остатка x ', optim_x)
print('Остаток от деления x ', ostat_x)
print('Количество действий x', dey_x)
print('минимум действий x ', min(dey_x ))
print('индекс в спискe минимального кол действ x ', dey_x.index(min(dey_x)))



ind = 0
lst_ind_min = []
for i in dey_x:
    if i == min(dey_x):
        lst_ind_min.append(ind)
    ind += 1
print('список мин индексов x ', lst_ind_min)
step_max_of_min = 0
for i in lst_ind_min:
    if res_x[i] <= delta_y:
        if res_x[i] >= step_max_of_min:
            step_max_of_min = res_x[i]

            print(f'индекс = {i} : длина шага {res_x[i]}')
print(f'мах длина шага {step_max_of_min} из мин х с индексом {res_x.index(step_max_of_min)}')

#s = step_max_of_min
#print ('Начальная длина шага для y от x ', s)
for n in lst_ind_min:
    print(f'Длина шага = {res_x[n]}, результат: ')

    for i in range(res_x[n], delta_y + 1):
        #if delta_x % i == 0:
        res_y.append(i)#возможная длина шага

        optim_y.append(delta_y // i)#количество шагов по длине шага
        ostat_y.append(delta_y % i)#оставшееся расстояние

        if delta_y <= 3: #???
            dey_y.append(delta_y)
        elif i == s and delta_y % i == 0:
            dey_y.append(delta_y // i)
        elif i == s:
            dey_y.append((delta_y // i) + 1 + (i - (delta_y % i)))
        elif delta_y % i == 0:
            dey_y.append((i - s) + (delta_y // i))
        else:
            dey_y.append((i - s) + (delta_y // i) + 1 + (i - (delta_y % i)))      


    print('Длинна шага y ', res_y)
    res_y.clear 
    print('Деление без остатка y ', optim_y)
    optim_y.clear
    print('Остаток от деления y ', ostat_y)
    ostat_y.clear
    print('Количество действий y ', dey_y)
    print('минимум действий y ', min(dey_y))
    print('индекс в спискe минимального кол действ y ', dey_y.index(min(dey_y)), end='\n\n')
    dey_y.clear

