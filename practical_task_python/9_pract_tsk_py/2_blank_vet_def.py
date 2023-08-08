import collections

id = 0
pets = dict()
last = 0
def create():
    #last = collections.deque(pets, maxlen=1)[0]
    #id = last
    pets[id] = dict()
    
    name = input('Введите кличку питомца: ')
    pets[id][name] = dict()

    pets[id][name]['Вид питомца'] = input('Введите вид питомца: ')

    pets[id][name]['Возраст питомца'] = int(input('Введите возраст питомца: '))

    pets[id][name]['Имя владельца'] = input('Введите имя владельца: ')

def read():
    id = int(input('Введите идентификатор: '))
    if get_pet(id) == False:
        return print(f'Питомца с ID = {id} нет в базе!')
    else:
        pet = dict(get_pet(id))
        k = pet.keys
        #v = pet.values

        v = pet[k[0]]['Вид питомца']
        age = pet[k[0]]['Возраст питомца']
        h = pet[k[0]]['Имя владельца']
    #print(f'Это {v[1]}, по кличке \"{k[0]}\". Возраст питомца: {v[1]}, {get_suffix(v[1])}. Имя владельца: {v[2]}')
    print(f'Это {v}, по кличке \"{k[0]}\". Возраст питомца: {age}, {get_suffix(age)}. Имя владельца: {h}')

def update():
    id = int(input('Введите идентификатор: '))
    if get_pet(id) == False:
        return print(f'Питомца с ID = {id} нет в базе!')
    else:
        name = input('Введите кличку питомца: ')
    
        pets[id][name]['Вид питомца'] = input('Введите вид питомца: ')

        pets[id][name]['Возраст питомца'] = int(input('Введите возраст питомца: '))

        pets[id][name]['Имя владельца'] = input('Введите имя владельца: ')
def delete():
    id = int(input('Введите идентификатор: '))
    if get_pet(id) == False:
        return print(f'Питомца с ID = {id} нет в базе!')
    else:
        pets.pop(id)

def get_pet(id):

    # функция, с помощью которой вы получите информацию о питомце в виде словаря
    # сделайте проверку, если питомца с таким ID нету в нашей "базе данных"
    # верните в этом случае False
    # а если питомец всё же есть в "базе данных" - верните информацию о нём
    # выглядеть это может примерно так:
    return pets[id] if id in pets.keys() else False

def get_suffix(age):
    #year = ''
    if (age % 10 == 1):
        return 'год'
    elif ((age % 10 >= 2) and (age % 10 <= 4)):
        return 'года'
    else:
        return 'лет'


def pets_list():
    for i in pets:
        print(get_pet(i))

create()
read()
pets_list()
