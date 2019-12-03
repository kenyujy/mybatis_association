package mybatis_test.entity;

public class User {

    private Long userId;
    private String userName;
    private String password;
    private int accountStatus;
    private String userRole;
    private BankAccount bankAccount;

    //一定要有无参构造器
    public User() {
    }

    public User(Long userId, String userName, String password, int accountStatus, String userRole, BankAccount bankAccount) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.accountStatus = accountStatus;
        this.userRole = userRole;
        this.bankAccount = bankAccount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountStatus=" + accountStatus +
                ", userRole='" + userRole + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
