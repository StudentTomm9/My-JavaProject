package training4chapter;

public class girl {
    private String name;
    private int age;

    public girl() {
    }

    public girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new ArrayIndexOutOfBoundsException();
        }else{
            this.age = age;;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() >10) {
            throw new ArrayIndexOutOfBoundsException();
        }else{
            this.name = name;
        }

    }
}
