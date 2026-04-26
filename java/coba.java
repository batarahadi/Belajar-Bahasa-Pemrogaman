class NodeTeks {
    String teks;
    NodeTeks next;
    NodeTeks(String teks) { this.teks = teks; }
}

class EditorTeks {
    NodeTeks undoStack; // histori perubahan
    NodeTeks redoStack; // histori undo
    String teksSaatIni = "";

    public void tambahTeks(String tambahan) {
        // Simpan kondisi sebelumnya ke undoStack
        NodeTeks simpan = new NodeTeks(teksSaatIni);
        simpan.next  = undoStack;
        undoStack    = simpan;
        redoStack    = null; // reset redo saat ada perubahan baru
        teksSaatIni += tambahan;
        System.out.println("Teks saat ini: \"" + teksSaatIni + "\"");
    }

    public void undo() {
        if (undoStack == null) {
            System.out.println("Tidak ada yang bisa di-undo.");
            return;
        }
        // Simpan kondisi saat ini ke redoStack
        NodeTeks simpan = new NodeTeks(teksSaatIni);
        simpan.next = redoStack;
        redoStack   = simpan;
        // Kembalikan ke kondisi sebelumnya
        teksSaatIni = undoStack.teks;
        undoStack   = undoStack.next;
        System.out.println("Undo: \"" + teksSaatIni + "\"");
    }

    public void redo() {
        if (redoStack == null) {
            System.out.println("Tidak ada yang bisa di-redo.");
            return;
        }
        // Simpan kondisi saat ini ke undoStack
        NodeTeks simpan = new NodeTeks(teksSaatIni);
        simpan.next = undoStack;
        undoStack   = simpan;
        // Kembalikan ke kondisi redo
        teksSaatIni = redoStack.teks;
        redoStack   = redoStack.next;
        System.out.println("Redo: \"" + teksSaatIni + "\"");
    }

    public void tampilkan() {
        System.out.println("Teks saat ini: \"" + teksSaatIni + "\"");
    }
}