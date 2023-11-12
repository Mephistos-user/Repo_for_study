s = 6
x = 0
x2 = 15
y = 0
y2 = 5

if s <= abs(x - x2) and s <= abs(y - y2):
    if abs(x - x2) % s == 0 and abs(y - y2) % s == 0:
        print((abs(x - x2) + abs(y - y2)) // s)
    elif abs(x - x2) % s != 0 and abs(y - y2) % s != 0:
        print((abs(x - x2) // s)  + (abs(y - y2) // s) + 2)
    else:
        print((abs(x - x2) // s)  + (abs(y - y2) // s) + 1)
elif s > abs(x - x2) and s > abs(y - y2):
    print(2)
elif s <= abs(x - x2) and s > abs(y - y2):
    if abs(x - x2) % s == 0:
        print((abs(x - x2) // s) + 1)
    else:
        print((abs(x - x2) // s) + 2)
elif s > abs(x - x2) and s <= abs(y - y2):
    if abs(y - y2) % s == 0:
        print((abs(y - y2) // s) + 1)
    else:
        print((abs(y - y2) // s) + 2)