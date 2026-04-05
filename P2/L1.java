import java.util.Scanner;
    public class L1{
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
                String nama;  int usia;
                
                System.out.print("input nama: ");
                nama = input.nextLine();
                System.out.print("input Umur: ");
                usia = input.nextInt();

                System.out.println(" Nama : " + nama );
                System.out.println(" Umur : " + usia );

        }
    }