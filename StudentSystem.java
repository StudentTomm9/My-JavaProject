package training6chapter;
//导入Scanner包
import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem {
    public static void main(String[] args) {
        System.out.println("--------学生管理系统--------");
        //创建学生数据库集合
        ArrayList<SystemData> list = new ArrayList<>();
        //使用switch语句搭建系统
        boolean flag = true;
        while(flag) {
            Scanner sc = new Scanner(System.in);
            //接收用户输入
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择");
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    add(list);
                    System.out.println(" ");
                }
                case 2 -> {
                    delete(list);
                    System.out.println(" ");
                }
                case 3 -> {
                    restore(list);
                    System.out.println(" ");
                }
                case 4 -> {
                    search(list);
                    System.out.println(" ");
                }
                case 5 -> {
                    System.out.println("系统已关闭，欢迎下次使用");
                    flag = false;
                }
            }
        }


    }
    //情况1：添加学生
    public static void add(ArrayList<SystemData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生年级");
        int grade = sc.nextInt();
        System.out.println("请输入学生班级");
        int classNumber = sc.nextInt();
        SystemData student = new SystemData(id,name,age,grade,classNumber);
        System.out.println("学生ID         学生姓名         学生年龄         学生年级        学生班级");
        String str = (student.getId() + "            " + student.getName() + "           " + student.getAge() + "              " + student.getGrade() + "              " + student.getClassNum());
        list.add(student);
        System.out.println(str);
        System.out.println("学生" + student.getName() + "已添加入系统");
    }
    //情况2:删除学生，id存在即删除，不存在即提示并返回初始菜单
    public static void delete(ArrayList<SystemData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID");
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            SystemData temp = list.get(i);
            int tempId = temp.getId();
            if (id == tempId) {
                SystemData delete = list.remove(i);
                System.out.println(tempId+"学生已删除");
            }else{
                System.out.println("ID不存在");
            }
        }
    }
    //情况3：修改学生，id存在继续录入其他信息，id不存在即提示并回初始
    public static void restore(ArrayList<SystemData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID");
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            SystemData temp = list.get(i);
            int tempId = temp.getId();
            if (id == tempId) {
                System.out.println("请输入学生姓名");
                String name = sc.next();
                System.out.println("请输入学生年龄");
                int age = sc.nextInt();
                System.out.println("请输入学生年级");
                int grade = sc.nextInt();
                System.out.println("请输入学生班级");
                int classNumber = sc.nextInt();
                SystemData student = new SystemData(id, name, age, grade, classNumber);
                list.set(i, student);
                System.out.println("学生" + student.getId() + "已修改");
                System.out.println("学生ID         学生姓名         学生年龄         学生年级        学生班级");
                String str = (student.getId() + "            " + student.getName() + "           " + student.getAge() + "              " + student.getGrade() + "              " + student.getClassNum());
                System.out.println(str);
            } else {
                System.out.println("ID不存在");
            }
        }
    }
    //查询学生：没有则提示，有则打印
    public static void search(ArrayList<SystemData> list) {
        for (int i = 0; i < list.size(); i++) {
            SystemData temp = list.get(i);
            System.out.println("学生ID         学生姓名         学生年龄         学生年级        学生班级");
            if(list != null) {
                String str = (temp.getId() + "            " + temp.getName() + "           " + temp.getAge() + "              " + temp.getGrade() + "              " + temp.getClassNum());
                System.out.println(str);
            }else{
                System.out.println("系统中暂无学生，请添加后哉查询");
            }

        }
    }
}
