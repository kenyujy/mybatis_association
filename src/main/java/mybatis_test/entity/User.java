package mybatis_test.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Long userId;
    private String userName;
    private String password;
    private int accountStatus;
    private String userRole;
    private BankAccount bankAccount;
    private List<Friend> friends;
    //一定要有无参构造器


    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }
}
