import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] penjualan = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        int []penguranganStock = {1,2,0,5};

        int [] harga = {75000,50000,60000,10000};
        String [] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        String[] cabang = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

        int menu;
        String lanjut;

        do {
            System.out.println("===== TOKO BUNGA ROYAL GARDEN =====");
            System.out.println("1. Pendapatan Setiap Cabang");
            System.out.println("2. Jumlah Stok Royal Garden 4");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu : ");
            menu = sc.nextInt();

        switch (menu) {
            case 1:
            System.out.println("Pendapatan Setiap Cabang");
            int[] pendapatan = pendapatanCabang(penjualan, cabang, harga);
            for (int i = 0; i < pendapatan.length; i++) {
                System.out.println(cabang[i] + " : " + pendapatan[i]);
            }
            break;  
            case 2:
            System.out.println("Jumlah Stok Setiap Cabang");
            int [] stock = jumlahStock(penjualan, penguranganStock);
            for (int i = 0; i < stock.length; i++) {
                System.out.println(bunga[i] + " : " + stock[i]);
            }
            break;
            case 3:
            System.out.println("Exit Program");
            return;
            default:
            System.out.println("Input dari 1 - 3!");
            break;
        }
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
        System.out.println();
    } while (lanjut.equalsIgnoreCase("y")); 


    }

    public static int [] pendapatanCabang (int [][] penjualan, String [] cabang, int [] harga) {
        int [] pendapatan = new int[cabang.length];
        for(int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[0].length; j++) {
                pendapatan[i] += penjualan[i][j] * harga[j];
            }
        }
        return pendapatan;
    }

    public static int[] jumlahStock (int [][] penjualan, int [] penguranganStock) {
        int [] stockBunga = new int[4];

        for (int i = 0; i < stockBunga.length; i++) {
            stockBunga[i] = penjualan[3][i] - penguranganStock[i];
        }
        return stockBunga;
    }
}
