class Perhitungan:
    @staticmethod
    def hitung(a, b):
        return (b - a) / a * 100


def main():
    while True:
        judul = input("Saham apa? (ketik q untuk keluar): ")
        if judul.lower() == "q":
            break

        a = float(input("Masukkan nilai awal: "))
        b = float(input("Masukkan nilai akhir: "))

        print(f"\n====={judul.upper()}=====")
        print(f"Nilai awal : {a}")
        print(f"Nilai akhir: {b}")
        print(f"Hasil      : {Perhitungan.hitung(a, b):.2f}%\n")


if __name__ == "__main__":
    main()