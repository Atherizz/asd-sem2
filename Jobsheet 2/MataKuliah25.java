class MataKuliah25 {
    String kodeMk, nama;
    int sks, jumlahJam;

    MataKuliah25() {

    }

    MataKuliah25(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;   
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah : " + this.kodeMk);
        System.out.println("Nama Mata Kuliah : " + this.nama);
        System.out.println("Jumlah SKS : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
    }

    void ubahSks(int sksBaru) {
        this.sks = sksBaru;
    }

    void tambahJam (int jam) {
        this.jumlahJam += jam;
    }

    void kurangiJam (int jam) {
        this.jumlahJam -= jam;
    }


    
}

