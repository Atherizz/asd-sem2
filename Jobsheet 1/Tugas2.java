

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan panjang sisi : ");
        int sisi = sc.nextInt();
        int menu;
        String lanjut;

        do {
            System.out.println("===== PERHITUNGAN KUBUS =====");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu : ");
            menu = sc.nextInt();

        switch (menu) {
            case 1:
            System.out.println("volume : " + volumeKubus(sisi));
            break;
            case 2:
            System.out.println("Luas Permukaan : " + luasPermukaanKubus(sisi));
            break;   
            case 3:
            System.out.println("Keliling : " + kelilingKubus(sisi));
            break;
            case 4:
            System.out.println("Exit Program");
            return;
            default:
            System.out.println("Input dari 1 - 4!");
            break;
        }
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
        System.out.println();
    } while (lanjut.equalsIgnoreCase("y")); 
        
        
    }

    public static int volumeKubus (int sisi) {

        int volume = sisi * sisi * sisi;
         return volume;
        
    }

    public static int luasPermukaanKubus (int sisi) {
         int luasPermukaan = 6 * (sisi * sisi);
         return luasPermukaan;
    }

    public static int kelilingKubus (int sisi) {
        int keliling = 12 * sisi;
        return keliling;
    }


    
}
