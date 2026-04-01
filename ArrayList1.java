package training6chapter;
import java.util.ArrayList;
public class ArrayList1 {
    static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("元素1");
//        list.add("元素2");
//        list.add("元素3");
//
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            if ( i < list.size() -1) {
//                System.out.print(str+",");
//            }else if (i == list.size() - 1) {
//                System.out.print(str);
//            }else {
//                System.out.println("Error");
//            }
//        }
//        System.out.println("]");

        //往集合中添加对象
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("zhangsan",11);
        Student s2 = new Student("lisi",11);
        Student s3 = new Student("wangwu",11);
        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }



    }
}
