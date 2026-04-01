package training5chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class APITest9 {
    static void main(String[] args) {
        //本类旨在测试replaceAll将重复内容替换成单个
        String str = "我要学学学学学学编程程程程";//捕获分组
        Pattern p1 = Pattern.compile(str.replaceAll("(.)\\1+","$1"));
        System.out.println(p1);//正则内部：\\外部：$
    }
}
