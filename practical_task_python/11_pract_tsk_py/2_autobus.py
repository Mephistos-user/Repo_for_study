class Transport(object):

    def __init__(self, name, max_speed, mileage):

        self.name = name
        self.max_speed = max_speed
        self.mileage = mileage

    def seating_capacity(self, capacity):

        return f'Вместимость одного автобуса {self.name}  {capacity} пассажиров'

class Autobus(Transport):
    def __init__(self, name, max_speed, mileage):
        super().__init__(name, max_speed, mileage)
                
    def seating_capacity(self):
        capacity = 50

        return f"Вместимость одного автобуса {self.name}:  {capacity} пассажиров"
    
renault = Autobus('Renault Logan', 100, 30000)
print(renault.seating_capacity())