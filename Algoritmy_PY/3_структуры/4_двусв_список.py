class Node:
    def __init__(self):
        self.value = None
        self.next = None
        self.prev = None

class DoubleLinkedList:
    def __init__(self):
        self.head = Node()

    def insert_to_end(self, value):
        if self.head.value is None:
            self.head.value = value
            return
        
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
        
        temp = Node()
        temp.value = value
        temp.prev = current_node
        current_node.next = temp
        
    def insert_to_start(self, value):
        if self.head.value is None:
            self.head.value = value
            return
        
        temp = Node()
        temp.value = value
        temp.next = self.head
        self.head.prev = temp
        self.head = temp   

    def insert_after_value(self, after_value, value_to_insert):
        if self.head.value is None:
            raise Exception("Empty list")
                    
        if self.head.value == after_value:
            temp = Node()
            temp.value = value_to_insert
            temp.next = self.head.next
            temp.prev = self.head
            self.head.prev = temp # ?????
            self.head.next = temp
            return
               
        current_node = self.head
        while current_node.next is not None:
            if current_node.value == after_value:
                break
            current_node = current_node.next
        
        if current_node.next is not None:
            if current_node.value != after_value:
                raise Exception("No such element")

        temp = Node()
        temp.value = value_to_insert
        temp.next = current_node.next
        temp.prev = current_node
        current_node.next.prev = temp
        current_node.next = temp
        

    def delete_from_end(self):
        if self.head.value is None:
            raise Exception("Empty list")
        
        if self.head.next is None:
            val = self.head.value
            self.head = Node()
            return val
        
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
    
        val = current_node.value
        current_node.prev.next = None
        return val
    

    def delete_from_start(self):
        if self.head.value is None:
            raise Exception("Empty list")
        
        if self.head.next is None:
            val = self.head.value
            self.head = Node()
            return val
        
        self.head.next.prev = None
        val = self.head.value
        self.head = self.head.next
        return val


    def find_value(self, value):
        if self.head.value is not None:
            if self.head.value == value:
                return True
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
            if current_node.value == value:
                return True
        return False
    
    def print(self):
        if self.head.value is None:
            print("Empty Linked List")
            return
        print(self.head.value, end=" ")
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
            print(current_node.value, end=" ")
        print()

dll = DoubleLinkedList()
# dll.insert_to_end(9)
# dll.insert_to_end(7)
# dll.insert_to_end(6)
# dll.insert_to_end(4)

# dll.insert_to_start(9)
# dll.insert_to_start(7)
# dll.insert_to_start(6)
# dll.insert_to_start(4)
# dll.print()
dll.insert_to_start(9)
# dll.print()
# print(dll.find_value(6))
dll.insert_to_end(7)
# dll.print()
# print(dll.find_value(6))
dll.insert_to_start(6)
# dll.print()
# print(dll.find_value(6))
dll.insert_after_value(9, 8)
# print(dll.find_value(6))
dll.print()
# a = 10

# print(dll.delete_from_end())
print(dll.delete_from_start())
# print(dll.delete_from_end())
print(dll.delete_from_start())
# print(dll.delete_from_end())
print(dll.delete_from_start())
# print(dll.delete_from_end())
print(dll.delete_from_start())
# print(dll.delete_from_end())
print(dll.delete_from_start())

