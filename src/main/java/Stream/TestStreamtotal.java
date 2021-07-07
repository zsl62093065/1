package Stream;

import bean.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream总结
 *
 */
public class TestStreamtotal {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("zhangkao", 50));
        user.add(new User("jimao", 20));
        user.add(new User("jimao", 30));
        user.add(new User("jimao", 60));
        user.add(new User("jimao", 40));
        user.add(new User("jimao", 35));
        user.add(new User("jimao1", 135));
        user.add(new User("liming", 40));
        user.add(new User("zhangkao", 50));
        user.add(new User("wuzhicheng", 60));
        user.add(new User("guozihao", 70));
        user.add(new User("liuxingchen", 80));
        Stream<User> stream5 = user.stream();
        /**
         * 使用set集合接受数据中含有jimao的数据，并且过滤3条，选择4-6条之间的数据
         */
        /*Set<User> setUserList = stream5.filter(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                if (user.getName().indexOf("jimao") != -1) {
                    return true;
                }else{
                    return false;
                }
                //   return "jimao".equals(user.getName());
            }
        }).skip(3).limit(6).collect(Collectors.toSet());*/


        Optional<User> max2 = stream5.filter(item->item.getName().contains("jimao")).skip(3).limit(6).collect(Collectors.toSet()).stream().max((o1, o2) -> o1.getAge() - o2.getAge());


        /*System.out.println("-----循环遍历含有jimao的第4到第6条数据------");
        setUserList.forEach(user1 -> {
            System.out.println(user1.toString());
        });*/
        /**
         * 获取数据中最大的数
         */
        System.out.println("数据中最大的数");
        /*Optional<User> max2 = setUserList.stream().max(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
//        Optional<User> max2 = setUserList.stream().max((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(max2.get());
        System.out.println("-----用户年龄降序排列--------");
         /*setUserList.stream().sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }).forEach(new Consumer<User>() {
             @Override
             public void accept(User user) {
                 System.out.println(user.toString());
             }
         });*/
     //   setUserList.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(user12 -> System.out.println(user12.toString()));

        System.out.println("---------------------------------");
    }
}
