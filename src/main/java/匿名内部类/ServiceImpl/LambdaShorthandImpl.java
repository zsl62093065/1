package 匿名内部类.ServiceImpl;

import 匿名内部类.Service.LambdaParams;
import 匿名内部类.Service.LambdaShorthand;

public class LambdaShorthandImpl {
    public static void main(String[] args) {
        /**
         * 通过匿名内部类实现接口调用
         */
       String result=new LambdaShorthand(){
           @Override
           public String getFriend(String name,String age) {
               return name+"已经"+age;
           }
       }.getFriend("jimao","30");
       System.out.println(result);
        /**
         * 通过lambda表达式实现接口调用
         */
        LambdaShorthand LambdaShorthand1=(name, age) -> {
            System.out.println("name:"+name+"已经"+age);
            return name +"已经"+age;
        };
        System.out.println(LambdaShorthand1.getFriend("liming","36"));
        /**
         *简写lambda表达式
         */
        ((LambdaShorthand)(name,age)->"name:"+name+"已经"+age).getFriend("jimao","30");
        /**
         * 或者写成这样也可以
          */
        LambdaShorthand  LambdaShorthand2=(name, age) -> "name:"+name+"已经"+age;
        System.out.println(LambdaShorthand2.getFriend("jimao","35"));
    }
}
