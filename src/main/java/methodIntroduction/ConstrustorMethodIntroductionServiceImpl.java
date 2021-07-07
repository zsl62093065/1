package methodIntroduction;

import bean.User;
import methodIntroduction.service.ConstrustorMethodIntroductionService;

/**
 * 构造函数引用
 */
public class ConstrustorMethodIntroductionServiceImpl {
    public static void main(String[] args) {
        ConstrustorMethodIntroductionService construstorMethodIntroductionService1=
                ()->{
                    return  new User();
                };
        System.out.println(construstorMethodIntroductionService1.getUser());
        /**
         * 构造函数引入 遵循规范：函数接口ConstrustorMethodIntroductionService
         * 中的返回类型::new
         */
       ConstrustorMethodIntroductionService construstorMethodIntroductionService=
              User::new;
       System.out.println(construstorMethodIntroductionService.getUser());
    }
}
