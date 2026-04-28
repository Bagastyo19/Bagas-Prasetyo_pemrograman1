package P8.Latihan1.Tugas2;

import java.util.Scanner;

public class MenghitungJumlahNilai{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        char pilihan;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            total += nilai; // Menjumlahkan nilai

            System.out.print("Tambah nilai lagi? (y/n): ");
            pilihan = input.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y'); // Perulangan do-while

        System.out.println("---");
        System.out.println("Total nilai akhir: " + total);
        
        input.close();
    }
}