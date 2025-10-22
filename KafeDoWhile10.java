import java.util.Scanner;

public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double totalHarga;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + " adalah Rp" + totalHarga);
            System.out.println("Total yang Harus Dibayar: Rp "+ totalHarga);
            sc.nextLine();

        } while (true);

        sc.close();
    }
}

/*1. perluangan tetap dilakukan 1 kali
 * 2. saat pengguna mengetikkan batal akan berhenti
 * 3. akan sbervalue benar terus menerus hingga infinite loop sampai ada break
 * 4. Karena selama kondisi while(true) selalu benar, maka loop akan berjalan terus.
Perulangan tidak memerlukan variabel penghitung
 */
