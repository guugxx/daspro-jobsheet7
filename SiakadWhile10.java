import java.util.Scanner;

public class SiakadWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml, nilai, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid !");
                continue;
            }

            if (nilai >= 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai >= 73 && nilai < 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai >= 65 && nilai < 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai >= 60 && nilai < 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai >= 50 && nilai < 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai >= 40 && nilai < 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }

            if (nilai >= 80 && nilai <= 100){
                System.out.println("Bagus, pertahankan nilainya");
            }else {

            }

            i++;
        }

        sc.close();
    }
}

/* 1. apa arti dari
 * nilai <0 || nilai > 100 : ||(or) jadi nilai kurang dari 0 atau lebih dari 100
 * continue                : tidak akan menjalankan baris kode di bawahnya atau dilewati
 * 
 * 2. diakhir ditulis i++ karena i adalah inisialisi 0 dan ++ berarti +1 pada perulangan 
 * jika diawal data awal akan dilewati
 * 
 * 3. maka perulangan akan berjalan 19 kali karena yang ke 20 akan false dan berhenti
 * 
 * 4. 
 */

