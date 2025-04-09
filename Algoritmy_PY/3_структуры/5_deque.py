from collections import deque
d = deque([i for i in range(5)], maxlen=7)
d.append(5)
d.appendleft(6)
d.extend([7, 8, 9])
d.extendleft([10, 11])
print(d)
