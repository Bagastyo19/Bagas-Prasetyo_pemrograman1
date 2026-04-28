package P7.Tugas;

public class Tugas1 {
    Public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalpertemuan = 21;
        double batasMinimalHadir = 0.75 * totalpertemuan; // 15.75 (16 kali)

        System.out.println("=====================================");
        System.out.println("    PROGRAM HITUNG NILAI MAHASISWA   ");
        System.out.println("=====================================");

        // 1. Validasi Kehadiran
        System.out.print("Masukan Jumlah Kehadiran (0-21): ");
        int jmlHadir = input.nextInt();

        if (jmlHadir >= batasMinimalHadir) {
            //2. Input Nilai Akhir
            System.out.println("/n--- Input Komponen Nilai (0-100) ---");
            System.out.println("Nilai Presensi : "); double nPresensi = input.nextDouble();
            System.out.println("Nilai Tugas    : "); double nTugas = input.nextDouble();
            System.out.println("Nilai UTS      : "); double nUTS = input.nextDouble();
            System.out.println("Nilai UAS       : "); double nUAS = input.nextDouble();

            //3. Perhitungan Nilai Akhir sesuai Bobot
            double nilaiAkhir = (0.10 * nPresensi) + (0.20 * nTugas) + (0.30 * nUTS) +(0.40 * nUAS);

            //4/ Penentuan Grade
            String grade;
            if (nilaiAkhir >= 85){
                grade = "A";
            } else if (nilaiAkhir >= 75){
                grade = "B";
            } else if (nilaiAkhir >= 65){
                grade = "C";
            } else if (nilaiAkhir >= 50){
                grade = "D";
            } else {
                grade = "E";
            }

            //5. Output Hasil
            System.out.println("\n==============================");
            System.out.println("    HASIL EVALUASI AKHIR  ");
            System.out.println("================================");
            System.out.println("Kehadiran: " + jmlHadir + "Kali (Lolos");
            System.out.println("Total Nilai: " + nilaiAkhir);
            System.out.println("Grade: " + grade);

            // Status Lulus (Cek apakah Grade bukan E)
            if (nilaiAkhir >= 50){
                System.out.println("Status: LULUS");
            } else {
                System.out.println("Status: TIDAK LULUS");
            } 
            System.out.println("================================");
        } else {
            // Jika kehadiran tidak mencukupi
            System.out.println("\n==============================");
            System.out.println("    HASIL EVALUASI AKHIR  ");
            System.out.println("================================");
            System.out.println("Status       : TIDAK LULUS (GUGUR)");
            System.out.println("Alasan       : Kehadiran Kurang dari 75%");
            System.out.println("Jumlah Hadir : " + jmlHadir + " (Minimal 16)");
            System.out.println("Grade        : E");
            System.out.println("================================");
        }
        
        input.close();
    }
}            
    

