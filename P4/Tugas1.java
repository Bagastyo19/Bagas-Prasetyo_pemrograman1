import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long[] laporanMingguan = new long[7];
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("=== Input Pengeluaran Mingguan ===");

        for (int i = 0; i < 7; i++) {
            System.out.println("\nHari " + namaHari[i] + ":");
            System.out.print("  Biaya Makan    : ");
            long makan = input.nextLong();
            System.out.print("  Biaya Transport: ");
            long transport = input.nextLong();
            System.out.print("  Biaya Belanja  : ");
            long belanja = input.nextLong();

            laporanMingguan[i] = makan + transport + belanja;
        }

        long max = laporanMingguan[0];
        long min = laporanMingguan[0];
        String hariTerboros = namaHari[0];
        String hariTerhemat = namaHari[0];
        long totalSeminggu = 0;

        for (int i = 0; i < 7; i++) {
            totalSeminggu += laporanMingguan[i];

            if (laporanMingguan[i] > max) {
                max = laporanMingguan[i];
                hariTerboros = namaHari[i];
            }
            if (laporanMingguan[i] < min) {
                min = laporanMingguan[i];
                hariTerhemat = namaHari[i];
            }
        }

        System.out.println("\n======================================");
        System.out.println("      RINGKASAN LAPORAN MINGGUAN      ");
        System.out.println("======================================");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-7s: Rp%,d\n", namaHari[i], laporanMingguan[i]);
        }
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL SEMINGGU  : Rp%,d\n", totalSeminggu);
        System.out.printf("RATA-RATA HARIAN: Rp%,d\n", totalSeminggu / 7);
        System.out.println("--------------------------------------");
        System.out.println("HARI TERBOROS   : " + hariTerboros + " (Rp" + String.format("%,d", max) + ")");
        System.out.println("HARI TERHEMAT   : " + hariTerhemat + " (Rp" + String.format("%,d", min) + ")");
        System.out.println("======================================");

        input.close();
    }
}