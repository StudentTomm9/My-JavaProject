package training6chapter;

import java.util.*;
import java.util.function.BiConsumer;

public class TreeMapTest1 {
    static void main(String[] args) {
        //本类旨在测试TreeMap练习
        // 需求1：按照ID的升序排序以及降序排序
//        TreeMap<Integer,String> THM = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            //降序排序
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        THM.put(123,"bread");
//        THM.put(456,"alcohol");
//        THM.put(679,"beef");
//
//          //默认为升序，改成o1-o2即可
//        System.out.println(THM);
        //需求2：按照学生年龄升序排序,年龄一样按姓名长度排序,同年龄姓名视为一个人
//        TreeMap<Student,String> tree = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o1.getAge() - o2.getAge();
//                  //年龄一样按姓名长度排序
//                return result = result == 0 ? o1.getName().length() - o2.getName().length() : result;
//            }
//        });
//        Student s1 = new Student("tommy",14);
//        Student s2 = new Student("linda",13);
//        Student s3 = new Student("authur",14);
//        Student s4 = new Student("tommy",14);
//
//        tree.put(s1,"伯明翰");
//        tree.put(s2,"吉普赛");
//        tree.put(s3,"伯明翰");
//        tree.put(s4,"伯明翰");//同年龄姓名视为一个人
//        System.out.println(tree);
        //需求3：统计字符串中每一个字符出现的次数
        String str = "aabbdabcdbcdadbce";

        TreeMap<Character, Integer> tmap = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (tmap.containsKey(temp)) {
                int count = tmap.get(temp);
                count++;
                tmap.put(temp,count);
            }else {
                tmap.put(temp,1);
            }
        }
            //利用StringBuilder遍历集合按指定格式输出
        StringBuilder sb = new StringBuilder();
        tmap.forEach((Character word, Integer i)-> sb.append(word).append("(").append(i).append(")"));
        System.out.println(sb);
        int[] n = new int[3];

    }
}
