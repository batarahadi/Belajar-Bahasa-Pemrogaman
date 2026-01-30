class perhitungan:
    @staticmethod
    def hitung(a, b):
        return (b - a) / a * 100

while True:
    a = float(input("Masukkan nilai sebelumnya: "))
    b = float(input("Masukkan nilai sekarang: "))
    print(f"Hasil: {perhitungan.hitung(a, b):.2f}%")
