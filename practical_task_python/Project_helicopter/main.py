from map import Map
from pynput import keyboard
import time
import os
from helicopter import Helicopter as Helico


TICK_SLEEP = 0.05
TREE_UPDATE = 50
FIRE_UPDATE = 100
MAP_W, MAP_H = 20, 10

field = Map(MAP_W, MAP_H)
field.generate_forest(3, 10)
field.generate_river(10)
field.generate_river(10)

helico = Helico(MAP_W, MAP_H)



MOVES = {'t':(-1, 0), 'h':(0, 1), 'g':(1, 0), 'f':(0, -1)}


def procces_key(key):
    global helico
    c = key.char.lower()
    if c in MOVES.keys():
        dx, dy = MOVES[c][0], MOVES[c][1]
        helico.move(dx, dy)

listener = keyboard.Listener(
    on_press=None,
    on_release=procces_key,)
listener.start()


tick = 1

while True:
    os.system("cls") # clear для linux
    print(helico.x, helico.y)
    print("TICK", tick)
    field.process_helicopter(helico)
    helico.print_stat()
    field.print_map(helico)
    tick += 1
    time.sleep(TICK_SLEEP)
    if (tick % TREE_UPDATE == 0):
        field.generate_tree()
        if (tick % FIRE_UPDATE == 0):
            field.update_fires()

