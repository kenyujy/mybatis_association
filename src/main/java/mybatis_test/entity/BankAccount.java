package mybatis_test.entity;

import java.util.Date;

public class BankAccount {

    private long accountId;
    private String holderName;
    private Double balance;
    private String authString;
    private Date createDate;

    //一定要有无参构造器
    public BankAccount() {
    }

    public BankAccount(long accountId, String holderName, Double balance, String authString, Date createDate) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.balance = balance;
        this.authString = authString;
        this.createDate = createDate;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAuthString() {
        return authString;
    }

    public void setAuthString(String authString) {
        this.authString = authString;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", authString='" + authString + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
