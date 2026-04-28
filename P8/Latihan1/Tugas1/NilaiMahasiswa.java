package P8.Latihan1.Tugas1;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        do {
            // 1. Menginput nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();

            // 2. Menampilkan nilai yang diinput
            System.out.println("Nilai yang Anda masukkan adalah: " + nilai);

            // Menanyakan apakah ingin mengulang
            System.out.print("Apakah ingin mengulang input? (y/t): ");
            pilihan = input.next();

            // 3. & 4. Mengulang menggunakan do-while, berhenti jika user memilih 't'
        } while (!pilihan.equalsIgnoreCase("t"));

        System.out.println("Program selesai. Terima kasih!");
        input.close();
    }
}