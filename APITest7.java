package training5chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class APITest7 {
    static void main(String[] args) {
        //本类旨在测试需求爬取
        String data = "java自从95年问世以来,aaaaaaaabbbbbbbbbaaaaaaaaaaaaa" +
                "经历了很多版本,目前企业中用的最多的是Java8和Java11,因为这两个是长\n" +
                "期支持版本,下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
//        getJavaNoVerId(data);
//        getJava(data);
//        getStringNoJava(data);
//        getGreedy(data);
//        replaceJava(data);
//          cutsb(data);


    }
    //切割出somgthing并打印切割后的源数据
    private static void cutsb(String data) {
        String[] str = data.split("版本");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }

    //替换文中的Java，改为Python
    private static void replaceJava(String data) {
        Pattern p1 = Pattern.compile(data.replaceAll("Java","Python"));
        Matcher m = p1.matcher(data);
        System.out.println(m);
    }

    //尽可能多获取ab,贪婪爬取
    private static void getGreedy(String data) {
        Pattern p1 = Pattern.compile("ab+");//ab+?为非贪婪爬取
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print(s1);
        }
    }

    //爬取除了版本号为8,11,17的Java文本
    private static void getStringNoJava(String data) {
        Pattern p1 = Pattern.compile("((?i)Java)(?!8|11|17)");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print(s1);
        }
    }
    //爬取版本号为8,11,17的Java文本。正确爬取结果为:Java8 Java11 Java17Java17
    private static void getJava(String data) {
        Pattern p1 = Pattern.compile("8|11|17");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print("Java"+  s1  +  "  ");
        }
    }

    //爬取版本号为8，11，17的Java文本，但只要Java不显示版本号
    private static void getJavaNoVerId(String data) {
        Pattern p1 = Pattern.compile("8|11|17");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print("Java"  +  "  ");
        }
    }
}
