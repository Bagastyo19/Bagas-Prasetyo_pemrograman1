package P7;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPertemuan = 21;
        // Syarat kehadiran 75% dari 21 adalah 15.75 (berarti minimal 16 kali hadir)
        double syaratKehadiran = 0.75 * totalPertemuan;

        System.out.print("Masukkan jumlah kehadiran (0 - " + totalPertemuan + "): ");
        int jumlahKehadiran = scanner.nextInt();

        // 1. Cek syarat kehadiran terlebih dahulu
        if (jumlahKehadiran >= syaratKehadiran) {
            System.out.print("Masukkan nilai akhir: ");
            double nilaiAkhir = scanner.nextDouble();
            String grade;
        
            if (nilaiAkhir >= 80) {
                grade = "A";
            } else if (nilaiAkhir >= 70) {
                grade = "B";
            } else if (nilaiAkhir >= 60) {
                grade = "C";
            } else if (nilaiAkhir >= 55) {
                grade = "D";
            } else {
                grade = "E";
            }

            System.out.println("\n--- Hasil Penilaian ---");
            System.out.println("Nilai: " + nilaiAkhir);
            System.out.println("Grade: " + grade);
            System.out.println("Status: LULUS");
            System.out.println("-----------------------");

        } else {
            // 2. Jika kehadiran kurang dari 75%
            System.out.println("\n--- Hasil Penilaian ---");
            System.out.println("Anda tidak memenuhi syarat kehadiran minimum.");
            System.out.println("Kehadiran Anda: " + jumlahKehadiran + " (Minimal: " + (int)Math.ceil(syaratKehadiran) + ")");
            System.out.println("Grade: E (Otomatis)");
            System.out.println("-----------------------");
        }

        scanner.close();
    }
}