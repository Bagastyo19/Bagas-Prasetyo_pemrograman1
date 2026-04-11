package P5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; 

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        Byte JmlData = 0;
        Byte DataArray[];

        try {
            System.out.print("Jumlah data : ");
            BacaInput = dataIn.readLine();
            JmlData = Byte.valueOf(BacaInput);
            DataArray = new Byte[JmlData];

            // Membaca data dari keyboard
            for (int i = 0; i < JmlData; i++) {
                System.out.print("DataArray[" + i + "] = ");
                BacaInput = dataIn.readLine();
                DataArray[i] = Byte.valueOf(BacaInput);
            }

            // 1. Mengurutkan Data
            Arrays.sort(DataArray);

            // 2. Mencari Nilai Minimal dan Maksimal
            byte min = DataArray[0];
            byte max = DataArray[JmlData - 1];

            // Menampilkan hasil
            System.out.println("\n--- Hasil Pengolahan Data ---");
            System.out.println("Data setelah diurutkan: " + Arrays.toString(DataArray));
            System.out.println("Nilai Minimal : " + min);
            System.out.println("Nilai Maksimal : " + max);

        } catch (IOException e) {
            System.out.println("Ada kesalahan input!");
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}