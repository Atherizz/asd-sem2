
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020116|
| Nama |  Savero Athallah Hardiana Putra |
| Kelas | TI - 1H |
| Repository | [https://github.com/Atherizz/asd-sem2/tree/main/Jobsheet%211]|

# Labs #10 Linked List

## Pembuatan Single Linked List

### 2.1.2 Verifikasi Hasil Percobaan 
  ![Screenshot](img/output1.png)

### 2.1.3 Pertanyaan
1. karena belum ada data yang ditambahkan melalui method `add` yang ada pada class `SingleLinkedList`

2. Variabel temp digunakan sebagai pointer yang merujuk pada attribut `head` pada class `SingleLinkedList`, kegunaan umumnya untuk melakukan penelusuran data dengan memanfaatkan atribut `next` untuk mengakses node selanjutnya.

3. Modifikasi program class `SllMain`
```java
        System.out.print("Berapa jumlah data mahasiswa yang ingin ditambahkan? ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();


            Mahasiswa25 mhs = new Mahasiswa25(nama, nim, kelas, ipk);
            sll.addLast(mhs); 
        }

        System.out.println("\nData Mahasiswa dalam Linked List:");
        sll.print();
    }

```



## Modifikasi Elemen pada Single Linked List

### 2.2.2 Verifikasi Hasil Percobaan 

  ![Screenshot](img/output2_1.png)
    ![Screenshot](img/output2_2.png)

### 2.2.3 Pertanyaan

Modifikasi Program
```java

            void lihatAkhir() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
            } else {
                System.out.println("Mahasiswa terakhir : ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[rear].tampilkanData();
            }
        }
  ```

## Tugas

### Contoh Output 

  ![Screenshot](img/tugas1.png)
    ![Screenshot](img/tugas2.png)
      ![Screenshot](img/tugas3.png)
        ![Screenshot](img/tugas4.png)
          ![Screenshot](img/tugas5.png)
