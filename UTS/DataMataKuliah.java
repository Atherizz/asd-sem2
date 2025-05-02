public class DataMataKuliah {
    int idx;
    MataKuliah listMK[];

    DataMataKuliah(int jmlMK) {
        listMK = new MataKuliah[jmlMK];
        idx = 0;
    }
    
    void tambah(MataKuliah m) {
        if (idx < listMK.length) {
            listMK[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for(MataKuliah m: listMK) {
            m.tampilData();
            System.out.println("--------------------------");
        } 
    }
}