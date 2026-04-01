package training4chapter;

public class basketballAthlete extends Person {
    public basketballAthlete() {
    }

    public basketballAthlete(String name, int age) {
        super(name, age);
    }
    public void sport() {
        System.out.println(getAge()+"岁的篮球运动员"+getName()+"需要打篮球");
    }
}
