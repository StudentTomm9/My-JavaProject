package training6chapter;
//导入集合包
import java.util.ArrayList;
public class ArrayListTestStandard {
    static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //虚拟机用[]包裹集合内容，现在集合为空长度为0，集合可以自动扩容

        //添加元素,使用.add()
        list.add("Sabrina");
        list.add("Tomas");
        list.add("Linda");
        System.out.println(list);//[Sabrina, Tomas, Linda]
        //此时集合长度为3

        //删除元素,使用.remove()
        //1.使用字符串删除
        /*list.remove("Tomas");
        System.out.println(list);*///[Sabrina, Linda]
        //2.使用索引删除
        /*String str = list.remove(1);//Tomas
        System.out.println(str);*/
        //使用索引删除会返回被删除值

        //修改元素，使用list.set(索引，修改值)
        String result = list.set(1,"Sabrina");
        System.out.println(list);//[Sabrina, Sabrina, Linda]

        //查询元素，list.get(索引)
        String s = list.get(0);
        System.out.println(s);//Sabrina
        
        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }


    }
}
