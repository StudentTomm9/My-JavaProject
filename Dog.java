package training6chapter;

public class Dog extends Animals{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //行为：吃，看家

    public  void eat(String something) {
        if (something == "骨头") {
            System.out.println(getAge()+"岁"+getColor()+"的狗两只前腿死死抱住"+something+"猛吃");
        } else if (something == "屎") {
            System.out.println(getAge()+"岁"+getColor()+"的狗趴在猫砂盆里对着"+something+"猛吃");
        }
    }
    public static void lookhome() {
        System.out.println("狗在看家");
    }
}
