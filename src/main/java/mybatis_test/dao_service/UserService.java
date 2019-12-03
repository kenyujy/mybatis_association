package mybatis_test.dao_service;

import mybatis_test.entity.BankAccount;
import mybatis_test.entity.Friend;
import mybatis_test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserService {

    User findUserById(@Param("id") long id);

    BankAccount findBankAccountById(@Param("id") long id);

    List<Friend> findFriendListById(@Param("id") long id);

}
