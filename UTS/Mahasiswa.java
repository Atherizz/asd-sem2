public class Mahasiswa {
    public String name;
    public String nim;

    Mahasiswa (String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    void tampilData() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.name);
    }
}
