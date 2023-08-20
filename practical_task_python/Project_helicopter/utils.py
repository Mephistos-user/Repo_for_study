from random import randint as rand

# функция рандомного получения True или False
def randbool(r, mxr):
    t = rand(0, mxr)
    return(t <= r)

# функция создания рандомных координат в поле (w, h)
def randcell(w, h):
    tw = rand(0, w - 1)
    th = rand(0, h - 1)
    return (th, tw)

# функция рандомного смещения от точки (x, y)
# 0 - наверх, 1 - направо, 2 - вниз, 3 - налево
def randcell2(x, y):
    move = [[-1, 0], [0,1],[1,0],[0,-1]]
    t = rand(0, 3)
    dx, dy = move[t][0], move[t][1]
    return (x + dx, y + dy)
