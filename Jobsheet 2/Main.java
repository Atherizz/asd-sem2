class Mahasiswa {
    String nim,nama,kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("nim : " + nim);
        System.out.println("nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("ipk : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru > 4.0 || ipkBaru < 0) {
        System.out.println("IPK tidak valid! Harus anatara 0.0 - 4.0");
        } else {
        this.ipk = ipkBaru;
        }
    }

    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "12345";
        mhs.nama = "Rian";
        mhs.kelas = "A1";
        mhs.ipk = 3.5;
        mhs.tampilkanInformasi();
        mhs.ubahKelas("A2");
        mhs.updateIpk(5);
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja : " + mhs.nilaiKinerja());
    }
}



