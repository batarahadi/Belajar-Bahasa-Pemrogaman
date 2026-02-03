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
            text=f"{judul.upper()} : {hasil:.2f}%",
            fg="black"  # pastikan huruf hasil juga hitam
        )
    except ValueError:
        messagebox.showerror("Error", "Masukkan angka yang valid", parent=root)

root = tk.Tk()
root.title("Kalkulator Persentase Saham")
root.geometry("400x300")


# Coba muat gambar latar setelah membuat root; jika gagal, pakai background putih

# root.configure(bg="white")
# try:
#     bbg = tk.PhotoImage(file="test_opencv.png")
#     background_label = tk.Label(root, image=bbg)
#     background_label.place(x=0, y=0, relwidth=1, relheight=1)
# except tk.TclError:
#     root.configure(bg="white")
#     bbg = None


# Label dan Entry warna putih, huruf hitam
tk.Label(root, text="Nama Saham", bg="white", fg="black").pack(pady=(10,0))
entry_judul = tk.Entry(root, bg="white", fg="black", insertbackground="black")
entry_judul.pack(pady=0)

tk.Label(root, text="Nilai Awal", bg="white", fg="black").pack(pady=(10,0))
entry_awal = tk.Entry(root, bg="white", fg="black", insertbackground="black")
entry_awal.pack(pady=0)

tk.Label(root, text="Nilai Akhir", bg="white", fg="black").pack(pady=(10,0))
entry_akhir = tk.Entry(root, bg="white", fg="black", insertbackground="black")
entry_akhir.pack(pady=0)

# Tombol putih + huruf hitam
tk.Button(root, text="Hitung", command=hitung_persen, bg="white", fg="black").pack(pady=15)

# Label hasil juga putih background, huruf hitam
label_hasil = tk.Label(root, text="Hasil: ", bg="white", fg="black")
label_hasil.pack(pady=0)

root.mainloop()
