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

        
    String status;
    if (persentaseSedia >= 80) {
        status = "Sangat Aman";
    } else if (persentaseSedia >= 50) {
        status = "Cukup (Perlu Pantau)";
    } else if (persentaseSedia >= 20) {
        status = "Waspada (Segera Restock)";
    } else {
        status = "KRITIS (Stok Hampir Habis!)";
    }

    System.out.println("\n=======================================");
    System.out.println("       LAPORAN STATUS BARANG          ");
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