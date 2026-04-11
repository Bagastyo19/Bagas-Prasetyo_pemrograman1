import java.io.*;

public class Latihan3 {
    public static void main(String args[]) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String angkastring = "";
        byte angka = 0;

        System.out.print("Ketik angka 0..9: ");

        try {
            angkastring = dataIn.readLine();
            angka = Byte.parseByte(angkastring);
        } catch (IOException e) {
            System.out.println("Ada kesalahan IO!");
        } catch (NumberFormatException e) {
            System.out.println("Input bukan angka yang valid!");
        }

        switch (angka) {
            case 0:
                System.out.println("Angka yang diketik adalah nol");
                break;
            case 1:
                System.out.println("Angka yang diketik adalah satu");
                break;
            case 2:
                System.out.println("Angka yang diketik adalah dua");
                break;
            case 3:
                System.out.println("Angka yang diketik adalah tiga");
                break;
            case 4:
                System.out.println("Angka yang diketik adalah empat");
                break;
            case 5:
                System.out.println("Angka yang diketik adalah lima");
                break;
            case 6:
                System.out.println("Angka yang diketik adalah enam");
                break;
            case 7:
                System.out.println("Angka yang diketik adalah tujuh");
                break;
            case 8:
                System.out.println("Angka yang diketik adalah delapan");
                break;
            case 9:
                System.out.println("Angka yang diketik adalah sembilan");
                break;
            default:
                System.out.println("Angka yang diketik tidak sesuai (0-9)");
                break;
        }
    }
}