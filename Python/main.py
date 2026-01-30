from abc import ABC, abstractmethod

# --- Antarmuka ---
class Pelanggan(ABC):
    @abstractmethod
    def pesan_makanan(self):
        pass

    @abstractmethod
    def bayar_makanan(self):
        pass

class JuruMasak(ABC):
    @abstractmethod
    def masak_makanan(self, pesanan):
        pass

class Server(ABC):
    @abstractmethod
    def antar_makanan(self, pesanan, pelanggan):
        pass

# --- Implementasi Antarmuka ---
class PelangganImpl(Pelanggan):
    def pesan_makanan(self):
        pesanan = "Nasi Goreng"
        print(f"Pelanggan memesan: {pesanan}")
        return pesanan

    def bayar_makanan(self):
        print("Pelanggan membayar makanan.")

class JuruMasakImpl(JuruMasak):
    def masak_makanan(self, pesanan):
        print(f"Juru masak sedang memasak: {pesanan}")
        return f"{pesanan} siap"

class ServerImpl(Server):
    def antar_makanan(self, pesanan, pelanggan):
        print(f"Server mengantarkan: {pesanan} ke pelanggan.")

# --- Simulasi Proses Restoran ---
def simulasi_restoran():
    pelanggan = PelangganImpl()
    juru_masak = JuruMasakImpl()
    server = ServerImpl()

    # Proses
    pesanan = pelanggan.pesan_makanan()
    makanan_siap = juru_masak.masak_makanan(pesanan)
    server.antar_makanan(makanan_siap, pelanggan)
    pelanggan.bayar_makanan()

# --- Jalankan Simulasi ---
simulasi_restoran()