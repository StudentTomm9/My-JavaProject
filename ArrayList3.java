package training6chapter;
import java.util.ArrayList;
public class ArrayList3 {
    static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        user u1 = new user("Linda",123,28);
        list.add(u1);
        for (int i = 0; i < list.size(); i++) {
            user str = list.get(i);
            System.out.println(str);
        }
        System.out.println(getId(list,123));

    }
    public static int  getId(ArrayList<user> list,int id) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            user g1 = list.get(i);
            int g1id = g1.getId();
            if(g1id == id) {
                return i;
            }
        }
        return -1;
    }
}
