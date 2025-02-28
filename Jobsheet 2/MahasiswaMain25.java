public class MahasiswaMain25 {
    public static void main(String[] args) {
        // Mahasiswa mhs1 = new Mahasiswa();
        // mhs1.nama = "Savero Athallah";
        // mhs1.nim = "244107020116";
        // mhs1.kelas = "TI 1H";
        // mhs1.ipk = 3.5;

        // mhs1.tampilkanInformasi();
        // mhs1.ubahKelas("TI 2H");
        // mhs1.updateIpk(3.0);
        // mhs1.tampilkanInformasi();

        MataKuliah25 mk = new MataKuliah25("ASD", "Algoritma Struktur Data", 2, 5);
        MataKuliah25 mk2 = new MataKuliah25("BD", "basis data", 3, 6);

        Mahasiswa mhs2 = new Mahasiswa("Opang", "24410702036", 3.5, "TI-1H");
        mhs2.tambahMatkul(mk);
        mhs2.tambahMatkul(mk2);
        mhs2.hapusMatkul("Algoritma Struktur Data");


        mhs2.tampilkanInformasi();


        // mhs2.updateIpk(3.8);
        // mhs2.tampilkanInformasi();
        // System.out.println(mhs2.mk.nama);

        // Mahasiswa mhsSavero = new Mahasiswa("Savero", "244107020116", 3.6, "TI-1H");
        // mhsSavero.updateIpk(3.9);
        // mhsSavero.tampilkanInformasi();
    }
}