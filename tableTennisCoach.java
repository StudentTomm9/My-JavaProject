package training4chapter;

public class tableTennisCoach extends Person implements speakEnglish{
    public tableTennisCoach() {
    }

    public tableTennisCoach(String name, int age) {
        super(name, age);
    }
    public void sport() {
        System.out.println(getAge()+"岁的乒乓球教练"+getName()+"教打乒乓球");
    }
    public void English() {
        System.out.println(getAge()+"岁的乒乓球教练"+getName()+"需要会说英语");
    }
}
