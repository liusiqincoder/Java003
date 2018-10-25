package src实验6;

/**
 * Created by Administrator on 2018/10/16.
 */
public class userBank {
    public static boolean login(User user){
        if(user.getName().equals(user.getPassword()))
            return true;
        return false;
    }
}
