package object_study.basic_study;

public class Phone {
    private String brand;
    private double price;

    public Phone() {

    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        if (price > 1000 && price <= 50000) {
            this.price = price;
        } else {
            System.out.println("价格设置不合理！");
        }
    }

    public double getPrice() {
        return price;
    }

    public void call() {
        System.out.println("打电话！");
    }

    public void playGames() {
        System.out.println("打游戏！");
    }
}
