import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Hitung Nilai Akhir ===");

        System.out.print("Masukkan Nilai Presensi: ");
        double presensi = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        double nilaiAkhir = (0.10 * presensi) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);

        char grade;
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        input.close();
    }
}