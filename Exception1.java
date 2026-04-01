package training4chapter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {
    //本类旨在测试键盘录入数据异常测试
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        girl g1 = new girl();
        while (true) {
            try {
                System.out.println("请输入心仪女朋友的姓名(3-10个字)");
                g1.setName(sc.next());

                System.out.println("请输入心仪女朋友的年龄(18-40岁)");
                g1.setAge(sc.nextInt());

                result(g1);
                break;
            }catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("名字长度不合法  年龄超出或过小");
            }catch (InputMismatchException m) {
                System.out.println("输入不合法");
            }
        }
    }
    public static void result(girl g1) {
        girl temp = new girl();
        try{
            temp.setAge(g1.getAge());
            System.out.println("GirlFriend= {"+g1.getAge() + "岁的" + g1.getName() + "}");
        }catch (ArrayIndexOutOfBoundsException c) {
            System.out.println(" ");
        }
    }
}
