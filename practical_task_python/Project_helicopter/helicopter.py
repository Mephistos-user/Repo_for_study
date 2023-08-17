from utils import randcell

class Helicopter:
    def __init__(self, w, h):
        rc = randcell(w, h)
        rx, ry = rc[0], rc[1]
        self.h = h
        self.w = w
        self.x = rx
        self.y = ry
        self.tang = 0
        self.max_tang = 1
        self.hp = 3
        self.point = 0
    def move(self, dx, dy):
        nx, ny = dx + self.x, dy + self.y
        if (nx >= 0 and ny >= 0 and nx < self.h and ny < self.w):
            self.x, self.y = nx, ny

    def print_stat(self):
        print('🛢️', self.tang, '/', self.max_tang, '💗', self.hp, '💰', self.point)
