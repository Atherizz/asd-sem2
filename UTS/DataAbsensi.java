public class DataAbsensi {
    int idx;
    Absensi listAbsensi[];

    DataAbsensi (int jmlAbsensi) {
        listAbsensi = new Absensi[jmlAbsensi];
        idx = 0;
    }

    void tambah(Absensi a) {
        if (idx < listAbsensi.length) {
            listAbsensi[idx] = a;
            idx++;

        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            this.listAbsensi[i].tampilData();
            System.out.println("---------------------------");
        }
    }

    void SortPersentaseDesc() {
        for (int i = 1; i < idx; i++) {
            Absensi temp = listAbsensi[i];
            int j = i-1;
            while (j >= 0 && listAbsensi[j].hitungPersentaseKehadiran() < temp.hitungPersentaseKehadiran()) {
                listAbsensi[j+1] = listAbsensi[j];
                j--;
            }
            listAbsensi[j+1] = temp;
        }
    }

    int LinearSearch(String Carinim) {
        int posisi = -1;

        for (int i = 0; i < idx; i++){
            if (listAbsensi[i].mahasiswa.nim.equals(Carinim)){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void TampilPosisi(String nim, int pos){
        if (pos == -1){
            System.out.println("Data Absensi dengan NIM "+nim+" tidak ditemukan.");
        }else{
            System.out.println("Data Absensi dengan NIM "+nim+" ditemukan pada index ke - " + pos);
        }
    }

    void TampilSearch(String nim, int pos){
        if (pos != -1){
            System.out.println("==== DATA ABSENSI MAHASISWA ====");

            listAbsensi[pos].tampilData();
        }
    }

    void TampilkanMahasiswaAlphaTerbanyak(DataMahasiswa listMhs) {
        int[] alpaMhs = new int[listMhs.idx];
        
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < listMhs.idx; j++) {
                if (listAbsensi[i].mahasiswa.name == listMhs.listMhs[j].name) {
                    alpaMhs[j] += listAbsensi[i].alpa;
                }
            }
        }

        int maxAlpha = 0;
        int indexMhs = 0;

        for (int i = 0; i < alpaMhs.length; i++) {
            if (alpaMhs[i] > maxAlpha) {
                maxAlpha = alpaMhs[i];
                indexMhs = i;
            }
        }

        System.out.println("Mahasiswa dengan alpha terbanyak adalah " + listMhs.listMhs[indexMhs].name + " dengan alpha " + maxAlpha );
    }

    
}
