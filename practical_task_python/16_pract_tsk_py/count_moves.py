x = 0
y = 0
s = 15

x2 = 18
y2 = 11

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
start_iter1 = 0
end_iter1 = 0
iter1 = 0
start_iter2 = 0
end_iter2 = 0
iter2 = 0
delta1 = 0
delta2 = 0

if s <= delta_x and s <= delta_y:
    start_iter1 = 1
    end_iter1 = delta_x + 1
    iter1 = 1
    delta1 = delta_x
    start_iter2 = 1
    end_iter2 = delta_y + 1
    iter2 = 1
    delta2 = delta_y
elif s > delta_x and s > delta_y and delta_x >= delta_y:
    start_iter1 = 1
    end_iter1 = delta_x + 1
    iter1 = 1
    delta1 = delta_x
    start_iter2 = 1
    end_iter2 = delta_y + 1
    iter2 = 1
    delta2 = delta_y
elif s > delta_x and s > delta_y and delta_x < delta_y:
    start_iter1 = 1
    end_iter1 = delta_y + 1
    iter1 = 1
    delta1 = delta_y
    start_iter2 = 1
    end_iter2 = delta_x +1
    iter2 = 1
    delta2 = delta_x
elif s <= delta_x and s > delta_y:
    start_iter1 = 1
    end_iter1 = delta_x + 1
    iter1 = 1
    delta1 = delta_x
    start_iter2 = 1
    end_iter2 = delta_y + 1
    iter2 = 1
    delta2 = delta_y
elif s > delta_x and s <= delta_y:
    start_iter1 = 1
    end_iter1 = delta_y +1
    iter1 = 1
    delta1 = delta_y
    start_iter2 = 1
    end_iter2 = delta_x + 1
    iter2 = 1
    delta2 = delta_x
else: print('Проверь условие!')

for i in range(start_iter1, end_iter1, iter1):
    
    res_x.append(i)#возможная длина шага
    optim_x.append(delta1 // i)#количество шагов по длине шага
    ostat_x.append(delta1 % i)#оставшееся расстояние

    if i == s and delta1 % i == 0 and delta1 >= i:
        dey_x.append(delta1 // i)
    elif i > delta1:
        dey_x.append(abs(s - delta1) + 1)
    elif i == delta1 and i != s:
        dey_x.append(abs(s - delta1) + 1)
    #elif i == s:
     #   dey_x.append((delta1 // i) + (i - (delta1 % i)) + 1)
    elif delta1 % i == 0:
        dey_x.append(abs(i - s) + (delta1 // i))
    else:
        dey_x.append(abs(i - s) + 1 + (delta1 // i))

print('Длинна шага x ', res_x) 
print('Деление без остатка x ', optim_x)
print('Остаток от деления x ', ostat_x)
print('Количество действий x', dey_x)
print('минимум действий x ', min(dey_x ))

ind = 0
lst_ind_min = []
for i in dey_x:
    if i == min(dey_x):
        lst_ind_min.append(ind)
    ind += 1
print('список мин индексов x ', lst_ind_min)
step_max_of_min = 0
for i in lst_ind_min:
    #if res_x[i] <= delta2:
        print(f'индекс = {i} : длина шага {res_x[i]}')


for n in lst_ind_min:
    s = res_x[n]
    print(f'Начальная длина шага y {s}\n')
    
    for i in range(start_iter2, end_iter2, iter2):
   
        res_y.append(i)#возможная длина шага
        optim_y.append(delta2 // i)#количество шагов по длине шага
        ostat_y.append(delta2 % i)#оставшееся расстояние

        if i == s and delta2 % i == 0 and delta2 >= i:
            dey_y.append(delta2// i)
        elif i > delta2:
            dey_y.append(abs(s - delta2) + 1)
        elif i == delta2 and i != s:
            dey_y.append(abs(s - delta2) + 1)
        #elif i == s:
         #   dey_y.append((delta2 // i) + (i - (delta2 % i)) + 1)
        elif delta2 % i == 0:
            dey_y.append(abs(i - s) + (delta2 // i))

        else:
            dey_y.append(abs(i - s) + 1 + (delta2 // i))    


    print('Длинна шага y ', res_y)
    res_y.clear() 
    print('Деление без остатка y ', optim_y)
    optim_y.clear()
    print('Остаток от деления y ', ostat_y)
    ostat_y.clear()
    print('Количество действий y ', dey_y)
    print('минимум действий y ', min(dey_y))
    print('индекс в спискe минимального кол действ y ', dey_y.index(min(dey_y)), end='\n\n')
    dey_y.clear()

