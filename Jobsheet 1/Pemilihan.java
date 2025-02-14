import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas,nilaiKuis,nilaiUts, nilaiUas;
        double nilaiAkhir;
        String nilaiHuruf;
        String keterangan = "";

        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();

        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc.nextInt();

        if (nilaiTugas > 100 || nilaiTugas < 0  || nilaiKuis > 100 || nilaiKuis < 0 || nilaiUts > 100 || nilaiUts < 0 || nilaiUas > 100 || nilaiUas < 0 ) {
            System.out.println("Nilai tidak valid!");
        } else {
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);
            System.out.println("Nilai Akhir : " +nilaiAkhir);
            
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            } else {
                nilaiHuruf = "Nilai tidak valid";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("Keterangan : " + keterangan);
        }


    }
}