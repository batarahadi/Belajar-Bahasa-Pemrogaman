"""
        try dan except example
bisa menggunakan yang dibawah ini sebagai tipe error:
1. ValueError
2. TypeError
3. ZeroDivisionError
4. FileNotFoundError
5. RuntimeError
6. Exception (umum)
7. atau error buatan sendiri (custom exception)

try: digunakan untuk mencoba menjalankan kode yang berpotensi menimbulkan error.
except: digunakan untuk menangani error yang terjadi pada blok try.
try tidak harus diikuti oleh EXCEPT, bisa juga diikuti oleh FINALLY atau ELSE.
"""

# Contoh 1: paling UMUM
try:
    x = int("abc")
except:
    print("Ada error!")

# Contoh 2: lebih SPESIFIK dengan tipe error bisa di ganti
try:
    y = int("abc")
except ValueError:
    print("ValueError: Tidak bisa konversi string ke integer!")
