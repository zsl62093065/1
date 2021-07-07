package Stream;

import bean.User;

import java.util.HashMap;
import java.util.HashSet;

public class Base {
    public static void main(String[] args) {
        User user3=new User("jimao",25);
        User user4=new User("jimao",25);
        System.out.println(user3.equals(user4));
        /**
         * 在默认的情况下，equals是比较2个对象内存地址是否想等，通过new对象导致了2个对象地址不等
         */
        String name3="jimao";
        String name4="jimao";
        System.out.println(name3.equals(name4));

        /**
         * set集合底层是基于map集合实现防重复key
         * map集合底层是基于equals来实现防重复的结合hashcode
         */
//        HashSet<String> Strings=new HashSet<>();
//        Strings.add()
        HashMap<Object,Object> objectHashMap=new HashMap<>();
        objectHashMap.put(user3,"a");
        objectHashMap.put(user4,"b");
        objectHashMap.forEach((k,v)->{System.out.println(k+","+v);});


    }
}
