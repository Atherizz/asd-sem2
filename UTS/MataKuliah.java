public class MataKuliah {
    public String kode;
    public String nama;
    public int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    void tampilData() {
        System.out.println("Kode : " + this.kode);
        System.out.println("Nama : " + this.nama);
        System.out.println("SKS : " + this.sks);
    }


}


