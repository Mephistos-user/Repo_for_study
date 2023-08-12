n = int(input())
lst = map(int, input().split())
s = set()
for i in lst:
    if (i in s):
        print(i, " - Yes")
    else:
        s.add(i)
        print(i, " - No")
