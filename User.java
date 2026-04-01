package training5chapter;

import java.util.Arrays;
import java.util.StringJoiner;
//Cloneable接口：
//如果一个接口中没有抽象方法，即表示当前的接口是一个标记性接口
//Cloneable表示一旦实现，那么当前类的对象就可以被克隆，反之不行
public class User implements Cloneable{
    private int id;
    private String userName;
    private String passWord;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String userName, String passWord, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", 用户名='" + userName + '\'' +
                ", 密码='" + passWord + '\'' +
                ", 游戏图片='" + path + '\'' +
                ", 进度=" + arrToString() +
                '}';
    }
    public String arrToString() {
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + " ");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        return super.clone();
    }
}
