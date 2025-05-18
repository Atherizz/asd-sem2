    public class QueueLinkedList {
        NodeMahasiswa25 head;
        int capacity;
        int slot;

        QueueLinkedList(int capacity) {
        this.capacity = capacity;
        slot = capacity;
        }

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

        void addQueue(Mahasiswa25 input) {
            if (isEmpty()) {
                NodeMahasiswa25 newQueue = new NodeMahasiswa25(input, null);
                head = newQueue; 
            } else {
                NodeMahasiswa25 newQueue = new NodeMahasiswa25(input, null);
                NodeMahasiswa25 tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = newQueue;
            }
            slot--;
        }

        Mahasiswa25 getQueue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
                return null;
            } else {
                NodeMahasiswa25 mhs = head;
                head = head.next;
                slot++;
                return mhs.data;
            }
        }

        boolean isFull () {
            return slot == 0;
        } 

        void clearQueue() {
            head = null;
        }

        int countMhs() {
            return capacity - slot;
        }

        Mahasiswa25 firstQueue() {
            return head.data;
        }

        Mahasiswa25 lastQueue() {
            NodeMahasiswa25 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            return tmp.data;
        }

    }
