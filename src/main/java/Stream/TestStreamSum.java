package Stream;

import bean.User;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class TestStreamSum {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",20));
        user.add(new User("jimao",30));
        user.add(new User("jimao",40));
        user.add(new User("jimao",50));
        Stream<User> stream=user.stream();
        Optional<User> sum= stream.reduce(new BinaryOperator<User>() {
            @Override
            public User apply(User user1, User user2) {
                User user=new User("sum",user1.getAge()+user2.getAge());
                return user;
            }
        });
    System.out.println(sum.get().getAge());
    }
}
