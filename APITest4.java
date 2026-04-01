package training5chapter;
import java.util.Scanner;
public class APITest4 {
    static void main(String[] args) {
        //本类旨在测试正则表达式
        Scanner sc = new Scanner(System.in);
        //编写正则表达式验证用户输入手机号码是否满足需求
//        System.out.println("请输入11位手机号码");
//        String PhoneNum = sc.next();
//        MatchPhoneNum(PhoneNum);
        //编写正则表达式验证用户输入座机号码是否满足需求
//        System.out.println("请输入座机号码");
//        String telePhoneNum = sc.next();
//        MacthTeletPhoneNum(telePhoneNum);
        //编写正则表达式验证用户输入邮箱号码是否满足需求
        System.out.println("请输入邮箱号码");
        String OutlookNum = sc.next();
        boolean result = OutlookNum.matches("\\w{5,20}@Outlook\\.com\\.[a-zA-Z]?}");
        if (result == false) {
                    System.out.println("输入有误");
                }else{
                    System.out.println("输入成功");
                }



    }
    //正则表达式判断手机号
//    public static void MatchPhoneNum(String PhoneNum) {
//                boolean result = PhoneNum.matches("1[3-9]\\d{9}");
//                if (result == false) {
//                    System.out.println("输入有误");
//                }else{
//                    System.out.println("输入成功");
//                }
//        }
    //正则表达式判断座机号码
//    public static void MacthTeletPhoneNum(String telePhoneNum) {
//        boolean result = telePhoneNum.matches("0\\d{2,3}-?[1-9]\\d{4,9}");
//        if (result == false) {
//            System.out.println("输入有误");
//        }else{
//            System.out.println("输入成功");
//        }
//    }
}
