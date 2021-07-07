package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamMath {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",20));
        user.add(new User("liming",20));
        user.add(new User("guozihao",20));
        user.add(new User("liuxingchen",20));
        Stream<User> stream=user.stream();
        /*boolean jimao=stream.anyMatch(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return "jimao".equals(user.getName());
            }
        });*/
        boolean jimao=stream.anyMatch(user1 -> "jimao".equals(user1.getName()));
        System.out.println("jimao匹配单个，结果是"+jimao);
        Stream<User> stream1=user.stream();
        /*boolean all=stream1.allMatch(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return "jimao".equals(user.getName());
            }
        });*/
        boolean all=stream1.allMatch(user1 -> "jimao".equals(user1.getName()));
        System.out.println("jimao匹配所有，结果是"+all);
    }
}
