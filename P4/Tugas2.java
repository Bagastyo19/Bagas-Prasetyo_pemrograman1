import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("=== Sistem Monitoring Stok Gudang ===");

        System.out.print("Masukkan Nama Barang         : ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan Jumlah Stok Saat Ini: ");
        int stokSekarang = input.nextInt();

        System.out.print("Masukkan Target Stok Maksimal: ");
        int targetStok = input.nextInt();

        double persentaseSedia = ((double) stokSekarang / targetStok) * 100;

        // Menggunakan Ternary Operator berantai sebagai pengganti if-else
        String status = (persentaseSedia >= 80) ? "Sangat Aman" :
                        (persentaseSedia >= 50) ? "Cukup (Perlu Pantau)" :
                        (persentaseSedia >= 20) ? "Waspada (Segera Restock)" : 
                        "KRITIS (Stok Hampir Habis!)";

        System.out.println("\n=======================================");
        System.out.println("       LAPORAN STATUS BARANG           ");
        System.out.println("=======================================");
        System.out.println("Nama Barang      : " + namaBarang);
        System.out.println("Jumlah Stok      : " + stokSekarang + " unit");
        System.out.println("Target Maksimal  : " + targetStok + " unit");
        System.out.println("---------------------------------------");
        System.out.printf("Kapasitas Terisi : %.1f%%\n", persentaseSedia);
        System.out.println("Status Gudang    : " + status);
        System.out.println("=======================================");

        input.close();
    }
}