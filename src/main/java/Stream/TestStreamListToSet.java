package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamListToSet {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("liming",16));
        user.add(new User("liuxingchen",16));
        /**
         * user对象属性都是想等的，但是new2个对象，这2个对象的内存地址是不一致的
         * set集合去重就是将new的对象拿出来，然后赋值，之后将对象塞入到set集合之中
         */

        User userPeople=new User("jimao",16);
        user.add(userPeople);
        user.add(userPeople);
        user.forEach((t)->{System.out.println(t.toString());});
        System.out.println("去除重复.............");

        /**
         * 创建stream的方式有2种
         * 1串行流stream(),相当于单线程
         * 2并行流parallelStream()，相当于多线程，比串行流效率要高
         */
        Stream<User> stream=user.stream();
        //转换成set集合
        Set<User> setUserList=stream.collect(Collectors.toSet());
        setUserList.forEach(user1 -> {
                System.out.println(user1.toString());
        });
        user.parallelStream();

    }
}
