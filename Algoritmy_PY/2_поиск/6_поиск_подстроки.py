# Find string in string
# Поиск подстроки в строке

str_where = 'hello world'
str_find = ' wor'

index_where = 0
index_find = 0
len_where = len(str_where)
len_find = len(str_find)

while (index_where <= len_where - len_find and
       index_find < len_find):
    # если совпали буквы продвигаемся по обеим строкам
    if str_where[index_where + index_find] == str_find[index_find]:
        index_find += 1
    # иначе двигаемся по строке (+1), начиная с 0 символа подстроки
    else:
        index_where += 1
        index_find = 0

print(f"'{str_where}'")
print(f"'{str_find}'")
if index_find == len_find:
    print(f"Такая строка есть. Её начало тут - {index_where}")
else:
    print("Такой подстроки в исходной строке нет")