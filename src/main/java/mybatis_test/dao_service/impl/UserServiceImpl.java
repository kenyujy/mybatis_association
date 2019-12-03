package mybatis_test.dao_service.impl;

import mybatis_test.dao_service.UserService;
import mybatis_test.entity.BankAccount;
import mybatis_test.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class UserServiceImpl {

    @Autowired
    UserService userService;

    public User findUserById(long id){
        return userService.findUserById(id);
    }

    User findUserById2(@Param("id") long id){
        return userService.findUserById2(id);
    }

    public BankAccount findBankAccountById(long id){
        return userService.findBankAccountById(id);
    }
}
