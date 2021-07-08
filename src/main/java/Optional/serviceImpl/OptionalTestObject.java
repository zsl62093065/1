package Optional.serviceImpl;

import java.util.Optional;

/**
 * 代码优化
 */
public class OptionalTestObject {
    public static void main(String[] args) {
        String userName="jimao";
        /**
         * ofNullable 可以运行传值一个空值对象
         * of 不允许传递一个空值对象
         */
        Optional<String> optional=Optional.ofNullable(userName);

        boolean present=optional.isPresent();
        /**
         * false 返回false则不执行下面的方法
         * true  返回true值执行下面的方法
         */
        if(present) {
            System.out.println(optional.get());
        }

        /**
         * userName不为空的情况下，直接调用accept打印值
         * userName为空的情况下，不会执行accept
         */
        /*optional.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("匿名内部类获取："+s);
            }
        });*/
        /**
         * 上面的代码替换成lambda表达式
         */
        /* optional.ifPresent(s -> System.out.println("lambda表达式获取:"+s));*/
        /**
         * 上面的代码替换成方法引入
         */
        System.out.println("方法引入获取值");
        optional.ifPresent(System.out::print);
    }

}
