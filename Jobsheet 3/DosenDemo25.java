import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = sc.nextInt();

        Dosen25[] arrayOfDosen25 = new Dosen25[jumlahDosen];

        for (int i = 0; i < arrayOfDosen25.length; i++) {
            System.out.println("Data Dosen ke -" + (i + 1));
            arrayOfDosen25[i] = new Dosen25();
            arrayOfDosen25[i].tambahData();
            System.out.println("--------------------------------------");
        }

        // for (Dosen25 dsn : arrayOfDosen25) {
        //     int i = 1;
        //     System.out.println("Data Dosen ke -" + (i));
        //     dsn.cetakInfo();
        //     i++;
        //     System.out.println("--------------------------------------");
        // }

        DataDosen25 dosen = new DataDosen25(arrayOfDosen25);
        dosen.dataSemuaDosen(arrayOfDosen25);
        System.out.println();
        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen25);
        System.out.println();
        dosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen25);
        System.out.println();
        dosen.infoDosenPalingTua(arrayOfDosen25);
        dosen.infoDosenPalingMuda(arrayOfDosen25);
        
        
    }
}
