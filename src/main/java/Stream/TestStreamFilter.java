package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamFilter {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",20));
        user.add(new User("jimao",30));
        user.add(new User("liming",40));
        user.add(new User("liuxingchen",50));
        Stream<User> stream=user.stream();
        /*stream.filter(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return "jimao".equals(user.getName())&&user.getAge()>25&&user.getAge()<50;
            }
        }).forEach(user1-> System.out.println(user1));*/
        stream.filter(user12 -> "jimao".equals(user12.getName())&& user12.getAge()>25&& user12.getAge()<50).forEach(user1-> System.out.println(user1));
    }
}
