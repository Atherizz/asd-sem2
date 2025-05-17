public class SingleLinkedList {
    NodeMahasiswa25 head;
    NodeMahasiswa25 tail;

    boolean isEmpty () {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
        NodeMahasiswa25 tmp = head;
        System.out.println("Isi linked list");
        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        System.out.println("");
    } else {
        System.out.println("Linked list kosong");
    }
    }

    void addFirst (Mahasiswa25 input) {
        NodeMahasiswa25 newNode = new NodeMahasiswa25(input, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast (Mahasiswa25 input) {
        NodeMahasiswa25 newNode = new NodeMahasiswa25(input, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter (String key, Mahasiswa25 input) { 
        NodeMahasiswa25 newNode = new NodeMahasiswa25(input, null);
        NodeMahasiswa25 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                newNode.next = tmp.next;
                tmp.next = newNode;
                if (newNode.next == null) { 
                    tail = newNode;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    } 

    void insertAt(int index, Mahasiswa25 input) {
        if (index < 0) {
            System.out.println("index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa25 tmp = head;
            for(int i = 0; i < index-1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa25(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }


}
