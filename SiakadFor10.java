import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus=0,jumlahTidakLulus=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
//jumlah lulus ++ karena nilai jumlah lulus mulai 0 agar bisa dihitung saat output
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        
            }
    

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.err.println("Jumlah yang lulus: " +jumlahLulus);
        System.err.println("Jumlah yang tidak lulus: " +jumlahTidakLulus);

        sc.close();
    }
}

/*1. for (int i = 1; i <= 10; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
}
    int i =1 adalah inisialisasi angka 1(adalah nilai awal looping dimulai)
    <= 10; adalah lebih kecil sama dengan 10 (batasan seberapa looping itu muncul)
    kemudian System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ")(mencetak lalu disetiap nilai i tadi ditambah 1)


2. agar bisa dibandingkan ,ketika kita menginput nilai harus ada nilai awal yang bisa dibandingkan
3. di fungsi diatas untuk membandingkan nilai awal dengan nilai baru dan mengulangi perbandingan  */


    
    
    
    
    
    
    
