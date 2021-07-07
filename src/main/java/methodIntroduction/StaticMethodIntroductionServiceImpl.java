package methodIntroduction;

import methodIntroduction.service.StaticMethodIntroductionService;

/**
 * 静态引入
 */
public class StaticMethodIntroductionServiceImpl {
    public static void main(String[] args) {
        StaticMethodIntroductionService methodIntroduction=new StaticMethodIntroductionService() {
            @Override
            public void get(Integer a) {
                System.out.println("get:"+a);
            }
        };
        methodIntroduction.get(1);
        //MethodIntroduction methodIntroduction1=(a)->System.out.println("get:"+a);
        /**
         * 在lambda表达式中直接引入方法
         */
        StaticMethodIntroductionService methodIntroduction1=(a)-> StaticMethodIntroductionServiceImpl.staticGet(2);
        methodIntroduction1.get(2);
        /**
         * 方法引用
         */
        StaticMethodIntroductionService methodIntroduction2= StaticMethodIntroductionServiceImpl::staticGet1;
        methodIntroduction2.get(10);
    }
    public static  void staticGet(Integer a){
        System.out.println("静态引用staticGet,a:"+a);
    }
    /**
     * 方法引入和接口中的方法必须保持一致
     * @param a
     */
    public static  void staticGet1(Integer a){
        System.out.println("方法引用，a:"+a);
    }
}
