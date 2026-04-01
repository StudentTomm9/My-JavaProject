package training4chapter;

public class Outer {
    private int a = 10;

    //内部类
    class Inner {
        private int a = 20;

        //内部方法
        public void show() {
            int a = 30;
            System.out.println(new Outer().a);
            System.out.println(this.a);//本类中用THIS调用
            System.out.println(a);
        }
    }
}
