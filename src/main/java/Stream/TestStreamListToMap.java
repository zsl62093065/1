package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamListToMap {
    public static void main(String[] args) {
        ArrayList<User> user=new ArrayList<>();
        user.add(new User("jimao",20));
        user.add(new User("liming",20));
        user.add(new User("liuxingchen",20));
        /**
         * list集合之中只有元素Value，没有key
         * list转换成map集合的情况下，指定key为user对象中的name属性，指定value为user对象
         * map<name,user>
         */
        Stream<User> stream= user.stream();
        /**
         * new Function<User(list集合中的类型)，String(key map集合)>
         */
       /* Map<String,User> collect=stream.collect(Collectors.toMap(new Function<User, String>() {
            @Override
            public String apply(User user){
                return  user.getName();
            }
        }, new Function<User, User>() {
            @Override
            public User apply(User user){
                return  user;
            }
        }
        ));
        collect.forEach(new BiConsumer() {
            @Override
          public  void accept(Object o,Object o2){
              System.out.println(o+","+o2);
          }
        });*/
        System.out.println("替换成lambda表达式写法");
        Map<String,User> collect1=stream.collect(Collectors.toMap(user1 -> user1.getName(), user1 -> user1));
        collect1.forEach((BiConsumer) (o, o2) -> System.out.println(o+","+o2));
    }
}
