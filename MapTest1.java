package training6chapter;

import java.util.*;
import java.util.function.Consumer;

public class MapTest1 {
    static void main(String[] args) {
        //本类旨在测试Map练习
          //遍历Map双列集合
        Map<String , String> map = new HashMap<>();
        map.put("克林顿","奥巴马");
        map.put("则连斯基","普京");
        Set<String> keys = map.keySet();
            //迭代器遍历
//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            String value = map.get(key);
//            System.out.println(key + "=" + value);
//        }
            //lambda表达式遍历
//        keys.forEach(s -> System.out.println(s + "=" + map.get(s)));
          //利用键值对获取每一个键值对象并使用getkey,getvalue
//        Set<Map.Entry<String,String>> entries = map.entrySet();
//        //可使用增强for遍历
//        for (Map.Entry<String,String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }
          //存储学生对象并遍历
//        Student l1 = new Student("ll",12);
//        Student c1 = new Student("cc",15);
//        Student x1 = new Student("xx",16);
//        Student x2 = new Student("xx",16);//同一学生不添加
//
//        Map<Student,String> map1 = new HashMap<>();
//        map1.put(l1,"深圳");map1.put(c1,"揭阳");map1.put(x1,"揭阳");map1.put(x2,"揭阳");
//
//        Set<Student> Stu = map1.keySet();
//        Stu.forEach(s -> System.out.println(s.getName() + " " + s.getAge() + "=" + map1.get(s)));
          //80学生景点投票问题
            //定义一个数组存储景点
        String[] arr = {"A","B","C","D"};
            //利用随机数模拟80人投票,并把投票结果存入集合
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for ( int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        Map<String,Integer> map2 = new HashMap<>();
        for (String name : list) {
            //判断当前景点是否存在于map集合
            if (map2.containsKey(name)) {
                //存在
                //先获取当前景点的被投票次数
                int count = map2.get(name);
                //表示当前景点被投票次数+1
                count++;
                //将值放回集合中
                map2.put(name,count);
            }else {
                //不存在
                map2.put(name,1);
            }
        }
        System.out.println(map2);
              //将最大值输出
        int max = 0;String result = " ";
        Set<Map.Entry<String, Integer>> entries = map2.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int temp = entry.getValue();
            if ( temp > max) {
                max = temp;
                result = entry.getKey();
            }
        }
        System.out.println(max + result);

    }

}
