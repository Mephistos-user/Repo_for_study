pets = dict()

print("Введите кличку питомца")
name = input()
pets[name] = dict()

print("Введите вид питомца:")
animal = input()
pets[name]['Вид питомца'] = animal

print("Введите возраст питомца:")
age = int(input())
pets[name]['Возраст питомца'] = age

print("Введите имя владельца")
host_name = input()
pets[name]['Имя владельца'] = host_name

year = ''
if (age % 10 == 1):
    year = 'год'
elif ((age % 10 >= 2) and (age % 10 <= 4)):
    year = 'года'
else:
    year = 'лет'

print("Это ", pets[name]['Вид питомца']," по кличке \"", name, "\". Возраст питомца: ", pets[name]['Возраст питомца'], ' ', year, '.', " Имя владельца: ", pets[name]['Имя владельца'],sep = "")