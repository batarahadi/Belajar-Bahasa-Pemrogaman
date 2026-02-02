import tkinter as tk
from tkinter import messagebox

class Perhitungan:
    @staticmethod
    def hitung(a, b):
        return (b - a) / a * 100


def hitung_persen():
    try:
        judul = entry_judul.get()
        a = float(entry_awal.get())
        b = float(entry_akhir.get())

        hasil = Perhitungan.hitung(a, b)
        label_hasil.config(
            text=f"{judul.upper()} : {hasil:.2f}%"
        )
    except ValueError:
        messagebox.showerror("Error", "Masukkan angka yang valid")


root = tk.Tk()
root.title("Kalkulator Persentase Saham")
root.geometry("350x250")

tk.Label(root, text="Nama Saham").pack()
entry_judul = tk.Entry(root)
entry_judul.pack()

tk.Label(root, text="Nilai Awal").pack()
entry_awal = tk.Entry(root)
entry_awal.pack()

tk.Label(root, text="Nilai Akhir").pack()
entry_akhir = tk.Entry(root)
entry_akhir.pack()

tk.Button(root, text="Hitung", command=hitung_persen).pack(pady=10)
label_hasil = tk.Label(root, text="Hasil: ")
label_hasil.pack()

root.mainloop()