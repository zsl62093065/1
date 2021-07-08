package Optional.serviceImpl;
import bean.User;
import org.jetbrains.annotations.Nullable;
import java.util.Optional;

/**
 *优化方案3之Optional传值
 */
public class OptionalTestMapGetParams {
    @Nullable
    public static String getNameBefore(){
        /**
         * 优化前
         */
        User user=new User("jimao",16);
        if(user!=null){
            String userName=user.getName();
            if(userName!=null){
                return userName.toLowerCase();
            }
        }
        return  null;
    }
    public static String getNameAfter(){
        /**
         * 优化后
         */
        User user=new User("jimao",16);
       return Optional.ofNullable(user).map(userName->{return  user.getName();})
               .map(userName->{return userName.toLowerCase();}).orElse(null);
    }
    public static void main(String[] args) {
        String userNameBefore= OptionalTestMapGetParams.getNameBefore();
        System.out.println("优化前返回的userNameBefore:"+userNameBefore);
        String userNameAfter= OptionalTestMapGetParams.getNameAfter();
        System.out.println("优化前返回的userNameAfter:"+userNameAfter);
    }
}
