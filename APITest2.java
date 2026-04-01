package training5chapter;

public class APITest2 {
    static void main(String[] args) {
        pownum3();//统计共有几个水仙花数
        pownum2();
        pownum4();
        pownum5();
    }
    public static void pownum3() {
        int count = 0;
        for (int i = 100; i <= 999 ; i++) {
            int ge = (i % 10);
            int shi = (i /10) % 10;
            int bai = (i /100) % 10;
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum == i) {
                System.out.print(i + "  ");
                count++;
            }
        }
        System.out.println("共有" + count + "个水仙花数");
    }
    public static void pownum2() {
        int count = 0;
        for (int i = 100; i <= 999 ; i++) {
            int ge = (i % 10);
            int shi = (i /10) % 10;
            double sum = Math.pow(ge,3) + Math.pow(shi,3);
            if (sum == i) {
                System.out.print(i);
                count++;
            }
        }
        System.out.println("共有" + count + "个两位自幂数");
    }
    public static void pownum4() {
        int count = 0;
        for (int i = 1000; i <= 9999 ; i++) {
            int ge = (i % 10);
            int shi = (i /10) % 10;
            int bai = (i /100) % 10;
            int qian = (i / 1000) % 10 ;
            double sum = Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,4);
            if (sum == i) {
                System.out.print(i + "  ");
                count++;
            }
        }
        System.out.println("共有" + count + "个四叶草数");
    }
    public static void pownum5() {
        int count = 0;
        for (int i = 10000; i <= 99999 ; i++) {
            int ge = (i % 10);
            int shi = (i /10) % 10;
            int bai = (i /100) % 10;
            int qian = (i / 1000) % 10 ;
            int wan = (i /10000) % 10;
            double sum = Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(bai,5) + Math.pow(qian,5) + Math.pow(wan,5);
            if (sum == i) {
                System.out.print(i + "  ");
                count++;
            }
        }
        System.out.println("共有" + count + "个五角星数");
    }
}
