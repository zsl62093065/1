package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestStreamMin {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",20));
        user.add(new User("jimao",30));
        user.add(new User("jimao",40));
        user.add(new User("jimao",50));

        Stream<User> stream=user.stream() ;
        /*Optional<User> min=stream.min(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        Optional<User> min=stream.min((o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println(min.get());
    }
}
