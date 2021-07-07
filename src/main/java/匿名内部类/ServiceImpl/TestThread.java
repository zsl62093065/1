package 匿名内部类.ServiceImpl;

import 匿名内部类.Service.MyFunctionalInterFace;

public class TestThread {

    public static void main(String[] args) {
        new Thread(new Runnable(){

            public void run(){
                System.out.println("获取线程的名称："+Thread.currentThread().getName()+",子线程");
            }

        }).start();

        /**
         * 上面的线程等价于lambda
         */
        new Thread(()->System.out.println("获取线程的名称："+Thread.currentThread().getName()+",子线程")).start();




    }

}
