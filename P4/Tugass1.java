import java.util.Scanner;

public class Tugass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long[] laporanMingguan = new long[7];
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        long totalSeminggu = 0;
        long max = 0;
        long min = Long.MAX_VALUE;
        int idxMax = 0;
        int idxMin = 0;

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
            totalSeminggu += laporanMingguan[i];

            // Menggunakan Math.max/min untuk nilai
            long prevMax = max;
            long prevMin = min;
            max = Math.max(max, laporanMingguan[i]);
            min = Math.min(min, laporanMingguan[i]);

            // Menggunakan Ternary Operator untuk update indeks (Tanpa keyword 'if')
            idxMax = (laporanMingguan[i] >= max) ? i : idxMax;
            idxMin = (laporanMingguan[i] <= min) ? i : idxMin;
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
        System.out.printf("HARI TERBOROS   : %s (Rp%,d)\n", namaHari[idxMax], max);
        System.out.printf("HARI TERHEMAT   : %s (Rp%,d)\n", namaHari[idxMin], min);
        System.out.println("======================================");

        input.close();
    }
}