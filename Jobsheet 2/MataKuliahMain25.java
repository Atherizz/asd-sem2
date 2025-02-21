public class MataKuliahMain25 {
    public static void main(String[] args) {
        System.out.println("MATA KULIAH 1 : ");
        MataKuliah25 mk1 = new MataKuliah25();
        mk1.nama = "daspro";
        mk1.kodeMk = "DP";
        mk1.sks = 4;
        mk1.jumlahJam = 8;
        mk1.tampilkanInformasi();
        System.out.println();

        System.out.println("MATA KULIAH 2 : ");
        MataKuliah25 mk2 = new MataKuliah25("BD", "basis data", 3, 6);
        mk2.tampilkanInformasi();   
        System.out.println();

        System.out.println("PERCOBAAN METHOD : ");
        mk2.ubahSks(5);
        mk2.tambahJam(4);
        mk2.kurangiJam(11);
        mk2.tampilkanInformasi();
    }
}
