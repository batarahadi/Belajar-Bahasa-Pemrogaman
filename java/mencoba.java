class pita {
    int data;
    pita next;

    pita(int x) {
        data = x;
        next = null;
    }
}

public class mencoba {
    static pita deleteHead(pita awalNilai) {
        if (awalNilai == null)
            return null;
        awalNilai = awalNilai.next;
        return awalNilai;
    }
    static void printList(pita nodeSaatIni) {
        while (nodeSaatIni != null) {
            System.out.print(nodeSaatIni.data);
            if (nodeSaatIni.next != null) {
                System.out.print(" -> ");
            }
            nodeSaatIni = nodeSaatIni.next;
        }
    }
    public static void main(String[] args) {
        pita dataAngka = new pita(5);
        dataAngka.next = new pita(2);
        dataAngka.next.next = new pita(3);
        dataAngka.next.next.next = new pita(1);
        dataAngka.next.next.next.next = new pita(7);

        System.out.print("Sebelum: ");
        printList(dataAngka);

        dataAngka = deleteHead(dataAngka);

        System.out.print("\nSesudah: ");
        printList(dataAngka);
    }
}