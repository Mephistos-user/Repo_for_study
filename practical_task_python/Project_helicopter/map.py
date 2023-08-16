from utils import randbool
from utils import randcell
from utils import randcell2
# 0 - поле 🟩
# 1 - дерево 🌳
# 2 - река 🌊 
# 3 - госпиталь 🏥
# 4 - апгрейд-шоп 🏪
# -  вертолет 🚁
# - 🔥
# - ⚡
# - ⛅ 🌩️ ⛈️ 
# - 💗
# - 🛢️
# - 💰
# - 🟧 🟫 🔳

CELL_TYPES = "🟩🌳🌊🏥🏪"

class Map():
    def generate_river(self, l):
        rc = randcell(self.w, self.h)
        #print(rc)
        rx, ry = rc[0], rc[1]
        if (self.check_bounds(rx, ry)):
            self.cells[rx][ry] = 2
        #self.cells[rc[0]][rc[1]] = 2
        while l > 0:
            rc2 = randcell2(rx, ry)
            rx2, ry2 = rc2[0], rc2[1]
            if (self.check_bounds(rx2, ry2)):
                self.cells[rx2][ry2] = 2
                rx, ry = rx2, ry
                l -= 1

    def generate_forest(self, r, mxr):# r - отсечка, mxr - диапазон рандома
        for ri in range(self.h):
            for ci in range(self.w):
                if randbool(r, mxr):
                    self.cells[ri][ci] = 1

    def print_map(self):
        print('🔳' * (self.w + 2))#верхняя рамка(вставить картинку рамки)
        for row in self.cells:
            print('🔳', end="")#левая рамка
            for cell in row:
                if (cell >= 0 and cell < len(CELL_TYPES)):
                    print(CELL_TYPES[cell], end="")
                
                
                #if cell == 0:
                 #   print('0', end="")# вместо цифр вставить картинки
                #elif cell == 1:
                 #   print('1', end="")
                #elif cell == 2:
                 #   print('2', end="")
                #elif cell == 3:
                 #   print('3', end="")
                #elif cell == 4:
                 #   print('4', end="")               
            print('🔳')#правая рамка
        print('🔳' * (self.w + 2))#нижняя рамка

    def check_bounds(self, x, y):
        if (x < 0 or y < 0 or x >= self.h or y >= self.w):#проверяем попадание клетки в размер пля
            return False
        return True

    def __init__(self, w, h):
        self.w = w
        self.h = h
        self.cells = [[0 for i in range(w)] for j in range(h)]


tmp = Map(20,12)
#tmp.cells[1][1] = 1
#tmp.cells[2][2] = 2
#tmp.cells[3][3] = 3

tmp.generate_forest(3, 10)
#if (tmp.check_bounds(2, 3)):
#    print("YES")
tmp.generate_river(8)
tmp.generate_river(4)
tmp.generate_river(6)
tmp.cells[4][4] = 4
tmp.cells[7][7] = 3
tmp.print_map()
