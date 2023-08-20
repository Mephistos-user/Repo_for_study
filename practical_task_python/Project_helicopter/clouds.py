from utils import randbool


class Clouds:
    def __init__(self, w, h):
        self.w = w
        self.h = h
        self.cells = [[0 for i in range(w)] for j in range(h)]

    # функция создания облаков
    def update(self, r = 1, mxr = 20, g = 1, mxg = 10):
        for i in range(self.h):
            for j in range(self.w):
                # обычные облака
                if randbool(r, mxr):
                    self.cells[i][j] = 1
                    # грозовые облака из общего количества облаков
                    if randbool(g, mxg):
                        self.cells[i][j] = 2
                else: 
                    self.cells[i][j] = 0
    # функция сохранения
    def export_data(self):
        return {"cells": self.cells}
    # функция загрузки сохранения
    def import_data(self, data):
        self.cells = data["cells"] or [[0 for i in range(self.w)] for j in range(self.h)]
                    