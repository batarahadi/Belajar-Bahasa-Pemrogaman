class perhitungan:
    def hitung(a, b):
        return (b - a) / a * 100

while True:
    judul = input("saham apa?")
    a = float(input("Masukkan nilai dari: "))
    b = float(input("Masukkan nilai sampai: "))
    print(f"\n====={judul.upper()}=====")
    print(f"nilai awal: {a}\nnilai akhir: {b}")
    print(f"Hasil: {perhitungan.hitung(a, b):.2f}%")
