package training5chapter;

public class APITest8 {
    static void main(String[] args) {
        //本类旨在测试正则表达式分组
        String regex1 = "(.).+\\1";//"\\"表示把第X组的内容再使用一次
        System.out.println("a123a".matches(regex1));//true
        System.out.println("a123b".matches(regex1));//false
        String regex2 = "(.+).+\\1";
        System.out.println("aa123aa".matches(regex2));//true
        System.out.println("aa123bb".matches(regex1));//false
        String regex3 = "((.+)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex2));//true
        System.out.println("aaa123bbb".matches(regex1));//false
    }
}
