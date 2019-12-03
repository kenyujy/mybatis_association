package mybatis_test.user_test;

import mybatis_test.dao_service.UserService;
import mybatis_test.entity.BankAccount;
import mybatis_test.entity.Friend;
import mybatis_test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void Test1(){
        User u= userService.findUserById(1);
        List<Friend> f= userService.findFriendListById(1); //分步查出
        u.setFriends(f);  // 赋值
        System.out.println(u);
    }

    @Test
    public void Test2(){
        BankAccount b= userService.findBankAccountById(1);
        System.out.println(b);
    }

    @Test
    public void Test3(){
        List<Friend> f= userService.findFriendListById(1);
        System.out.println(f);
    }

}
