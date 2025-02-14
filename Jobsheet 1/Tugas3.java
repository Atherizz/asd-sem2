import java.util.Scanner;

public class Tugas3 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matkul yang dimasukkan : ");
        int n = sc.nextInt();

        int menu;
        String lanjut;
        String [] matkul = new String[n];
        int [] sks = new int[n];
        int [] sem = new int[n];
        String [] hari = new String[n];

        do {
            System.out.println("==== JADWAL PERKULIAHAN =====");
            System.out.println("1. Input Jadwal");
            System.out.println("2. Menampilkan Seluruh Jadwal");
            System.out.println("3. Menampilkan Jadwal Pada Hari tertentu");
            System.out.println("4. Menampilkan Jadwal Pada Semester tertentu");
            System.out.println("5. Cari jadwal Mata Kuliah");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu : ");
            menu = sc.nextInt();

        switch (menu) {
            case 1:
            System.out.println("Input Jadwal");
            inputJadwal(matkul, hari, sem, sks);
            break;
            case 2:
            System.out.println("Jadwal Mata Kuliah");
            showJadwal(matkul, hari, sem, sks);
            break;   
            case 3:
            String day = jadwalByDay(matkul, hari, sem, sks);
            System.out.println("Jadwal Pada Hari " + day);
            jadwalByDay(matkul, hari, sem, sks);
            break;
            case 4:
            int semester = jadwalBySem(matkul, hari, sem, sks);
            System.out.println("Jadwal Pada Semester " + semester);
            jadwalBySem(matkul, hari, sem, sks);
            break;
            case 5:
            String mataKuliah = jadwalByMatkul(matkul, hari, sem, sks);
            System.out.println("Jadwal Matkul " + mataKuliah);
            jadwalByMatkul(matkul, hari, sem, sks);
            break;
            case 6:
            System.out.println("Exit Program");
            return;
            default:
            System.out.println("Input dari 1 - 5!");
            break;
        }
        
        System.out.print("Apakah anda ingin mengakses menu lagi? (y/n) : ");
        lanjut = sc.next();
        System.out.println();
    } while (lanjut.equalsIgnoreCase("y")); 

    }

    public static void inputJadwal (String [] matkul, String [] hari, int [] sem, int [] sks) {
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("\nJadwal Kuliah ke " + (i+1));
            
            System.out.print("matkul : ");
            matkul[i] = sc.nextLine();
            System.out.print("hari : ");
            hari[i] = sc.nextLine(); 
            System.out.print("semester : ");
            sem[i] = sc.nextInt();
            sc.nextLine();     
            System.out.print("jumlah SKS : ");
            sks[i] = sc.nextInt();
            sc.nextLine();   
            System.out.println(); 
        }
    }

    public static void showJadwal(String [] matkul, String [] hari, int [] sem, int [] sks) {
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Jadwal Kuliah ke " + (i+1) + " : ");
            System.out.print("matkul : " + matkul[i] + " | " );
            System.out.print("hari : " + hari[i] + " | " );
            System.out.print("semester : " + sem[i] + " | " );
            System.out.print("SKS : " + sks[i]);
            System.out.println(); 
        }
    }

    public static String jadwalByDay(String [] matkul, String [] hari, int [] sem, int [] sks) {
        System.out.print("Masukkan hari yang dipilih : ");
        String day = sc.next();

        boolean isFound = false;

        while (!day.equalsIgnoreCase("senin") && !day.equalsIgnoreCase("selasa") && !day.equalsIgnoreCase("rabu") 
        && !day.equalsIgnoreCase("kamis") && !day.equalsIgnoreCase("jumat")) {
        System.out.println("Masukkan hari yang valid!");
        day = sc.next();
    }
        for (int i = 0; i < matkul.length; i++) {
            if (day.equalsIgnoreCase(hari[i])) {
                isFound = true;
                System.out.println("Jadwal Kuliah ke " + (i+1) + " : ");
                System.out.print("matkul : " + matkul[i] + " | " );
                System.out.print("hari : " + hari[i] + " | " );
                System.out.print("semester : " + sem[i] + " | " );
                System.out.print("SKS : " + sks[i]);
            }

            System.out.println(); 
        }

        if (!isFound) {
            System.out.println("Jadwal tidak ditemukan untuk hari " + day);
        }
        return day;
    }

    public static int jadwalBySem(String [] matkul, String [] hari, int [] sem, int [] sks) {
        System.out.println("Masukkan Semester : ");
        int semester = sc.nextInt();
        boolean isFound = false;

        while (semester < 0 || semester > 8 ) {
        System.out.println("Masukkan hari yang valid!");
        semester = sc.nextInt();
    }
        for (int i = 0; i < matkul.length; i++) {
            if (semester == sem[i]) {
                isFound = true;
                System.out.println("Jadwal Kuliah ke " + (i+1) + " : ");
                System.out.print("matkul : " + matkul[i] + " | " );
                System.out.print("hari : " + hari[i] + " | " );
                System.out.print("semester : " + sem[i] + " | " );
                System.out.print("SKS : " + sks[i]);
            }

            System.out.println(); 
        }
        if (!isFound) {
            System.out.println("Jadwal tidak ditemukan");
        }
        return semester;
    }

    public static String jadwalByMatkul(String [] matkul, String [] hari, int [] sem, int [] sks) {
        System.out.println("Masukkan nama mata kuliah : ");
        String mataKuliah = sc.nextLine();

        boolean isFound = false;

        for (int i = 0; i < matkul.length; i++) {
            if (mataKuliah.equalsIgnoreCase(matkul[i])) {
                isFound = true;
                System.out.println("Jadwal Kuliah ke " + (i+1) + " : ");
                System.out.print("matkul : " + matkul[i] + " | " );
                System.out.print("hari : " + hari[i] + " | " );
                System.out.print("semester : " + sem[i] + " | " );
                System.out.print("SKS : " + sks[i]);
            }

            System.out.println(); 
        }
        if (!isFound) {
            System.out.println("Mata kuliah tidak ditemukan / tidak ada jadwal mata kuliah");
        }
        return mataKuliah;
    }
}
