package training6chapter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodQuote1 {
    void main(String[] args) {
        //练习1：将集合中的数字转换为int类型
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"1","2","3","4","5");
//
//        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
//
        /*需求:集合中有一些名字,按照要求过滤数据
              要求:只要以张开头,而且名字是3个字的*/
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"张无忌","周芷若","张强","张三丰");
//
//        list.stream().filter(this::stringJudge).forEach(s -> System.out.println(s));
        /*集合里面存储姓名和年龄,比如:张无忌,15
          要求:将数据封装成Student对象并收集到List集合中*/
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"张无忌,15","周芷若,16","张强,17","张三丰,17");
//
//        List<Student> newlist2 = list.stream().map(Student::new).collect(Collectors.toList());
//        System.out.println(newlist2);
        //练习1:集合中存储一些字符串的数据,比如:张三,23。
        //收集到Student类型的数组当中(使用方法引用完成)
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"张无忌,15","周芷若,16","张强,17","张三丰,17");
//        Student[] stu = list.stream().map(Student::new).toArray(Student[]::new);
//        System.out.println(Arrays.toString(stu));
        /*需求:创建集合添加学生对象
              要求:获取姓名并放到数组当中使用方法引用完成*/
//        ArrayList<Student> list1 = new ArrayList<>();
//        list1.add(new Student("zhangsan",13));
//        list1.add(new Student("lisi",14));
//        list1.add(new Student("wangwu",15));
//
//        String[] array = list1.stream().map(Student::getName).toArray(String[]::new);
//        System.out.println(Arrays.toString(array));
        /*练习3:创建集合添加学生对象
               把姓名和年龄拼接成:张三-23的字符串,并放到数组当中(使用方法引用完成)*/
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("zhangsan",13));
        list1.add(new Student("lisi",14));
        list1.add(new Student("wangwu",15));

        String[] arr = list1.stream()
                .map(s -> s.getName()+"-"+s.getAge())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }
    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
