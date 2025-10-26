import java.util.Scanner;

public class Parkir10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, jam;
        double totalBayar = 0;

        System.out.println("=== Program Parkir ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Selesai");

        do {
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break; 
            }

            System.out.print("Masukkan lama parkir (jam): ");
            jam = sc.nextInt();

            double biaya = 0;

            
            if (jam > 5) {
                biaya = 12500;
            } else {
                if (jenis == 1) {
                    biaya = jam * 3000;
                } else if (jenis == 2) {
                    biaya = jam * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid!");
                    continue;
                }
            }

            System.out.println("Biaya parkir kendaraan ini: Rp " + biaya);
            totalBayar += biaya;

        } while (true);

        System.out.println("\n=== TOTAL PEMBAYARAN PARKIR ===");
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        sc.close();
    }
}
