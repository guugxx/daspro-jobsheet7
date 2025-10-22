import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}

//1. yang pertama tertinggi adalah 100 seperti disoal,lalu setelah kita masukkan nilai nanti akan dibandingkan nilai 
// awal nanti akan digantikan yang tertinggi dan terendah
//2. agar bisa dibandingkan ,ketika kita menginput nilai harus ada nilai awal yang bisa dibandingkan
//3. 

    
    
    
    
    
    
    
