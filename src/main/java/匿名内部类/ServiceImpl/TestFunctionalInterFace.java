package 匿名内部类.ServiceImpl;


import 匿名内部类.Service.MyFunctionalInterFace;

public class TestFunctionalInterFace {
    public static void main(String[] args) {
        ((MyFunctionalInterFace) () -> System.out.println("你好，大厂")).get();
    }
}
