"""Contoh pelanggaran Liskov Substitution Principle (LSP)
raise bisa memakai tipe error apa saja, tidak wajib ValueError.
Contoh tipe error yang bisa dipakai:
1. ValueError
2. TypeError
3. ZeroDivisionError
4. FileNotFoundError
5. RuntimeError
6. Exception (umum)
7. atau error buatan sendiri (custom exception)
"""



class Burung:
    def terbang(self):
        return "Terbang"

class Ayam(Burung):
    def terbang(self):
        raise Exception("Ayam tidak bisa terbang!")  # tidak konsisten


print(Burung().terbang())
# print(Ayam().terbang()) # akan menimbulkan error