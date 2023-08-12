#Задание №3

#На берегу реки стояли n рыбаков, все они хотели перебраться на другой берег.
m = int(input())# мах масса в лодке
n = int(input())# количество рыбаков
lst = []# список веса рыбаков


for i in range(n):
    lst.append(int(input()))
#список веса перевозимого в каждой лодке
on_board = []
#сортируем по возрастанию
lst.sort()
#реверс
lst.reverse()

while (len(lst) > 0):
    tmp_light = lst[-1]#самый легкий
    tmp_hard = lst[0]#самый тяжелый
    #если легкий и тяжелый помещаются в лодке, сохряняем их суммарный вес в списке on_board и 
    #удаляем из общего списка
    if (tmp_hard + tmp_light <= m):

        on_board.append(tmp_hard + tmp_light)

        if (len(lst) > 0):
            lst.pop()
        if (len(lst) > 0):    
            lst.pop(0)
    #если не помещаются записываем только тяжелого и удаляем его вес из общего списка
    else:
        
        on_board.append(tmp_hard)

        if (len(lst) > 0):
            lst.pop(0)

print(len(on_board))#подсчитываем количество рейсов