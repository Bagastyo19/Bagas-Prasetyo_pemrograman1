import java.io.*;

public class Latihan2 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader(System.in));
        String gradestring = "";
        byte grade = 0;
        System.out.print("Ketik nilai Anda: ");
        try{
        gradestring = dataIn.readLine();
        }
        catch(IOException e){
        System.out.println("Ada kesalahan !");
        }

        //Konversi nilai string ke Byte
        grade = new Byte (gradestring);

        if (grade == 100) {
            System.out.println("Selamat Anda Lulus dengan Kategori Sempurna!");
            System.out.println("Karena nilai Anda "+grade+"!");
        } 
        else if (grade >= 95 ) {
            System.out.println("Selamat Anda Lulus dengan Kategori Sangat Memuaskan!");
            System.out.println("Karena nilai Anda "+grade+"!");
        } 
        else if (grade >= 90 ) {
            System.out.println("Selamat Anda Lulus dengan Kategori Memuaskan!");
            System.out.println("Karena nilai Anda "+grade+"!");
        } 
        else if (grade >= 80 ) {
            System.out.println("Selamat Anda Lulus dengan Kategori Baik!");
            System.out.println("Karena nilai Anda "+grade+"!");
        } 
        else {
            System.out.println("Maaf Anda Belum Lulus!");
            System.out.println("Karena nilai Anda "+grade+"!");
        }
    }
}