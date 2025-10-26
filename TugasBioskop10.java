import java.util.Scanner;

public class TugasBioskop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        double hargaTiket = 50000;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.");
                continue;
            }

        
            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85; 
                System.out.println("Diskon 15% diterapkan!");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; 
                System.out.println("Diskon 10% diterapkan!");
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            sc.nextLine(); 

            System.out.print("Apakah ada transaksi lain? (ya/tidak): ");
            lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("tidak")) {
                break;
            }

        } while (true);

        System.out.println("\n===== LAPORAN PENJUALAN HARI INI =====");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        sc.close();
    }
}
