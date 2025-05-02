public class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir,sakit,izin,alpa;

    Absensi (Mahasiswa mahasiswa, MataKuliah mataKuliah, int hadir,int sakit, int izin, int alpa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.hadir = hadir;
        this.sakit = sakit;
        this.izin = izin;
        this.alpa = alpa;
    }

    public int getJumlahAlpha() {
        return this.alpa;
    }

    void tampilData() {
        System.out.println("NIM : " + this.mahasiswa.nim + " |  Nama : " + this.mahasiswa.name);
        System.out.println("Mata Kuliah " + this.mataKuliah.nama);
        System.out.println("hadir : " + this.hadir + " | sakit : " + this.sakit + " | izin : " + this.izin + " | alpa : " + this.alpa);
        System.out.println("Persentase Kehadiran : " + String.format("%.2f", hitungPersentaseKehadiran()) + "%");
    }

    double hitungPersentaseKehadiran() {
        double total = 0;
        int []absen = {this.sakit, this.izin, this.alpa};

        int zeroCounter = 0;

        for (int i = 0; i < absen.length; i++) {
            if (absen[i] == 0) {
                zeroCounter++;
            }
        }

        total = this.hadir + this.alpa + this.izin + this.sakit;

        if (zeroCounter == 0) {
            return (this.hadir / (total+2)) * 100;
        } else if (zeroCounter == 1) {
            return (this.hadir / (total+1)) * 100;
        } 
        
        return (this.hadir / total) * 100;
    }



}
