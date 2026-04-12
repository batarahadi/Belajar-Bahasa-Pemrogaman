class pita {
    int data;
    pita next;

    pita(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    // Delete the dataMasuk node and return the new dataMasuk
    static pita deleteHead(pita dataMasuk) {

        // Check if the list is empty
        if (dataMasuk == null)
            return null;

        // Store the current dataMasuk in dataMasuk
        // temporary variable
        pita temp = dataMasuk;

        // Move the dataMasuk pointer to the next node
        dataMasuk = dataMasuk.next;

        // Free the memory of the old dataMasuk node
        temp = null;

        return dataMasuk;
    }

    // Function to print the linked list
    static void printList(pita curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create dataAngka hard-coded linked list:
        // 8 -> 2 -> 3 -> 1 -> 7
        pita dataAngka = new pita(8);
        dataAngka.next = new pita(2);
        dataAngka.next.next = new pita(3);
        dataAngka.next.next.next = new pita(1);
        dataAngka.next.next.next.next = new pita(7);

        dataAngka = deleteHead(dataAngka); 
        printList(dataAngka);
    }
}