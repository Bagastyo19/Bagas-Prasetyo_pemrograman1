package P8.Latihan1.Tugas3;

import java.util.Scanner;

public class HitungRataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalNilai = 0;
        int jumlahData = 0;
        char pilihan;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            
            totalNilai += nilai;
            jumlahData++;

            System.out.print("Input nilai lagi? (y/n): ");
            pilihan = input.next().toLowerCase().charAt(0);
            
        } while (pilihan == 'y');

        if (jumlahData > 0) {
            double rataRata = totalNilai / jumlahData;
            System.out.println("\n--- Hasil ---");
            System.out.println("Total Nilai: " + totalNilai);
            System.out.println("Jumlah Mahasiswa: " + jumlahData);
            System.out.println("Rata-rata Nilai: " + rataRata);
        } else {
            System.out.println("Tidak ada data yang dimasukkan.");
        }

        input.close();
    }
}
    

