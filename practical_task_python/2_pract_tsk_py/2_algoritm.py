print("Введите пятизначное число:" )
a = int(input())

a1 = a % 10
a10 = (a % 100 - a1) // 10
a100 = (a % 1000 - a10 * 10 - a1) // 100
a1000 = (a % 10000 - a100 * 100 - a10 * 10 - a1) // 1000
a10000 = a // 10000

print("Результат = ", (a10 ** a1) * a100 / (a10000 - a1000))