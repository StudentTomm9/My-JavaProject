package training6chapter;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //行为：喂养动物
    public void keepPet(Animals animals,String something) {
        if(animals instanceof Dog dog) {
            System.out.println("年龄为"+age+"的"+name+"养了一只"+animals.getAge()+"岁的"+animals.getColor()+"狗");
            animals.eat(something);
        }
        if(animals instanceof Cat cat) {
            System.out.println("年龄为"+age+"的"+name+"养了一只"+cat.getAge()+"岁的"+cat.getColor()+"猫");
            cat.eat(something);
        }
    }
}
