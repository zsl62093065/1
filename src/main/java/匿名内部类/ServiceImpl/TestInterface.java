package 匿名内部类.ServiceImpl;

import 匿名内部类.Service.InterfaceService;

/**
 * 测试匿名内部类
 */
public class TestInterface {
    public static void main(String[] args) {
        //1使用匿名内部类的形式调用到接口InterfaceService中的方法get()
/*        InterfaceService interfaceService=new InterfaceService(){
            @Override
            public void get() {
                System.out.println("你好，大厂");
            }
        };
        interfaceService.get();*/

        //2通过new的形式调用接口InterfaceService中的方法get()
      /* new InterfaceService(){
            public void get(){
                System.out.println("你好，大厂");
            }
        }.get();*/

        //3替换成lambda表达式，获取对应的方法
        ((InterfaceService) () -> System.out.println("你好，大厂")).get();


    }
}
