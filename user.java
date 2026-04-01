package training6chapter;

public class user {
    private String username;
    private int id;
    private int password;

    public user() {
        System.out.println("user空参执行了");
    }

    public user(String username, int id, int password) {
        this.username = username;
        this.id = id;
        this.password = password;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    public String toString() {
        return "user{username = " + username + ", id = " + id + ", password = " + password + "}";
    }
}
