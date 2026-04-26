abstract class Saham {
    // ENCAPSULATION
    private String nama;
    private double harga;

    public Saham(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // ABSTRACTION
    abstract void infoSaham();
}

// INHERITANCE
class SahamTeknologi extends Saham {

    public SahamTeknologi(String nama, double harga) {
        super(nama, harga);
    }

    // POLYMORPHISM
    @Override
    void infoSaham() {
        System.out.println("Saham Teknologi: " + getNama() + " | Harga: " + getHarga());
    }
}

class SahamPerbankan extends Saham {

    public SahamPerbankan(String nama, double harga) {
        super(nama, harga);
    }

    // POLYMORPHISM
    @Override
    void infoSaham() {
        System.out.println("Saham Bank: " + getNama() + " | Harga: " + getHarga());
    }
}

public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM
        Saham s1 = new SahamTeknologi("GOTO", 120);
        Saham s2 = new SahamPerbankan("BBCA", 9000);

        s1.infoSaham();
        s2.infoSaham();

        System.out.println("---- Update Harga ----");

        // ENCAPSULATION
        s1.setHarga(130);
        s2.setHarga(9200);

        s1.infoSaham();
        s2.infoSaham();
    }
}
