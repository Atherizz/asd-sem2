public class DataMahasiswa {
    int idx;
    Mahasiswa listMhs[];

    DataMahasiswa(int jmlMhs) {
        listMhs = new Mahasiswa[jmlMhs];
        idx = 0;
    }

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for(Mahasiswa m: listMhs) {
            m.tampilData();
            System.out.println("--------------------------");
        }
    }
}
