public class SllMain {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Mahasiswa25 mhs1 = new Mahasiswa25("Alya", "123456", "TI-1A", 3.75);
        Mahasiswa25 mhs2 = new Mahasiswa25("Bagas", "123457", "TI-1B", 3.40);
        Mahasiswa25 mhs3 = new Mahasiswa25("Citra", "123458", "TI-1A", 3.90);
        Mahasiswa25 mhs4 = new Mahasiswa25("Dimas", "123459", "TI-1C", 3.20);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dimas", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Dimas berada pada index : " + sll.indexOf("Dimas"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}