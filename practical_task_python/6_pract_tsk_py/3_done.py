a = int(input())
b = int(input())
c = ""
for i in range(a, b + 1):
    if (i % 2 == 0):
        c += str(i) + " "
print(c)