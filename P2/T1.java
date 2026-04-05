import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama, nim, prodi, kelas, asal;
        int usia;

        System.out.println("=== Input Data Mahasiswa ===");

        System.out.print("Input Nama: ");
        nama = input.nextLine();

        System.out.print("Input NIM: "); 
        nim = input.nextLine();

        System.out.print("Input Program Studi: ");
        prodi = input.nextLine();

        System.out.print("Input Kelas: ");
        kelas = input.nextLine();

        System.out.print("Input Asal: ");
        asal = input.nextLine();

        System.out.print("Input Usia: ");
        usia = input.nextInt();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Program Studi  : " + prodi);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Asal           : " + asal);
        System.out.println("Usia           : " + usia);

        input.close();
    }
}