package training6chapter;
//导入集合包
import java.util.ArrayList;
public class ArrayList4 {
    static void main(String[] args) {
        //创建集合
        ArrayList<Phone> list = new ArrayList<>();
        //new三个手机对象
        Phone p1 = new Phone("Xiaomi",1000);
        Phone p2 = new Phone("Apple",8000);
        Phone p3 = new Phone("hammer",2999);
        //存入集合
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //盗用show()方法
        show(list);

    }
    //定义方法：实现将低于3000的手机全部信息show
    public static int  show(ArrayList<Phone> list) {
        for (int i = 0; i < list.size(); i++) {
            Phone contains = list.get(i);
            int price = contains.getPrice();
            if (price <= 3000) {
                System.out.println(contains.getBrand() + "," + contains.getPrice());
            }
        }
        return -1;
    }
}
