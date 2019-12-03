package mybatis_test.user_test;

import mybatis_test.dao_service.UserService;
import mybatis_test.entity.BankAccount;
import mybatis_test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void Test1(){

        User u= userService.findUserById(1);
        System.out.println(u);
    }

    @Test
    public void Test2(){

        BankAccount b= userService.findBankAccountById(1);
        System.out.println(b);
    }

    @Test
    public void Test3(){

        User u= userService.findUserById2(1);
        System.out.println(u);
    }

}
