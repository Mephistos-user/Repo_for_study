word = input()

cnt_a, cnt_e, cnt_i, cnt_o, cnt_u = 0, 0, 0, 0, 0

all = 0
sogl = 0
glas = 0

for j in word:
    all +=1
    if (j == 'a'):
        cnt_a += 1
    elif (j == 'e'):
        cnt_e += 1
    elif (j == 'i'):
        cnt_i += 1
    elif (j == 'o'):
        cnt_o += 1
    elif (j == 'u'):
        cnt_u += 1
glas += cnt_a + cnt_e + cnt_i + cnt_o + cnt_u
sogl = all - glas

print("Гласные = ", glas)
print("Согласные = ", sogl)

if (cnt_a > 0):
    print("a = ", cnt_a)
else:
    print("a = False")

if (cnt_e > 0):
    print("e = ", cnt_e)
else:
    print("e = False")

if (cnt_i > 0):
    print("i = ", cnt_i)
else:
    print("i = False")

if (cnt_o > 0):
    print("o = ", cnt_o)
else:
    print("o = False")

if (cnt_u > 0):
    print("u = ", cnt_u)
else:
    print("u = False")