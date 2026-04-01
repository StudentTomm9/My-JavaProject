package training6chapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorStandard {
    static void main(String[] args) {
        //本类旨在标准迭代器书写
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("sss");
        //2.获取迭代器对象(指针)
        Iterator<String> it = coll.iterator();
        //3.利用循环不断获取集合中的每一个元素
        while (it.hasNext()) {
            //4.next方法需执行两件事情：获取元素以及移动指针
            String str = it.next();
            System.out.println(str);
        }
    }
}
