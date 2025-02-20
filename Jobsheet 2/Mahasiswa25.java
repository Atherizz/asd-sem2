class Mahasiswa {
    String nim,nama,kelas;
    double ipk;

    Mahasiswa (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

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





