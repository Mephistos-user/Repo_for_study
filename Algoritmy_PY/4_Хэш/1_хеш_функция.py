def hash(num):
    snum = str(num)
    if len(snum) <= 4:
        if len(snum) < 4:
            snum = snum.rjust(4, '0') # rjust - вставляет значение значение '0' в строку snum слева до 4х символов
                                      # ljust - вставляет значение значение '0' в строку snum справа до 4х символов
        return snum
    result = ''
    for i in range(0, len(snum) - 1, 2):
        left = snum[i]
        right = snum[i + 1]
        left = int(left)
        right = int(right)
        result += str(left + right)
    return hash(result)


print(hash(78563864679494))