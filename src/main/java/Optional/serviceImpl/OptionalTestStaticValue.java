package Optional.serviceImpl;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * 设置默认值
 */
public class OptionalTestStaticValue {
    public static void main(String[] args) {
        String userName=null;
        /**
         * 设置默认值
         */
       String uName= Optional.ofNullable(userName).orElse("jimao");
       System.out.println(uName);

       Boolean f=Optional.ofNullable(userName).filter(s -> "jimao".equals(s)).isPresent();
       System.out.println(f);
    }
}
