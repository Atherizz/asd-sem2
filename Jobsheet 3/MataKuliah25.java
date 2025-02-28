import java.util.Scanner;

public class MataKuliah25 {
    public Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah25(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public MataKuliah25 () {

    }

    void tambahData() {
    System.out.print("Kode : ");
    this.kode = sc.nextLine();
    System.out.print("Nama : ");
    this.nama = sc.nextLine();
    System.out.print("SKS : ");
    this.sks = sc.nextInt();
    System.out.print("Jumlah Jam : ");
    this.jumlahJam = sc.nextInt();
    }

    void cetakInfo() {
        System.out.println("Kode : " + this.kode);
        System.out.println("Nama : " + this.nama);
        System.out.println("SKS : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
    }
}
