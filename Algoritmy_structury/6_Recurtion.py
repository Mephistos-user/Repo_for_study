# Рекурсия

# Факториал обычный
# n = 5
# fact = 1
# for i in range(1, n + 1, 1):
#     fact = fact * i
# print(f"Факториал {n} = {fact}")

# Факториал рекурсивный
# def fact_r(n):
#     if n <= 1: # точка выхода
#         return 1
#     return n * fact_r(n - 1)

# n = 5
# fact = fact_r(n)
# print(f"Факториал {n} = {fact}")

# ряд Фибоначи обычный (быстро)
# fib1 = fib2 = 1
# print(fib1, fib2, end=" ")
# n = 5
# for i in range(2, n):
#     summa = fib2 + fib1
#     fib1 = fib2
#     fib2 = summa
#     print(summa, end=" ")

# ряд Фибоначи рекурсивный (медлено)
# def fibonacci(n):
#     if n <= 2:
#         return 1
#     return fibonacci(n - 1) + fibonacci(n - 2)

# print(fibonacci(10))