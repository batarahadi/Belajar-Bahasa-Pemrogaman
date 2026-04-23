class Node1:
    def __init__(self, a):
        self.data = a
        self.next = None

class LinkList:
    def __init__(self):
        self.head = None

    # Masukan data di belakang (Append)
    def masukan(self, b):
        n = Node1(b)
        if self.head is None:
            self.head = n
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = n

    # Menampilkan isi list
    def tampilkan(self):
        temp = self.head
        while temp is not None:
            print(temp.data, end=" ")
            temp = temp.next
        print() # Untuk baris baru

    # Masukan data di depan (Prepend)
    def masukanDepan(self, c):
        n = Node1(c)
        n.next = self.head
        self.head = n

    # Menghapus node berdasarkan nilai
    def hapus(self, d):
        tujuan = self.head
        prev = None

        # Jika head adalah yang ingin dihapus
        if tujuan is not None and tujuan.data == d:
            self.head = tujuan.next
            return

        # Mencari node yang ingin dihapus
        while tujuan is not None and tujuan.data != d:
            prev = tujuan
            tujuan = tujuan.next

        # Jika data tidak ditemukan
        if tujuan is None:
            return

        # Melepaskan node dari list
        prev.next = tujuan.next

# Bagian Main (Pengujian)
if __name__ == "__main__":
    list_data = LinkList()
    
    list_data.masukan(10)
    list_data.masukan(20)
    list_data.masukan(30)
    list_data.tampilkan() # Hasil: 10 20 30 

    list_data.masukanDepan(5)
    list_data.tampilkan() # Hasil: 5 10 20 30 

    list_data.hapus(20)
    list_data.tampilkan() # Hasil: 5 10 30