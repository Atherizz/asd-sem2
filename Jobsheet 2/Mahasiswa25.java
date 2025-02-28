import java.util.ArrayList;

class Mahasiswa {
    String nim,nama,kelas;
    double ipk;
    ArrayList<MataKuliah25> mkList;

    Mahasiswa (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
        this.mkList = new ArrayList<>();
    }

    Mahasiswa () {
        this.mkList = new ArrayList<>();
    }

    void tampilkanInformasi() {
        System.out.println("nim : " + nim);
        System.out.println("nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("ipk : " + ipk);
        for(int i = 0; i < this.mkList.size(); i++) {
            MataKuliah25 mk = this.mkList.get(i);
            System.out.println("Mata Kuliah : " + mk.getMatkul() + "|| SKS : " + mk.getSks());
        }
    }

    void tambahMatkul (MataKuliah25 mk) {
        this.mkList.add(mk);
    }

    void hapusMatkul (String namaMatkul) {
         boolean removed = this.mkList.removeIf(mk -> mk.getMatkul().equalsIgnoreCase(namaMatkul));
        if (!removed) {
            System.out.println("Mata Kuliah tidak ditemukan!");
        }
    }

    void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru > 4.0 || ipkBaru < 0) {
        System.out.println("IPK tidak valid! Harus antara 0.0 - 4.0");
        return;
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





