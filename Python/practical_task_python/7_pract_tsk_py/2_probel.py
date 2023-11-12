string = input()
new_string = ''

for i in range (len(string)):
    if (i != (len(string) - 1)):
        if (string[i] == ' ' and (string[i + 1] == ' ')):
            new_string += ''
        else:
            new_string += string[i]
    else:
        new_string += string[i]
            
print (new_string)