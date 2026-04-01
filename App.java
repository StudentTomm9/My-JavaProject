package training6chapter;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<userData> list = new ArrayList<>();
        while(true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.登录   2.注册   3.忘记密码   4.退出");
            System.out.println("请输入您的选择");
            String choose = sc.next();
            switch ( choose ) {
                case "1" -> {
                    System.out.println("登录");
                    login(list);
                }
                case "2" -> {
                    System.out.println("注册");
                    register(list);
                }

                case "3" -> {
                    System.out.println("忘记密码");
                    forgetPassWord(list);
                }
                case "4" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("操作错误");
            }
        }
    }
    //情况1：注册用户
    public static void register(ArrayList<userData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        System.out.println("请输入用户密码");
        String passWord = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();//可换int型
        //创建用户信息并存入集合
        userData user = new userData(userName,passWord,phoneNumber);
        list.add(user);
        System.out.println(user.getUserName() + "已创建，请返回登录界面");
    }
    //情况2：用户登录
    public static void login(ArrayList<userData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        System.out.println("请输入用户密码");
        String passWord = sc.next();
        for (int i = 0; i < list.size(); i++) {
            userData temp = list.get(i);
            String temp1 = temp.getUserName();
            String temp2 = temp.getPassWord();
            if (userName.equals(temp1)) {
                if (passWord.equals(temp2)) {
                    System.out.println(temp.getUserName() + "登录成功");
                }
            }else {
                System.out.println("用户或密码错误");
            }
        }
    }
    //情况3：忘记密码
    public static void forgetPassWord(ArrayList<userData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();
        for (int i = 0; i < list.size(); i++) {
            userData temp = list.get(i);
            String temp1 = temp.getUserName();
            String temp2 = temp.getPhoneNumber();
            if (userName.equals(temp1)) {
                if (phoneNumber.equals(temp2)) {
                    System.out.println("请输入新密码");
                    String newPassWord = sc.next();
                    userData user = new userData(temp1,newPassWord,temp2);
                    System.out.println(temp.getUserName() + "密码已修改完成");
                }
            }else {
                System.out.println("用户或密码错误");
            }
        }
    }
}
