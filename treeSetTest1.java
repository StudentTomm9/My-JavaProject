package training6chapter;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSetTest1 {
    static void main(String[] args) {
        //本类旨在测试TreeSet练习
//        //test1
//        Student s5 = new Student("ll",21);
//        Student s6 = new Student("cc",20);
//        Student s7 = new Student("zz",25);
//
//        TreeSet<Student> ts = new TreeSet<>();
//        ts.add(s5);ts.add(s6);ts.add(s7);
//        ts.forEach(student -> System.out.println(student.getName()));
          //test2
        stu s1 = new stu("zz",25,130,100,140);
        stu s2 = new stu("ll",19,110,100,135);
        stu s3 = new stu("cc",24,120,130,120);
        stu s4 = new stu("ss",28,130,100,140);

        TreeSet<stu> ts = new TreeSet<>();
        ts.add(s1);     ts.add(s2);     ts.add(s3);     ts.add(s4);
        for(stu t : ts) {
            System.out.println(t);
        }
    }
}
class stu implements Comparable<stu> {
    private String name;
    private int age;
    private int chinesescore;
    private int mathscore;
    private int englishscore;

    public stu() {
    }

    public stu(String name, int age, int chinesescore, int mathscore, int englishscore) {
        this.name = name;
        this.age = age;
        this.chinesescore = chinesescore;
        this.mathscore = mathscore;
        this.englishscore = englishscore;
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

    public int getChinesescore() {
        return chinesescore;
    }

    public void setChinesescore(int chinesescore) {
        this.chinesescore = chinesescore;
    }

    public int getMathscore() {
        return mathscore;
    }

    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }

    public int getEnglishscore() {
        return englishscore;
    }

    public void setEnglishscore(int englishscore) {
        this.englishscore = englishscore;
    }

    @Override
    public String toString() {
                return "name='" + name + '\'' +
                ", age=" + age;
    }

    @Override
    public int compareTo(stu o) {
        int sum1 = this.getChinesescore() + this.getMathscore() + this.getEnglishscore();
        int sum2 = o.getChinesescore() + o.getMathscore() + o.getEnglishscore();

        int result = sum1 - sum2;
        result = result == 0 ? this.getChinesescore() - o.getChinesescore() : result;
        result = result == 0 ? this.getMathscore() - o.getMathscore() : result;
        result = result == 0 ? this.getEnglishscore() - o.getEnglishscore() : result;
        result = result == 0 ? this.getAge() - o.getAge() : result;
        result = result == 0 ? this.getName().length() - o.getName().length() : result;
        return result;
    }
}
