class menghitung:
    def __init__(self):
        self.nilai1 = 0
        self.nilai2 = 0

    def penjumlahan(self):
        return self.nilai1 + self.nilai2

a = menghitung()
a.nilai1 = 5
a.nilai2 = 2
print(a.penjumlahan())