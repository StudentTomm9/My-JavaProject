package training4chapter;

public class Dog extends Animals implements swimming{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(this.getName()+"吃骨头");
    }
    public void swim() {
        System.out.println(getName()+"在狗刨");
    }
}
