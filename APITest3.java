package training5chapter;

public class APITest3 {
    static void main(String[] args) throws CloneNotSupportedException {
        // protected Object clone(int a ) 对象克隆
        //1.创建对象1
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1  = new User(1,"zhangsan","zhangsan111","girl1",data);

        //2.克隆对象
        User u2 = (User) u1.clone();
        //3.打印
        System.out.println(u1);
        System.out.println(u2);

    }
}
