class Kassa(object):

    ballans = 0

    def __init__(self, b):
        self.ballans = b

    def top_up(self, x):
        self.ballans += x
    
    def count_1000(self):
        print(self.ballans // 1000)

    def take_away(self, y):
        if self.ballans < y:
            print('Недостаточно средств!')
        else:
            self.ballans -= y

b = Kassa(3000)#Начальный баланс 3000
b.count_1000()#количество целых тысяч
b.top_up(500)#пополняем баланс на 500
print(b.ballans)#проверяем остаток баланса
b.take_away(5000)#пробуем снять 5000
b.take_away(1250)#пробуем снять 1250
b.count_1000()#количество целых тысяч
print(b.ballans)#проверяем остаток баланса