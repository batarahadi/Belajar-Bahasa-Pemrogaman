class node1 {
    int data;
    node1 next;

    node1(int a) {
        this.data = a;
        this.next = null;
    }
}

class linkList {
    node1 head;

    void masukan(int b) {
        node1 n = new node1(b);
        if (head == null) {
            head = n;
        } else {
            node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void tampilkan () {
        node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    void masukanDepan(int c) {
        node1 n = new node1(c);
        n.next = head;
        head = n;
    }
}

public class vicon23Aprl26 {
    public static void main(String[] args) {
        linkList list = new linkList();
        list.masukan(10);
        list.masukan(20);
        list.masukan(30);
        list.tampilkan();
        System.out.println();
        list.masukanDepan(5);
        list.tampilkan();
    }
}
