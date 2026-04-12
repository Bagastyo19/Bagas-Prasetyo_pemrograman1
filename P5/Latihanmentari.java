package P5;

public class Latihanmentari {
    public static void main(String[] args) {
        int uangSaku = 15000;

        if (uangSaku >= 50000) {
            System.out.println("Naik taksi online agar nyaman.");
        } else if (uangSaku >= 20000) {
            System.out.println("Naik ojek online saja.");
        } else if (uangSaku >= 5000) {
            System.out.println("Naik angkot atau bus umum.");
        } else {
            System.out.println("Jalan kaki saja sambil olahraga.");
        }
    }
}