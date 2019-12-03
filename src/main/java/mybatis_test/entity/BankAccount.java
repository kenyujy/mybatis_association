package mybatis_test.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BankAccount {

    private long accountId;
    private String holderName;
    private Double balance;
    private String authString;
    private Date createDate;

    //一定要有无参构造器

}
