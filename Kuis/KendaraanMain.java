public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan[] arrayOfKendaraan = new Kendaraan[5];

        String[] plat = {"N 1235 AS", "B 1543 TG", "L 6532 LS", "R 1564 AD", "N 1576 SA"};
        double[] jarakTempuh = {106.7, 90.5, 74.3, 90.4, 60};
        double[] konsumsiBahanBakar = {5.5, 8.9, 10.5, 12, 15};


        for (int i = 0; i < arrayOfKendaraan.length; i++) {
            arrayOfKendaraan[i] = new Kendaraan();
            arrayOfKendaraan[i].nomorPlat = plat[i];
            arrayOfKendaraan[i].jarakTempuh = jarakTempuh[i];
            arrayOfKendaraan[i].konsumsiBahanBakar = konsumsiBahanBakar[i];
        }

        for (int i = 0; i < arrayOfKendaraan.length; i++) {
            System.out.println("Kendaraan " + (i+1));
            arrayOfKendaraan[i].printData(arrayOfKendaraan[i]);
            System.out.println("-----------------------------");
        }

        // double highest = 0;
        // int index= 0;

        // tanpa fungsi
        // for (int i = 0; i < arrayOfKendaraan.length; i++) {
        //     if (arrayOfKendaraan[i].efisiensiBbm() > highest) {
        //         highest = arrayOfKendaraan[i].efisiensiBbm();
        //         index = i;
        //     }
        // }
        // System.out.println("Kendaraan yang paling efisien : " + arrayOfKendaraan[index].nomorPlat);

        Kendaraan kendaraanEfisien = new Kendaraan();
        System.out.println("Kendaraan yang paling efisien : " + kendaraanEfisien.kendaraanPalingEfisien(arrayOfKendaraan).nomorPlat);

        int counter = 0;
        for (int i = 0; i < arrayOfKendaraan.length; i++) {
            if (arrayOfKendaraan[i].efisiensiBbm() > 10) {
                counter++;
            }
        }

        double persentase = ((double)counter / arrayOfKendaraan.length) * 100;
        System.out.println("persentase kendaraan yang efisiensi lebih dari 10 : " + persentase +"%");


    }

}
