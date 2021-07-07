package 匿名内部类.ServiceImpl;

import bean.User;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 集合排序
 */
public class LambdaArrayListSort {
    public static void main(String[] args) {
        ArrayList<User> user =new ArrayList<>();
        user.add(new User("jimao",30));
        user.add(new User("liming",36));
        user.add(new User("liuxingchen",38));
        user.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        user.forEach((t)->{
            System.out.println(t.toString());
        });
        /**
         * 或者写成下面也可以
         */
        user.sort(((o1, o2) -> o1.getAge()-o2.getAge()));
        user.forEach((m)->{System.out.println(m.toString());});
    }
}
