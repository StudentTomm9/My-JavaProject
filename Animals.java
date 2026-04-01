package training4chapter;

public abstract class Animals {
    private String name;
    private int age;

    public Animals() {
        System.out.println("Animals空参构造");
    }

    public Animals(String name, int age) {
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
    //行为：抽象方法
    public abstract void eat();
    //行为：常规方法
    public  void drink() {
        System.out.println(getName() + "在喝水");
    }
}
