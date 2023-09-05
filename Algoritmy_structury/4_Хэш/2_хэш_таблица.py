arr = [1, 2, 3]
print(arr[0], arr[1], arr[2])

birthdays_by_names = {
    "Ivan": [23, 25, 26],
    "Vasya": [1, 5]
}
print(birthdays_by_names["Ivan"], birthdays_by_names["Vasya"])

birthdays_by_dates = {
    23: ["Ivan", "Vasya"],
    12: ["Karl", "Kira"]
}
print(birthdays_by_dates[12], birthdays_by_dates[23])

##################################

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class HashTable:
    def __init__(self, size):
        self.elems = []
        self.size = size
        for i in range(size):
            self.elems.append(Node())

        # self.data = [Node(None)] * size
        # self.size = size

    def hash(self, key):
        return key % self.size
    
    # def hash_function(self, key, size):
    #     return key % size

    def add(self, value):
        hash = self.hash(value)
        if self.elems[hash].data is None:
            self.elems[hash].data = value
        else:
            current_node = self.elems[hash]
            while current_node.next is not None:
                current_node = current_node.next
            temp = Node()
            temp.data = value
            current_node.next = temp        

    def delete(self, value):
        hash = self.hash(value)
        if self.elems[hash].data is None:
            raise Exception("Элементов с таким хэшем нет")
        else:
            prev = None
            current_node = self.elems[hash]
            if current_node.data == value:
                self.elems[hash] == self.elems[hash].next
                return
            while current_node.next is not None:
                prev = current_node
                current_node = current_node.next
                if current_node.data == value:
                    prev.next = current_node.next
                    return
            raise Exception("Такого элемента нет в таблице")

    def find(self, value):
        pass

    # def put(self, key):
    #     hash_value = self.hash_function(key, self.size)
    #     if self.data[hash_value].data is None:
    #         self.data[hash_value].data = key
    #     else:
    #         temp = Node(key)
    #         p = self.data[hash_value]
    #         while p.next is not None:
    #             p = p.next
    #         p.next = temp

    # def get(self, key):
    #     hash_value = self.hash_function(key, self.size)
    #     if self.data[hash_value].data is None:
    #         self.data[hash_value].data = key
    #     else:
    #         temp = Node(key)
    #         p = self.data[hash_value]
    #         while p.next is not None:
    #             p = p.next
    #         p.next = temp

ht = HashTable(10)
ht.add(3)
ht.add(13)
ht.add(23)

ht.delete(0)

#a = 10