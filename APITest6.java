package training5chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class APITest6 {
    static void main(String[] args) {
        //本类旨在利用爬虫以及正则表达式获取指定内容
        String data = "来黑马程序员学习Java," +
                "电话:18512516758,18512508907" +
                "或者联系邮箱:boniu@itcast.cn," +
                "座机电话:01036517895,010-98951256" +
                "邮箱:bozai@itcast.cn," +
                "热线电话:400-618-9090,400-618-4000,4006184000,4006189090";
        System.out.print("电话: ");
        getPhoneNum(data);
        System.out.println(" ");
        System.out.print("联系邮箱: ");
        getitcast(data);
        System.out.println(" ");
        System.out.print("座机电话: ");
        getTelePhoneNumber(data);
        System.out.println(" ");
        System.out.print("热线电话: ");
        getHotLine(data);

    }
    //利用爬虫获取热线电话
    private static void getHotLine(String data) {
        Pattern p1 = Pattern.compile("400-?\\d{3}-?\\d{3}0");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print(s1  +  "  ");
        }
    }
    //利用爬虫获取座机电话
    private static void getTelePhoneNumber(String data) {
        Pattern p1 = Pattern.compile("0\\d{2,3}-?[1-9]\\d{4,9}");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print(s1  +  "  ");
        }
    }

    //利用爬虫获取联系邮箱
    private static void getitcast(String data) {
        Pattern p1 = Pattern.compile("\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print(s1  +  "  ");
        }
    }

    //利用爬虫获取电话号码
    private static void getPhoneNum(String data) {
        Pattern p1 = Pattern.compile("1[3-9]\\d{9}");
        Matcher m = p1.matcher(data);
        while ( m.find() ) {
            String s1 = m.group();
            System.out.print(s1  +  "  ");
        }
    }
}
