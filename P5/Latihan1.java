package P5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOexception;


public class Latihan1 {
    public static void main( String[] args0){
        BufferedReader dataIN = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        Byte jmlData =0;
        Byte DataArray[];

        System.out.print("Masukkan jumlah data: ");
        try{
            BacaInput = dataIN.readLine();
        }
        catch( IOException e ){
            System.out.println("ada kesalahan!");
        }
        jmlData = new Byte (BacaInput);
        DataArray = new Byte[jmlData];

        //membaca data dari keyboard
        System.out.println();
        for (Byte i=0; i<jmlData; i++){
            System.out.print("DataArray["+i+"] = ");

            try{
                BacaInput = dataIN.readLine();
            }
            catch( IOException e ){
                System.out.println("ada kesalahan!");
            }
            DataArray[i] = new Byte (BacaInput);
            }
            //menampilkan data dari array
            System.out.println();
            for (Byte i = 0;i<jmlData;i++){
                System.out.println("DataArray["+i+"] = "+DataArray[i]);
            }
        }

    }
    

