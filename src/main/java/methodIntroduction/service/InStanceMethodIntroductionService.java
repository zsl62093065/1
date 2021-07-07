package methodIntroduction.service;


import methodIntroduction.InStanceMethodIntroductionServiceImpl;

/**
 * 实例方法引入
 */
@FunctionalInterface
public interface InStanceMethodIntroductionService {
    String get(InStanceMethodIntroductionServiceImpl inStanceMethodIntroductionServiceImpl);
}
