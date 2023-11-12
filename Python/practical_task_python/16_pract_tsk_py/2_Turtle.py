class Turtle(object):
    s = 1

    def __init__(self, x, y):
        self.x = 0
        self.y = 0

    def go_up(self): #- увеличивает y на s
        self.y += self.s

    def go_down(self): #- уменьшает y на s
        self.y -= self.s

    def go_left(self): #- уменьшает x на s
        self.x -= self.s

    def go_right(self): #- увеличивает x на s
        self.x += self.s

    def evolve(self): #- увеличивает s на 1
        self.s +=1

    def degrade(self): #- уменьшает s на 1 или выкидывает ошибку, когда s может стать ≤ 0
        if self.s <=1: print('Нельзя уменьшить скорость до 0 или меньше!')
        else: self.s -=1

    def count_moves(self, x2, y2): #- возвращает минимальное количество действий,за которое черепашка
                                   # сможет добраться до x2 y2 от текущей позиции
        if self.s <= abs(self.x - x2) and self.s <= abs(self.y - y2):
            if abs(self.x - x2) % self.s == 0 and abs(self.y - y2) % self.s == 0:
                return (abs(self.x - x2) + abs(self.y - y2)) // self.s
            elif abs(self.x - x2) % self.s != 0 and abs(self.y - y2) % self.s != 0:
                return (abs(self.x - x2) // self.s)  + (abs(self.y - y2) // self.s) + 2
            else:
                return (abs(self.x - x2) // self.s)  + (abs(self.y - y2) // self.s) + 1
        elif self.s > abs(self.x - x2) and self.s > abs(self.y - y2):
            return 2
        elif self.s <= abs(self.x - x2) and self.s > abs(self.y - y2):
            if abs(self.x - x2) % self.s == 0:
                return (abs(self.x - x2) // self.s) + 1
            else:
                return (abs(self.x - x2) // self.s) + 2
        elif self.s > abs(self.x - x2) and self.s <= abs(self.y - y2):
            if abs(self.y - y2) % self.s == 0:
                return (abs(self.y - y2) // self.s) + 1
            else:
                return (abs(self.y - y2) // self.s) + 2

t = Turtle(5, 9)
for i in range(5):
    t.evolve()
t.go_up()
t.go_left()
for i in range(3):
    t.degrade()
print(t.count_moves(45, 26))