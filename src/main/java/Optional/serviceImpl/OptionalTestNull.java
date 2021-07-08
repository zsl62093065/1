package Optional.serviceImpl;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * 判断空对象
 */
public class OptionalTestNull {
    public static void main(String[] args) {
        String userName="jimao";
        /**
         * ofNullable 可以运行传值一个空值对象
         * of 不允许传递一个空值对象
         */
        Optional<String> optional=Optional.ofNullable(userName);
 //       Optional<String> optional1=Optional.of(userName);
 //       System.out.println(optional.get());
        boolean present=optional.isPresent();
        /**
         * false 返回false则不执行下面的方法
         * true  返回true值执行下面的方法
         */
        if(present) {
            System.out.println(optional.get());
        }

    }
}
