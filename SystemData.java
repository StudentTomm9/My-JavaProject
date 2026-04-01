package training6chapter;

public class SystemData {
    private int id;
    private String name;
    private int age;
    private int grade;
    private int classNum;

    public SystemData() {
        System.out.println("学生数据系统空参构造执行了");
    }

    public SystemData(int id, String name, int age, int grade, int classNum) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNum = classNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }
}
