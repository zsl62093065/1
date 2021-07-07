package methodIntroduction;

import methodIntroduction.service.InStanceMethodIntroductionService;

import java.util.function.Function;

/**
 * 实例方法引用的实现
 */
public class InStanceMethodIntroductionServiceImpl {
    public static void main(String[] args) {
        /**
         * 通过匿名内部类实现实例的引用
         */
        InStanceMethodIntroductionService inStanceMethodIntroductionService =
                new InStanceMethodIntroductionService() {
                    @Override
                    public String get(InStanceMethodIntroductionServiceImpl
                                              inStanceMethodIntroductionServiceImpl) {
                        return inStanceMethodIntroductionServiceImpl.objGet();
                    }
                };
        System.out.println("通过匿名内部类实现实例的引用：" + inStanceMethodIntroductionService.
                get(new InStanceMethodIntroductionServiceImpl()));
        /**
         * 通过lambda实现实例的引用
         */
        InStanceMethodIntroductionService inStanceMethodIntroductionService2 =
                (InStanceMethodIntroductionServiceImpl) -> InStanceMethodIntroductionServiceImpl.
                        objGet();
        System.out.println("使用lambda表达式实现实例的引用：" + inStanceMethodIntroductionService2.get(new
                InStanceMethodIntroductionServiceImpl()));
        /**
         * 通过方法引用，在这个时候函数接口第一个参数传递的是InStanceMethodIntroductionServiceImpl,
         * 返回调用的是InStanceMethodIntroductionServiceImpl。objGet()
         * 这个时候返回调用的是InStanceMethodIntroductionServiceImpl::objGet;等同于
         * (InStanceMethodIntroductionServiceImpl)->InStanceMethodIntroductionServiceImpl.
         *                         objGet();
         */
        InStanceMethodIntroductionService inStanceMethodIntroductionService3 =
                InStanceMethodIntroductionServiceImpl::objGet;
        System.out.println("使用方法引用实现实例的引用：" + inStanceMethodIntroductionService3.
                get(new InStanceMethodIntroductionServiceImpl()));
        /**
         * Function中的方法R apply(T t);
         * T为apply方法传递的参数类型
         * R 为apply方法的返回类型
         */
        Function<String, Integer> function3 = (str) -> {
            return  str.length();
        };
        System.out.println("通过function获取jimao的长度"+function3.apply("jimao"));
        /**
         * 通过实例对象获取返回值的长度
         */
        Function<String, Integer> function2 = String::length;
        System.out.println("通过实例对象获取jimao的长度"+function2.apply("jimao"));
    }
    public  String objGet(){ return  "jimao"; }
}
