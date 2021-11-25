package Data;

import javax.swing.*;

public class Stock {
    String name;
    int price;
    int changeInPrice;
    JButton buy;

    public Stock(String name, int price, int changeInPrice, JButton buy) {
        this.name = name;
        this.price = price;
        this.changeInPrice = changeInPrice;
        this.buy = buy;
    }

    public Stock(String name, int price, int changeInPrice) {
        this.name = name;
        this.price = price;
        this.changeInPrice = changeInPrice;
    }

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChangeInPrice() {
        return changeInPrice;
    }

    public void setChangeInPrice(int changeInPrice) {
        this.changeInPrice = changeInPrice;
    }
}
