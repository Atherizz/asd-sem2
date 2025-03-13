class Kendaraan {
    String nomorPlat;
    double jarakTempuh;
    double konsumsiBahanBakar;

    Kendaraan () {

    }

    Kendaraan (String nomorPlat, double jarakTempuh, double konsumsiBahanBakar) {
        this.nomorPlat = nomorPlat;
        this.jarakTempuh = jarakTempuh;
        this.konsumsiBahanBakar = konsumsiBahanBakar;
    }

    double efisiensiBbm () {
        return this.jarakTempuh / this.konsumsiBahanBakar;
    }

    void printData (Kendaraan kendaraan) {
        System.out.println("Plat Nomor : " + this.nomorPlat);
        System.out.println("Jarak Tempuh : " + this.jarakTempuh);
        System.out.println("Konsumsi Bahan Bakar : " + this.konsumsiBahanBakar);
        System.out.printf("Efisiensi BBM : %.2f%n", kendaraan.efisiensiBbm());
    }

    Kendaraan kendaraanPalingEfisien (Kendaraan[] kendaraan) {
        double highest = 0;
        int index = 0;
        for (int i = 0; i < kendaraan.length; i++) {
            double efisiensi = kendaraan[i].efisiensiBbm();
            if (efisiensi > highest) {
                highest = efisiensi;
                index = i;
            }
        }
        return kendaraan[index];

    }

}


