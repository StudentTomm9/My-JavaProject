package training5chapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class APITest11 {
    static void main(String[] args) throws ParseException {
        //本类旨在测试date and localTime 等类的练习

        //1.将2000-11-11转为2000年11月11日
        String str = "2000-11-11";
        //先对字符串进行解析获取到这个时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        //
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str1 = sdf2.format(date);
        System.out.println(str1);

    }
}
