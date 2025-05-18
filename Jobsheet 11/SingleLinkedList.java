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

    void getData(int index) {
        NodeMahasiswa25 tmp = head;
        
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        if (tmp == null) {
            System.out.println("");
        }
        tmp.data.tampilInformasi();
    }

    int indexOf(String key) {
        NodeMahasiswa25 tmp = head;
        int index = 0;

        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa25 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else {
            NodeMahasiswa25 temp = head;
            while (temp != null) {
                if((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa25 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }




}
