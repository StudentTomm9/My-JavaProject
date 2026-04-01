package training6chapter;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList2 {
    static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //学生对象数据来自键盘录入
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name= sc.next();s1.setName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();s1.setAge(age);
        //添加元素
        list.add(s1);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }


    }

}
