package training6chapter;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionsTest {
    static void main(String[] args) {
        //本类旨在测试集合的综合练习
//        HereName stu1 = new HereName("zz",19,"女");
//        HereName stu2 = new HereName("ss",22,"男");
//        HereName stu3 = new HereName("ll",23,"女");
//        HereName stu4 = new HereName("kk",33,"男");
//        HereName stu5 = new HereName("ff",24,"男");
//        ArrayList<HereName> list = new ArrayList<>();
//        Collections.addAll(list,stu1,stu2,stu3,stu4,stu5);

          //需求1：随机点名
//        Random r = new Random();
//        int temp = r.nextInt(list.size());
//        System.out.println(list.get(temp));
          //需求2：70p随机男生 30p随机女生
//        ArrayList<HereName> boy = new ArrayList<>();
//        ArrayList<HereName> girl = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            HereName temperary = list.get(i);
//            if (temperary.getGender() == "男") {
//                Collections.addAll(boy,temperary);
//            }else {
//                Collections.addAll(girl,temperary);
//            }
//        }
//        ArrayList<Integer> intlist = new ArrayList<>();
//        Collections.addAll(intlist,1,1,1,1,1,1,1,0,0,0);
//        Random r = new Random();
//        int temp = r.nextInt(intlist.size());
//        int result = intlist.get(temp);
//        switch (result) {
//            case 1 -> {
//                Collections.shuffle(boy);
//                System.out.println(boy.get(0));
//            }
//            case 0 -> {
//                Collections.shuffle(girl);
//                System.out.println(girl.get(0));
//            }
//        }
        //要求3：被点到的学生将不会被再点到，若所有学生点完即开启第二轮
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"ll","zz","qq","aa","ss");
//        //创建一个临时的集合用来存储被点到学生的名字
//        ArrayList<String> list2 = new ArrayList<>();
//        for (int i =1 ; i <= 10; i++) {
//            System.out.println("----这是第"+i+"轮----");
//            int count = list.size();
//            Random r = new Random();
//            for (int j = 0; j < count; j++) {
//                int index = r.nextInt(list.size());
//                String name = list.remove(index);
//                list2.add(name);
//                System.out.println(name);
//            }
//            //此时表明一轮点名结束
//            //list空了而临时集合装满名字，将2的名字填充回list,然后清空2
//            list.addAll(list2);
//            list2.clear();
//        }
        //要求4：定义一个Map集合,健表示peovince,值表示city
          //定义一个Map集合
        Map<String,ArrayList<String>> map1 = new HashMap<>();
          //定义单列集合存储city
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"南京","扬州","苏州","无锡","常州");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"武汉","孝感","十堰","宜昌","鄂州");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"石家庄","唐山","邢台","保定","张家口");
          //将city存入map
        map1.put("江苏省",list1);
        map1.put("湖北省",list2);
        map1.put("河北省",list3);

          //打印map
        Set<Map.Entry<String, ArrayList<String>>> entries = map1.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + "=" + sj);
        }


    }
}
