public class MahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tampil() {
        for(Mahasiswa m:listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                   Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i-1;
            while (j >= 0 && listMhs[j].ipk > temp.ipk) {
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1] = temp;
        }
    }

    void insertionSortDescending() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i-1;
            while (j >= 0 && listMhs[j].ipk < temp.ipk) {
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1] = temp;
        }
    }
}
