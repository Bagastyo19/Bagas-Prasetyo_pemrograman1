public class Latihanmentari {
    public static void main(String[] args) {
        int tegangan = 210;

        if (tegangan >= 220) {
            System.out.println("Terlalu tinggi, matikan panel!");
        } else if (tegangan < 200) {
            System.out.println("Terlalu rendah, gunskan stabilizer.");
        } else if (tegangan >= 200 && tegangan <= 220) {
            System.out.println("Aman, beroperasi normal.");
        } else {
            System.out.println("Sensor rusak");
        }
    }
}
