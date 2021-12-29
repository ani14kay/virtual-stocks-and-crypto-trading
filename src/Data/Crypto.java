package Data;

public class Crypto {
    String name;
    Double price;
    Double changeInPrice;

    public Crypto(String name, Double price, Double changeInPrice) {
        this.name = name;
        this.price = price;
        this.changeInPrice = changeInPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getChangeInPrice() {
        return changeInPrice;
    }

    public void setChangeInPrice(Double changeInPrice) {
        this.changeInPrice = changeInPrice;
    }
}
