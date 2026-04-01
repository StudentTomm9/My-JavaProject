package training4chapter;

public class tableTennisAthlete extends Person implements speakEnglish {
    public tableTennisAthlete() {
    }

    public tableTennisAthlete(String name, int age) {
        super(name, age);
    }
    public void sport() {
        System.out.println(getAge()+"岁的乒乓球运动员"+getName()+"需要打乒乓球");
    }
    public void English(){
        System.out.println(getAge()+"岁的乒乓球运动员"+getName()+"需要会说英语");
    }
}
