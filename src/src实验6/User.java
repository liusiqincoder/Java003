package src实验6;

/**
 * Created by Administrator on 2018/10/16.
 */
public class User {
    private String name,password;

    public User() {

    }

    public User(String name,String password) {
        this.name = name;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
