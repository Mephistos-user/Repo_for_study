# 0 - поле
# 1 - дерево
# 2 - река
# 3 - госпиталь
# 4 - апгрейд-шоп
#
#

class Map:
    def print_map(self):
        for row in self.cells:
            for cell in row:
                if cell == 0:
                    print('0', end="")# вместо цифр вставить картинки
                elif cell == 1:
                    print('1', end="")
                elif cell == 2:
                    print('2', end="")
                elif cell == 3:
                    print('3', end="")
                elif cell == 4:
                    print('4', end="")               
           # print()

    #def generate_rivers():

    #def generate_forest():

    def __init__(self, w, h):
        self.w = w
        self.h = h
        self.cells = [[0 for i in range(w)] for j in range(h)]


tmp = Map(10,10)
tmp.cells[1][1] = 1
tmp.cells[2][2] = 2
tmp.cells[3][3] = 3
tmp.cells[4][4] = 4
tmp.print_map()
