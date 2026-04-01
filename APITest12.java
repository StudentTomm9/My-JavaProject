package training5chapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class APITest12 {
    static void main(String[] args) throws ParseException {
        //本类旨在测试SimpleForMa练习

        //1.是否参加上活动
        String startStr = "2023年11月11日 00:00:00";
        String endStr = "2023年11月11日 00:01:00";
        String JiaTime = "2023年11月11日 00:01:00";
        String PiTime = "2023年11月11日 00:11:00";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:SS");
        Date date1 = sdf1.parse(startStr);
        Date date2 = sdf1.parse(endStr);
        Date Jiadate = sdf1.parse(JiaTime);
        Date Pidate = sdf1.parse(PiTime);

        compare(date1,Jiadate,date2);
        compare(date1,Pidate,date2);
        int a = 12;

    }
    public static void compare(Date start,Date date,Date end) {
        long time1 = date.getTime();
        if (time1 > start.getTime() && time1 <= end.getTime()) {
            System.out.println("该用户成功参加活动");
        }else {
            System.out.println("该用户并未成功参加活动");
        }

    }
}
