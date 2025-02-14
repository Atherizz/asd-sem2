import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String [] matkul = {"Pancasila", "KTI", "CTPS", "Matematika Dasar", "Daspro", "Praktikum Daspro", "RPL"};
        int [] nilai = new int[matkul.length];
        String [] nilaiHuruf = new String[matkul.length];
        double [] bobotNilai = new double[matkul.length];
        int [] sks = new int[matkul.length];
        double akumulasi = 0;
        int totalSks = 0;
        double ipSem = 0;


        System.out.println("=============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=============================");

        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai angka untuk " + matkul[i] + " : ");
            nilai[i] = sc.nextInt();

            while (nilai[i] > 100 || nilai[i] < 0 ) {
                System.out.println("Nilai tidak valid!");
                System.out.print("Masukkan angka antara 0 - 100 : ");
                nilai[i] = sc.nextInt();
            }

            System.out.print("Masukkan jumlah SKS untuk " + matkul[i] + " : ");
            sks[i] = sc.nextInt();

            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilai[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } 
        }   

        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");

        for(int i = 0; i < nilai.length; i++) {
            if (matkul[i].length() <= 7) {
                System.out.print(matkul[i] + "\t\t\t");
            } else if (matkul[i].length() <= 15) {
                System.out.print(matkul[i] + "\t\t");
            } else {
                System.out.print(matkul[i] + "\t");
            }
            
            System.out.print(nilai[i] + "\t\t");
            System.out.print(nilaiHuruf[i] + "\t\t");
            System.out.println(bobotNilai[i]);
        }

        for(int i = 0; i < sks.length; i++) {
            totalSks += sks[i];
        }

        for(int i = 0; i < nilai.length; i++) {
            akumulasi += bobotNilai[i] * sks[i];
            ipSem = akumulasi / totalSks;
        }

        System.out.println("IP : " + ipSem);
        

    }
}
