package jay.learning;

public class Account {

    private String accountNum;
    private double balance;
    private String custName;
    private String email;

    public Account(String custName, String email, String phoneNum) {
        this("56789",2.50,custName,email,phoneNum);
    }

    private String phoneNum;

    public Account(){
         this("56789",2.50,"Default name","Default address","Default phone");
    }

    public Account(String accountNum, double balance, String custName, String email, String phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit(double money){
        this.balance+=money;
        System.out.println("Your balance is "+balance);
    }

    public void withdraw(double money){
        if(balance>=money){
            balance-=money;
            System.out.println("Your balance is "+balance);
        }else{
            System.out.println("You don't have enough money");
        }
    }

}
