package training6chapter;
import java.util.ArrayList;
import java.util.Random;
public class GenericTest1 {
    static void main(String[] args) {
        //本类旨在测试泛型练习
          //定义一个继承结构并实现泛型通配符指定功能
        PersianCat p1 = new PersianCat("pp",2);
        CivetCat c1 = new CivetCat("cc",3);
        Teddy t1 = new Teddy("tt",1);
        Husky h1 = new Husky("hh",5);
        ArrayList<Animal> total = new ArrayList<>();
        ArrayList<Cat2> cat = new ArrayList<>();   ArrayList<Dog2> dog = new ArrayList<>();
        total.add(p1);total.add(c1);total.add(t1);total.add(h1);cat.add(p1);cat.add(c1);dog.add(t1);dog.add(h1);
//        keepPet(total);
//        keepPet1(cat);
//        keepPet2(dog);
    }
    //定义一个方法用于饲养动物
    public static void keepPet(ArrayList<? extends Animal> total) {
        //要求0：遍历集合，调用动物的eat方法
        for (int i = 0; i < total.size(); i++) {
            System.out.println(total.get(i).eat());
        }
    }
    public static void keepPet1(ArrayList<? extends Cat2> cat) {
        //要求1：养所有品种猫不得有狗
        for (int i = 0; i < cat.size(); i++) {
            System.out.println(cat.get(i).eat());
        }
    }
    public static void keepPet2(ArrayList<? extends Dog2> dog) {
        //要求2：养所有品种狗不得有猫
        for (int i = 0; i < dog.size(); i++) {
            System.out.println(dog.get(i).eat());
        }
    }
}
abstract class  Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  String eat() {
        String str = "eat somgthing";
        return str;
    }
}
class Cat2 extends Animal {
    public Cat2() {
    }

    public Cat2(String name, int age) {
        super(name, age);
    }
    public String eat() {
        String str = "一只叫做" + this.getName() + "的" + this.getAge() + "岁的";
        return str;
    }
}
class PersianCat extends Cat2 {
    public PersianCat() {
    }

    public PersianCat(String name, int age) {
        super(name, age);
    }
    public String eat() {
        String str = "一只叫做" + this.getName() + "的" + this.getAge() + "岁的波斯猫";
        Random r = new Random();
        int temp = r.nextInt(2) + 1;
        if (temp == 1) {
            String s1 = "正在吃鱼";
            return str + s1;
        }else {
            String s2 = "正在吃小饼干";
            return str + s2;
        }
    }
}
class CivetCat extends Cat2 {
    public CivetCat() {
    }

    public CivetCat(String name, int age) {
        super(name, age);
    }
    public String eat() {
        String str = "一只叫做" + this.getName() + "的" + this.getAge() + "岁的狸花猫";
        Random r = new Random();
        int temp = r.nextInt(2) + 1;
        if (temp == 1) {
            String s1 = "正在吃鱼";
            return str + s1;
        }else {
            String s2 = "正在吃小饼干";
            return str + s2;
        }
    }
}
class Dog2 extends Animal {
    public Dog2() {
    }

    public Dog2(String name, int age) {
        super(name, age);
    }
    public String eat() {
        String str = "一只叫做" + this.getName() + "的" + this.getAge() + "岁的狗";
        Random r = new Random();
        int temp = r.nextInt(2) + 1;
        if (temp == 1) {
            String s1 = "正在吃bone,边吃边蹭";
            return str + s1;
        }else {
            String s2 = "正在吃bone,边吃边拆家";
            return str + s2;
        }
    }
}
class Teddy extends Dog2 {
    public Teddy() {
    }

    public Teddy(String name, int age) {
        super(name, age);
    }
    public String eat() {
        String str = "一只叫做" + this.getName() + "的" + this.getAge() + "岁的泰迪";
        Random r = new Random();
        int temp = r.nextInt(2) + 1;
        if (temp == 1) {
            String s1 = "正在吃bone,边吃边蹭";
            return str + s1;
        }else {
            String s2 = "正在吃bone,边吃边拆家";
            return str + s2;
        }
    }
}
class Husky extends Dog2 {
    public Husky() {
    }

    public Husky(String name, int age) {
        super(name, age);
    }
    public String eat() {
        String str = "一只叫做" + this.getName() + "的" + this.getAge() + "岁的哈士奇";
        Random r = new Random();
        int temp = r.nextInt(2) + 1;
        if (temp == 1) {
            String s1 = "正在吃bone,边吃边蹭";
            return str + s1;
        }else {
            String s2 = "正在吃bone,边吃边拆家";
            return str + s2;
        }
    }
}
