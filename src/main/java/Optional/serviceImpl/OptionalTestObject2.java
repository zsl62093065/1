package Optional.serviceImpl;

import bean.User;

import java.util.Optional;
import java.util.function.Supplier;
/**
 * Optional优化传递对象并赋值获取
 */
public class OptionalTestObject2 {
    /**
     * 初始化对象user
     */
    private static User user=null;
    /**
     * 给User对象创建静态方法createUser()，并且赋值
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(value = " -> new", pure = true)
    private static User createUser(){
        return new User("jimao",16);
    }

    /**
     * 通过User对象获取返回结果
     * @return
     */
    public static User getUser(){
        /**
         * 优化前
         */
        /*if(user==null){
            return createUser();
        }
        return user;*/
        /**
         * 优化后
         */
       /* return Optional.ofNullable(user).orElseGet(new Supplier<User>(){
            @Override
            public User get(){
                return  createUser();
            }
        });*/
        /**
         * 通过lambda表达式获取返回结果
         */
        return Optional.ofNullable(user).orElseGet(() -> createUser());
    }

    public static void main(String[] args) {
        User user1=OptionalTestObject2.getUser();
        System.out.println(user1);
    }


}
