import java.util.*;
public class MainSistemKehadiran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataMahasiswa listMhs = new DataMahasiswa(5);
        DataMataKuliah listMK = new DataMataKuliah(3);
        DataAbsensi listAbsensi = new DataAbsensi(10);
        
        // dummy mhs
        Mahasiswa mhs1 = new Mahasiswa("Ali Rahman","22001");
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso","22002");
        Mahasiswa mhs3 = new Mahasiswa("Citra Dewi","22003");
        Mahasiswa mhs4 = new Mahasiswa("Deni Saputra","22004");
        Mahasiswa mhs5 = new Mahasiswa("Eka Wulandari","22005");

        listMhs.tambah(mhs1);
        listMhs.tambah(mhs2);
        listMhs.tambah(mhs3);
        listMhs.tambah(mhs4);
        listMhs.tambah(mhs5);

        // dummy matkul
        MataKuliah matkul1 = new MataKuliah("MK001","Struktur Data",3);
        MataKuliah matkul2 = new MataKuliah("MK002","Basis Data",3);
        MataKuliah matkul3 = new MataKuliah("MK003","Desain Web",2);

        listMK.tambah(matkul1);
        listMK.tambah(matkul2);
        listMK.tambah(matkul3);

        // dummy abs
        listAbsensi.tambah(new Absensi(mhs1, matkul1, 11, 1, 1, 1));
        listAbsensi.tambah(new Absensi(mhs1, matkul2, 12, 0, 1, 1));
        listAbsensi.tambah(new Absensi(mhs2, matkul2, 9, 2, 1, 2));
        listAbsensi.tambah(new Absensi(mhs1, matkul2, 10, 0, 0, 2));
        listAbsensi.tambah(new Absensi(mhs2, matkul1, 14, 11, 0, 5)); 
        listAbsensi.tambah(new Absensi(mhs3, matkul3, 10, 6, 2, 2));  
        listAbsensi.tambah(new Absensi(mhs4, matkul2, 12, 8, 2, 2)); 
        listAbsensi.tambah(new Absensi(mhs5, matkul1, 10, 9, 1, 0));  
        listAbsensi.tambah(new Absensi(mhs5, matkul2, 12, 10, 1, 1));
        listAbsensi.tambah(new Absensi(mhs2, matkul3, 8, 5, 1, 2));   

        

        while (true) {
            System.out.println();
            System.out.println("=== SISTEM PENGELOLAAN KEHADIRAN MAHASISWA ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Absensi");
            System.out.println("4. Urutkan Data Absensi Berdasarkan Persentase Kehadiran");
            System.out.println("5. Cari Data Absensi Berdasarkan NIM ");
            System.out.println("6. Cari Mahasiswa dengan Alpha Terbanyak ");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                listMhs.tampil();
            } else if (menu == 2) {
                listMK.tampil();
            } else if (menu == 3) {
                listAbsensi.tampil();
            } else if (menu == 4) {
                listAbsensi.SortPersentaseDesc();
                listAbsensi.tampil();
            } else if (menu == 5) {
                System.out.print("Input NIM: ");
                String inputnim = sc.next();
                int posisi = listAbsensi.LinearSearch(inputnim);
                listAbsensi.TampilPosisi(inputnim,posisi);
                listAbsensi.TampilSearch(inputnim,posisi);
            }  else if (menu == 6) {
                listAbsensi.TampilkanMahasiswaAlphaTerbanyak(listMhs);
            }
            else if (menu == 0) {
                System.out.println("Keluar dari program");
                break;
            } else {
                System.out.println("Input tidak valid, silakan input ulang");
                continue;
            }
        }
    }
}
