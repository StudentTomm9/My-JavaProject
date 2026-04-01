package training6chapter;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
    static void main(String[] args) {
        //本类旨在测试哈希set练习
          //创建学生对象
        Student s1 = new Student("ll",19);
        Student s2 = new Student("cc",20);
        Student s3 = new Student("zz",25);
        Student s4 = new Student("ll",19);

          //创建HashSet并存储学生对象
          //学生对象的成员变量值相同时，认为是同一个对象，则不予存储
        HashSet<Student> hlist = new HashSet<>();
        hlist.add(s1);hlist.add(s2);hlist.add(s3);
        System.out.println(hlist.add(s4));
        //使用迭代器进行遍历
        Iterator<Student> IT = hlist.iterator();
        while (IT.hasNext()) {
            Student member = IT.next();
            System.out.println(member.getName() + " " + member.getAge());
        }
    }
}
