public class DosenMain25 {
    public static void main(String[] args) {
        System.out.println("DOSEN 1");
        Dosen25 dsn1 = new Dosen25("D001", "Agus", "TI", true, 2018);
        dsn1.tampilkanInformasi();

        Dosen25 dsn2 = new Dosen25();
        dsn2.idDosen = "D002";
        dsn2.nama = "Budi";
        dsn2.bidangKeahlian = "Matematika";
        dsn2.statusAktif = false;
        dsn2.tahunBergabung = 2016;
        
        System.out.println("DOSEN 2");
        dsn2.tampilkanInformasi();
        System.out.println("Masa Kerja : " + dsn2.hitungMasaKerja(2025) + " tahun");
        System.out.println();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Kewarganegaraan");
        
        System.out.println("PERCOBAAN METHOD");
        dsn2.tampilkanInformasi();
        System.out.println("Masa Kerja : " + dsn2.hitungMasaKerja(2025) + " tahun");
        


    }
}
