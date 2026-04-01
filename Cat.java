package training6chapter;

public class Cat extends Animals{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    //行为：吃，抓老鼠
    public  void eat(String something) {
        if (something == "鱼") {
            System.out.print(getAge()+"岁"+getColor()+"的猫两只前腿死死抱住"+something+"猛吃");
        } else if (something == "猫条") {
            System.out.println(getAge()+"岁"+getColor()+"的猫趴在鱼缸边抬头吃"+something);
        }
    }
    public static void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
