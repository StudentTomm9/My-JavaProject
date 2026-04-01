package training4chapter;

public class frog extends Animals implements swimming{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }
    //抽象类重写
    public void eat() {
        System.out.println(this.getName()+"吃虫子");
    }
    public void swim() {
        System.out.println(getName()+"在蛙泳");
    }
}
