package 匿名内部类.Service;

/**
 * 标记了FunctionalInterFace后，该接口为函数接口
 * 函数接口即为在该接口中只能存在一个抽象方法，该接口称作为函数接口
 */
@FunctionalInterface
public interface MyFunctionalInterFace {
    void get();

    default  void add(){
        System.out.println("你好，大厂");
    };

    /**
     * Object中父类的方法可以在函数接口中重写
     * @return
     */
    String toString();
}
