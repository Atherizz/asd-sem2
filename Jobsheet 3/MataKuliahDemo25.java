import java.util.Scanner;
public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   

        System.out.println("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = sc.nextInt();
        MataKuliah25 [] arrayOfMataKuliah = new MataKuliah25[jumlahMatkul];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke- " + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah25();
            arrayOfMataKuliah[i].tambahData();
            System.out.println("--------------------------------------");
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }
}
