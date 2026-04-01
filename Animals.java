package training6chapter;

public class Animals {
    private int age;
    private String color;

    public Animals() {
        System.out.println("DOG空参构造运行了");
    }

    public Animals(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void eat(String something){
        System.out.println("吃东西");
    }
}
