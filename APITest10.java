package training5chapter;
//导入Date包
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
public class APITest10 {
    static void main(String[] args) {
        //本类旨在测试date类及其常用函数

        //set1years();
        //compare();
        //实验SimpleDateFormat格式化时间

        //1.利用空参构造创建SimpleDateFormat对象，得到默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0l);
        String str = sdf1.format(d1);
        System.out.println(str);//1970/1/1 08:00
        //2.利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);//1970年01月01日 08:00:00
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE", Locale.CHINA);
        String str3 = sdf3.format(d1);//1970年01月01日 08:00:00 周四(EE)
        System.out.println(str3);

    }

    private static void compare() {
        //需求二：定义任意两个date对象进行大小比较
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if (time1 > time2) {
            System.out.println(d1 + " > " + d2);
        }else if (time2 > time1) {
            System.out.println(d1 + " < " + d2);
        }else {
            System.out.println(d1 + " = " + d2);
        }
    }

    private static void set1years() {
        //需求1 ： 打印时间原点开始后一年的时间
        //1.创建一个对象，表示时间原点
        Date d1 = new Date(0l);//0l表原点
        //2.获取d1的毫秒值
        long time = d1.getTime();
        //3.在这个基础上加上一年的毫秒值
        time = time + 1000l * 60 * 60 * 24 * 365;//使用l修饰毫秒值因计算后数值可能超出int最大值
        //4.把计算后的时间，再设置回D1当中
        d1.setTime(time);
        System.out.println(d1);//Fri Jan 01 08:00:00 CST 1971
    }

}
