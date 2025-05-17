public class Mahasiswa25 {

        String nim, nama, kelas;
        double ipk;
    
        Mahasiswa25() {
    
        }
    
        Mahasiswa25(String nama, String nim, String kelas, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.kelas = kelas;
            this.ipk = ipk;
        }
    
        void tampilInformasi() {
            System.out.println("Nama : " + this.nama);
            System.out.println("NIM : " + this.nim);
            System.out.println("Kelas : " + this.kelas);
            System.out.println("IPK : " + this.ipk);
            System.out.println("====================================");
        }




}