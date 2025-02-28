
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020116|
| Nama |  Savero Athallah Hardiana Putra |
| Kelas | TI - 1H |
| Repository | []  |

# Labs #2 Array of Objects

## Percobaan 1 - Membuat Array dari Objek

### 3.2.2 Verifikasi Hasil Percobaan 

 ![Screenshot](img/verif.png)

### 3.2.3 Pertanyaan
1. Tidak, `Class` tidak harus selalu memiliki atribut dan method. Class dapat memiliki hanya atribut, hanya method, atau bahkan tidak memiliki atribut dan method sama sekali. 

2. Melakukan inisialisasi array dengan tipe data sebuah class bernama `Mahasiswa` dan jumlah elemennya berjumlah 3

3. class `Mahasiswa` tidak memiliki konstruktor, tetapi secara default jika kita membuat class tanpa konstruktor maka `java` akan otomatis membuat konstruktor default tanpa parameter sehingga objek tetap bisa diinstansiasi

4. Kode program tersebut mengisi nilai pada seluruh atribut yang ada di dalam objek pada sebuah array yang ber index 0

5. Class `Mahasiswa` dan `MahasiswaDemo` dipisahkan karena class MahasiswaDemo berisi method main, dan pada Java, method main harus berada dalam sebuah public class yang memiliki nama yang sama dengan nama file.

## Percobaan 2 - Menerima Input Isian Array

### 3.2.2 Verifikasi Hasil Percobaan 

 ![Screenshot](img/verif2.png)

 ### 3.3.3 Pertanyaan

 1. Tambah method cetakInfo()
 ```java
void cetakInfo() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.name);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("IPK : " + this.ipk);
    }
 ```

```java
for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke -" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
```

2. Karena objek pada index 0 `myArrayOfMahasiswa` belum diinstansiasi, sehingga menyebabkan error

## Percobaan 3 - Constructor Berparameter

### 3.4.2 Verifikasi Hasil Percobaan 

 ![Screenshot](img/verif2.png)

 ### 3.4.3 Pertanyaan

 1. Suatu class bisa memiliki lebih dari 1 constructor, asalkan tiap constructor memiliki parameter yang berbeda

 2. 


























