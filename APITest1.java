package training5chapter;
import java.util.Scanner;
public class APITest1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数以判断是否为质数");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
