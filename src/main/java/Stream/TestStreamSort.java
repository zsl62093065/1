package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestStreamSort {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",20));
        user.add(new User("liming",25));
        user.add(new User("guozihao",30));
        user.add(new User("liuxingchen",40));
        user.add(new User("chenhong",50));
        /**
         * 升序
         */
        System.out.println("年龄升序排列");
        Stream<User> stream=user.stream();
        /*stream.sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        }).forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.toString());
            }
        });*/
        stream.sorted((o1, o2) -> o1.getAge()-o2.getAge()).forEach(user1 -> System.out.println(user1.toString()));
        /**
         * 降序
         */
        System.out.println("年龄降序排列");
        Stream<User> stream1=user.stream();
        /*stream1.sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getAge()-o1.getAge();
            }
        }).forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.toString());
            }
        });*/
        stream1.sorted((o1, o2) -> o2.getAge()-o1.getAge()).forEach(user12 -> System.out.println(user12.toString()));
    }
}
