package 匿名内部类.ServiceImpl;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Lambda的集合
 */
public class LambdaArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String>  name=new ArrayList<>();
        name.add("jimao");
        name.add("liuxingchen");
        name.add("liming");

        name.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        name.forEach(s -> {
            System.out.println(s);
        });


    }
}
