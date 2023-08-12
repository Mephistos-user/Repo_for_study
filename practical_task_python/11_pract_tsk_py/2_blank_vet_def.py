import collections

id = 0
pets = {0:{}}

def create():#done
    last = collections.deque(pets, maxlen=1)[0]#не работает с пустым словарем pets
    id = last + 1
    pets[id] = dict()
    
    name = input('Введите кличку питомца: ')
    pets[id][name] = dict()

    pets[id][name]['Вид питомца'] = input('Введите вид питомца: ')

    pets[id][name]['Возраст питомца'] = int(input('Введите возраст питомца: '))

    pets[id][name]['Имя владельца'] = input('Введите имя владельца: ')
    if get_pet(0) != False:
        pets.pop(0)

def read():#done
    id = int(input('Введите идентификатор: '))
    if get_pet(id) == False:
        return print(f'Питомца с ID = {id} нет в базе!')
    else:
        pet = dict(get_pet(id))
        name = ''
        for key in pet.keys():
            name = key
        
        v = pet[name]['Вид питомца']
        age = pet[name]['Возраст питомца']
        h = pet[name]['Имя владельца']
    
    print(f'Это {v}, по кличке \"{name}\". Возраст питомца: {age} {get_suffix(age)}. Имя владельца: {h}')

def update():#done
    id = int(input('Введите идентификатор: '))
    if get_pet(id) == False:
        return print(f'Питомца с ID = {id} нет в базе!')
    else:
        name = input('Введите кличку питомца: ')
        pets[id] = dict()
        pets[id][name] = dict()
        pets[id][name]['Вид питомца'] = input('Введите вид питомца: ')

        pets[id][name]['Возраст питомца'] = int(input('Введите возраст питомца: '))

        pets[id][name]['Имя владельца'] = input('Введите имя владельца: ')
def delete():#done
    id = int(input('Введите идентификатор: '))
    if get_pet(id) == False:
        return print(f'Питомца с ID = {id} нет в базе!')
    else:
        pets.pop(id)

def get_pet(id):#done

    return pets[id] if id in pets.keys() else False

def get_suffix(age):#done
    
    if (((age >= 11) and (age <= 14)) or ((age % 100 >= 11) and (age % 100 <=14))):
        return ' лет'
    elif (age % 10 == 1):
        return ' год'
    elif ((age % 10 >= 2) and (age % 10 <= 4)):
        return ' года'
    else:
        return ' лет'

def pets_list():#done
    for i in pets:
        print(get_pet(i))

print(f'Список доступных команд:\n\n'
      f'create - создать новую запись в базе;\n'
      f'read   - вывести данные о питомце;\n'
      f'update - обновить запись о питомце;\n'
      f'delete - удалить запись об питомце;\n'
      f'pets   - вывести все записи из базы;\n'
      f'stop   - выйти из программы.\n\n')

command = ''

while command != 'stop':
    command = input('Введите команду: ')
    
    if command == 'create': create()
    elif command == 'read': read()
    elif command == 'update': update()
    elif command == 'delete': delete()
    elif command == 'pets': pets_list()
    elif command == 'stop': exit
    else: print('Не правильная команда!') 