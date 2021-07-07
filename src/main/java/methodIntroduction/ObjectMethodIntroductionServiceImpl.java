package methodIntroduction;

import methodIntroduction.service.ObjectMethodIntroductionService;

/**
 * 对象引用实现
 */
public class ObjectMethodIntroductionServiceImpl {
    public static void main(String[] args) {
        ObjectMethodIntroductionServiceImpl objectMethodIntroductionServiceImpl=
                new ObjectMethodIntroductionServiceImpl();
       /* ObjectMethodIntroductionService objectMethodIntroduction=()-> "jimao";
        System.out.println(objectMethodIntroduction.get());*/
        ObjectMethodIntroductionService  objectMethodIntroductionService=
                objectMethodIntroductionServiceImpl::objGet;
        System.out.println(objectMethodIntroductionService.get());
    }

    /**
     * ObjectMethodIntroductionService的接口类型和方法中的类型一致
     * @return
     */
    public String objGet(){
        return  "jimao";
    }

}
