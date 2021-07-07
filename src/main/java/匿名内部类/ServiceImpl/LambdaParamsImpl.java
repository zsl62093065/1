package 匿名内部类.ServiceImpl;

import 匿名内部类.Service.LambdaParams;

public class LambdaParamsImpl {
    /**
     * 使用匿名内部类获取接受的数据
     */
    public static void main(String[] args) {
        String result=new LambdaParams(){
            @Override
            public String get(String name,String age){
                return  name +"已经"+age;
            }
        }.get("liming","35");
        System.out.println(result);

        LambdaParams lambdaParams=(name, age) -> {
          System.out.println("name:"+name+"已经"+age);
          return name +"已经"+age;
        };
        System.out.println(lambdaParams.get("liming","36"));
    }
}
