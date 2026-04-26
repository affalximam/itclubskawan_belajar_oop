abstract class Crypto {
    // ENCAPSULATION
    private double price;
    private String currency;

    public Crypto(double price, String currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // ABSTRACTION
    abstract void getPriceInfo();
}

// INHERITANCE
class Bitcoin extends Crypto {

    public Bitcoin(double price, String currency) {
        super(price, currency);
    }

    // POLYMORPHISM
    @Override
    void getPriceInfo() {
        System.out.println("Bitcoin price: " + getPrice() + " " + getCurrency());
    }
}

class Ethereum extends Crypto {

    public Ethereum(double price, String currency) {
        super(price, currency);
    }

    // POLYMORPHISM
    @Override
    void getPriceInfo() {
        System.out.println("Ethereum price: " + getPrice() + " " + getCurrency());
    }
}

public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM (reference Crypto, object beda-beda)
        Crypto btc = new Bitcoin(1000000000, "IDR");
        Crypto eth = new Ethereum(50000000, "IDR");

        btc.getPriceInfo();
        eth.getPriceInfo();

        System.out.println("---- Update Harga ----");

        // ENCAPSULATION (ubah lewat setter)
        btc.setPrice(1200000000);
        eth.setPrice(55000000);

        btc.getPriceInfo();
        eth.getPriceInfo();
    }
}
