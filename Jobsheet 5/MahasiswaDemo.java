import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan NIM : ");
            String nim = sc.next();
            System.out.print("Masukkan Nama : ");
            String nama = sc.next();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.next();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(mhs);
            System.out.println();
        }
        // Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        // Mahasiswa m2 = new Mahasiswa("124", "Ayu", "2A", 3.5);
        // Mahasiswa m3 = new Mahasiswa("125", "Sofi", "2A", 3.1);
        // Mahasiswa m4 = new Mahasiswa("126", "Sita", "2A", 3.9);
        // Mahasiswa m5 = new Mahasiswa("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

            // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
            // list.bubbleSort();
            // list.tampil();

        System.out.println("Data Mahasiswa yang sudah terurut dengan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();
    }
}
