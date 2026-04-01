package training4chapter;

public class OuterTest1 {
    static void main(String[] args) {
        //外部类名.成员内部类名 变量名 = 外部类对象.内部类对象
        Outer.Inner o1 = new Outer().new Inner();
        o1.show();
    }
}
