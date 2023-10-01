from time import sleep

# первый вариант очереди:
# class Queue:
#     def __init__(self):
#         self.elem = list()

#     def add(self, value):
#         self.elem.append(value) # в конец

#     def get(self):
#         val = self.elem.pop(0) # из начала
#         return val
    
#     def size(self):
#         size = len(self.elem)
#         return size
    
# второй вариант очереди:
class Queue:
    def __init__(self):
        self.elem = list()

    def add(self, value):
        self.elem.insert(0, value) # в начало

    def get(self):
        val = self.elem.pop() # из конца
        return val
    
    def size(self):
        size = len(self.elem)
        return size

queue = Queue()

for i in range(9, -1, -1):
    queue.add(i)
    print(i, end=" ")

for i in range(queue.size()):
    val = queue.get()
    print(val)
    sleep(val)
