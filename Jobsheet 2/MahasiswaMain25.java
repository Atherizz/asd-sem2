public class MahasiswaMain25 {
    public static void main(String[] args) {
//         // Mahasiswa mhs1 = new Mahasiswa();
//         // mhs1.nama = "Savero Athallah";
//         // mhs1.nim = "244107020116";
//         // mhs1.kelas = "TI 1H";
//         // mhs1.ipk = 3.5;

//         // mhs1.tampilkanInformasi();
//         // mhs1.ubahKelas("TI 2H");
//         // mhs1.updateIpk(3.0);
//         // mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Opang", "24410702036", 3.5, "TI-1H");
        mhs2.updateIpk(3.8);
        mhs2.tampilkanInformasi();

        Mahasiswa mhsSavero = new Mahasiswa("Savero", "244107020116", 3.6, "TI-1H");
        mhsSavero.updateIpk(3.9);
        mhsSavero.tampilkanInformasi();
    }
}