package training6chapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {
    static void main(String[] args) {
        //测试1：定义一个集合并添加一些整数，过滤奇数保留偶数将结果返回
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
//
//        list.stream()
//                .filter(s -> s % 2 == 0)
//                .forEach(s -> System.out.println(s));
        //测试2：创建一个Arraylist集合并添加以下字符串，保留年龄>=24的人，并返回结果到Map中，名为键，年龄为值
//          ArrayList<String> list1 = new ArrayList<>();
//          Collections.addAll(list1,"zhangsan,23","lisi,24","wangwu,25");
//
//          Map<String,Integer> map = list1.stream()
//                  .filter(s-> Integer.parseInt(s.split(",")[1]) >= 24)
//                  .collect(Collectors.toMap(
//                          s -> s.split(",")[0],
//                          s -> Integer.parseInt(s.split(",")[1])
//                  ));
//          System.out.println(map);
        /*现在有两个ArrayList集合,
          第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
          姓名和年龄中间用逗号隔开。比如:张三,23
          要求完成如下的操作:
          1,男演员只要名字为3个字的前两人
          2,女演员只要姓陈的,并且不要第一个
          3,把过滤后的男演员姓名和女演员姓名合并到一起
          4,将所有的演员对象都保存到List集合中。*/
        Actor b1 = new Actor("张三",23);
        Actor b2 = new Actor("李四",24);
        Actor b3 = new Actor("谢舒博",25);
        Actor b4 = new Actor("沈腾",50);
        Actor b5 = new Actor("吴世勋",33);
        Actor b6 = new Actor("吕郑豪",33);
        Actor g1 = new Actor("张元英",22);
        Actor g2 = new Actor("柳智敏",25);
        Actor g3 = new Actor("申有娜",22);
        Actor g4 = new Actor("王楚然",22);
        Actor g5 = new Actor("陈五六",22);
        Actor g6 = new Actor("陈都灵",31);

        //4,将所有的演员对象都保存到List集合中
        ArrayList<Actor> actors = new ArrayList<>();
        Collections.addAll(actors,b1,b2,b3,b4,b5,b6);
        ArrayList<Actor> actress = new ArrayList<>();
        Collections.addAll(actress,g1,g2,g3,g4,g5,g6);

        //1,男演员只要名字为3个字的前两人
        Stream<Actor> stream1 = actors.stream()
                .filter(man -> man.getName().length() == 3 )
                .limit(2);
        //2,女演员只要姓陈的,并且不要第一个
        Stream<Actor> stream2 = actress.stream()
                .filter(woman -> woman.getName().charAt(0) == '陈')
                .skip(1);
        //3,把过滤后的男演员姓名和女演员姓名合并到一起
        Stream.concat(stream1,stream2)
                .forEach(s -> System.out.println(s));

    }
}
