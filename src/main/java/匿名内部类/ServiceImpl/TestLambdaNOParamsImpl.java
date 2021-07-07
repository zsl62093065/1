package 匿名内部类.ServiceImpl;

import 匿名内部类.Service.LambdaNOParams;

public class TestLambdaNOParamsImpl {
    public static void main(String[] args) {
        /**
         * 通过匿名内部类调用接口中的无参构造方法
         */
        LambdaNOParams LambdaNOParams =new LambdaNOParams(){
            @Override
            public void  get(){
                System.out.println("你好，大厂");
            }
        };
        LambdaNOParams.get();
        /**
         * 通过匿名内部类调用接口中的无参构造方法
         */
        new LambdaNOParams(){
            public void get(){
                System.out.println("你好，大厂");
            }
        }.get();
        /**
         * 使用Lambda调用抽象类中的无参构造方法
         */
        LambdaNOParams lambdaNOParams  = () -> {
            System.out.println("使用lamdba表达式调用方法");
        };
        lambdaNOParams.get();


        /**
         * 简写Lambda调用抽象类中的无参构造方法
         */
        ((LambdaNOParams)()->System.out.println("你好，大厂")).get();
    }
}
