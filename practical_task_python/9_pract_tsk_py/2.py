import collections

id = 0
pets = dict()

def create():
    last = collections.deque(pets, maxlen=1)[0]
    id = last
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
        pet = get_pet(id)
        n = pet.keys
        v = pet[name]['Вид питомца']
        age = pet[name]['Возраст питомца']
        h = pet[name]['Имя владельца']

    print(f'Это {v}, по кличке \"{n}\". Возраст питомца: {age}, {get_suffix(age)}. Имя владельца: {h}')

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
    for i in pets.keys:
        print(get_pet(i))

