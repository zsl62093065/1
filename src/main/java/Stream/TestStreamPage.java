package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestStreamPage {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",25));
        user.add(new User("liming",26));
        user.add(new User("liming",26));
        user.add(new User("liming",26));
        user.add(new User("liming",26));
        user.add(new User("liming",26));
        user.add(new User("liming",26));
        /**
         * 显示前3条数据
         */
        Stream<User> stream=user.stream();
        System.out.println("显示前3条数据");
        stream.limit(3).forEach(user1 -> System.out.println(user1));
        /**
         * 显示第2条到第5条的数据
         * 开始使用skip()跳过前2条
         * limit(5)取出剩余的前5条数据
         */
        Stream<User> stream1=user.stream();
        System.out.println("显示第2条到第5条数据");
        stream1.skip(2).limit(5).forEach(user1 -> System.out.println(user1));
    }
}
