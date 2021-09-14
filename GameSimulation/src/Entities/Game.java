package Entities;

public class Game {
    private int gameno;
    private String gameName;
    private double price;
    private int discount;

    public Game(int gameno, String gameName, double price, int discount) {
        this.gameno = gameno;
        this.gameName = gameName;
        this.price = price;
        this.discount = discount;
    }

    public int getGameno() {
        return gameno;
    }

    public void setGameno(int gameno) {
        this.gameno = gameno;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
