package training4chapter;

public class sheep extends Animals{
    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(this.getName()+"吃虫子");
    }
}
