pets = dict()

print("Введите кличку питомца")
name = input()
pets[name] = dict()

print("Введите вид питомца:")
pets[name]['Вид питомца'] = input()

print("Введите возраст питомца:")
pets[name]['Возраст питомца'] = int(input())

print("Введите имя владельца")
pets[name]['Имя владельца'] = input()

year = ''
if (pets[name]['Возраст питомца'] % 10 == 1):
    year = 'год'
elif ((pets[name]['Возраст питомца'] % 10 >= 2) and (pets[name]['Возраст питомца'] % 10 <= 4)):
    year = 'года'
else:
    year = 'лет'

print("Это ", pets[name]['Вид питомца']," по кличке \"", name, "\". Возраст питомца: ", pets[name]['Возраст питомца'], ' ', year, '.', " Имя владельца: ", pets[name]['Имя владельца'],sep = "")