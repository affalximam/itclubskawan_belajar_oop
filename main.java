abstract class Inventaris {
    // ENCAPSULATION
    private String namaBarang;
    private int jumlah;

    public Inventaris(String namaBarang, int jumlah) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // ABSTRACTION
    abstract void infoBarang();
}

// INHERITANCE
class Laptop extends Inventaris {

    public Laptop(String namaBarang, int jumlah) {
        super(namaBarang, jumlah);
    }

    // POLYMORPHISM
    @Override
    void infoBarang() {
        System.out.println("Laptop: " + getNamaBarang() + " | Stok: " + getJumlah());
    }
}

class Router extends Inventaris {

    public Router(String namaBarang, int jumlah) {
        super(namaBarang, jumlah);
    }

    // POLYMORPHISM
    @Override
    void infoBarang() {
        System.out.println("Router: " + getNamaBarang() + " | Stok: " + getJumlah());
    }
}

public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM
        Inventaris barang1 = new Laptop("Asus ROG", 10);
        Inventaris barang2 = new Router("Mikrotik RB750", 5);

        barang1.infoBarang();
        barang2.infoBarang();

        System.out.println("---- Peminjaman ----");

        // ENCAPSULATION (ubah stok)
        barang1.setJumlah(8); // dipinjam 2
        barang2.setJumlah(3); // dipinjam 2

        barang1.infoBarang();
        barang2.infoBarang();
    }
}
