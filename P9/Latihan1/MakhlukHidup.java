package P9.Latihan1;

// Definisi Abstract Class
abstract class LivingThing {
    public void breath() {
        System.out.println("Bernafas melalui hidung.");
    }

    public void eat() {
        System.out.println("Makan melalui mulut.");
    }

    /**
     * abstract method walk
     * Kita ingin method ini di-overridden oleh subclasses
     */
    public abstract void walk();
}

// Implementasi pada subclass Human
class Human extends LivingThing {
    /** Mengimplementasikan metode abstrak */
    public void walk() {
        System.out.println("Berjalan dengan 2 kaki.");
    }
}

// Implementasi pada subclass Cat
class Cat extends LivingThing {
    /** Mengimplementasikan metode abstrak */
    public void walk() {
        System.out.println("Berjalan dengan 4 kaki.");
    }
}

// Main Class untuk menjalankan program
public class MakhlukHidup {
    public static void main(String args[]) {
        Human Manusia = new Human();
        Cat Kucing = new Cat();

        System.out.println("Manusia :");
        Manusia.breath();
        Manusia.eat();
        Manusia.walk();

        System.out.println();

        System.out.println("Kucing :");
        Kucing.breath();
        Kucing.eat();
        Kucing.walk();
    }
}