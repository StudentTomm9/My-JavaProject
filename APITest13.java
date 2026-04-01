package training5chapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class APITest13 {
    //本类旨在测试API综合练习
    static void main(String[] args) throws ParseException{
        //1.键盘录入随机个1-100的整数，并添加到集合中直到集合中数据和超过200停止
//        Scanner sc = new Scanner (System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        while(true) {
//            System.out.println("请输入一些1-100的整数");
//            String str = sc.nextLine();
//            int num = Integer.parseInt(str);
//            if (num >= 1 && num <= 100) {
//                list.add(num);
//                int sum = getSum(list);
//                if (sum > 200) {
//                    System.out.println(sum);
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println(list.get(i));
//                    }
//                    System.exit(0);
//                }
//            }else {
//                System.out.println("输入不合法");
//            }
//        }
        //2.实现parseint方法效果，将字符串转换成整数
        //要求：字符串只能是数字，最少一位至多十位，0不开头
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        String str = sc.nextLine();
//        if (!str.matches("[1-9]\\d{0,9}")) {
//            System.out.println("输入有误");
//        } else {
//            int num = 0;
//            for (int i = 0; i < str.length(); i++) {
//                char temp = str.charAt(i);
//                num = num * 10 +(temp-48);
//            }
//            System.out.println(num);
//            System.out.println("输入成功");
//        }
        //要求3：实现toBinaryString方法，将十进制转成二进制
//        toBinaryString(10);
        //要求4：实现计算存在天数
//        String birthday = "2001年2月28日";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date = sdf.parse(birthday);
//        long birthdayTime = date.getTime();
//        long todayTime = System.currentTimeMillis();
//        long time = todayTime - birthdayTime;
//        System.out.println(time / 1000 / 60 / 60 / 24);
//        getDay(2001,2,28);
        //要求5：判断任意一个年份是闰年还是平年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        judgeYear(year);
    }
    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num =list.get(i);
            sum += num;
        }
        return sum;
    }
    private static void toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
       while (num != 0) {
           int temp = (num % 2);
           num = num / 2;
           sb.append(temp);
       }
        sb.reverse();
        System.out.println(0+sb.toString());

    }
    private static void getDay(int year,int month,int day) {
        LocalDate of = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(of,now);
        System.out.println(of);
        System.out.println(now);
        System.out.println(days+"天");
    }
    private static void judgeYear(int years) {
        Calendar c = Calendar.getInstance();
        c.set(years,2,1);//月份0-11
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        if (day == 29) {
            System.out.println(c.get(Calendar.YEAR) + "是闰年");
        }else {
            System.out.println(c.get(Calendar.YEAR) + "是平年");
        }

    }
}
