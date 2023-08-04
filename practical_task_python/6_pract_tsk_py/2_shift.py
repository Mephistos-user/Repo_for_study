n = int(input())
lst = list(map(int, input().split()))

lst.insert(0, lst[-1])
lst.pop()

print(*lst)