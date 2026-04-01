package training5chapter;
import java.util.Scanner;
public class APITest5 {
    static void main(String[] args) {
        //本类旨在验证用户输入的用户名以及身份证号码是否满足需求
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入用户名4-16位（大小写字母，数字，下划线都可）");
        String UserName = sc.next();
        checkUserName( UserName );*/
        System.out.println("请输入身份证号");
        String IdNumber = sc.next();
        checkIdNumber( IdNumber );
    }
    //正则表达式验证用户名是否满足需求
    public static void checkUserName(String UserName){
        boolean result = UserName.matches("\\w{4,16}");
        if (result == false) {
            System.out.println("输入有误");
        } else {
            System.out.println("输入成功");
        }
    }
    //正则表达式验证身份证是否满足需求
    public static void checkIdNumber(String IdNumber) {
        boolean result = IdNumber.matches("[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]");
        if (result == false) {
            System.out.println("输入有误");
        } else {
            System.out.println("输入成功");
        }
    }
}
