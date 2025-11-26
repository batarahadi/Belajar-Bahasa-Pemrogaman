class Kucing:
    def __init__(self, nama, umur, warna):
        self.nama = nama
        self.umur = umur
        self.warna = warna

    def makan(self):
        print(self.nama, "sedang makan")

    def tidur(self):
        print(self.nama, "sedang tidur")

    def usia(self):
        print(f"{self.nama} berumur {self.umur} tahun")

# BUAT OBJEK
mochi = Kucing("Mochi", 2, "putih")

# Panggil fungsi
mochi.makan()
mochi.tidur()
mochi.usia()
