package training6chapter;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
        System.out.println("Phone类空参构造执行了");
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
