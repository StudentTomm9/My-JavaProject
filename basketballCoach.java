package training4chapter;

public class basketballCoach extends Person{
    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }
    public void sport() {
        System.out.println(getAge()+"岁的篮球教练"+getName()+"教打篮球");
    }
}
