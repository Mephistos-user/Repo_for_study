n = 130
for age in range(n):
    if ((age >= 11) and (age <= 14)
    or((age % 100 >= 11) and (age % 100 <=14))):
        print(age, ' лет')
    elif (age % 10 == 1):
        print(age, ' год')
    elif ((age % 10 >= 2) and (age % 10 <= 4)):
        print(age, ' года')
    else:
        print(age, ' лет')

