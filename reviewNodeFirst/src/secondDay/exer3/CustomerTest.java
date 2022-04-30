package secondDay.exer3;

/**
 * @author weijiangquan
 * @date 2022/4/30 -11:45
 * @Description
 */

/**
 * 测试类
 */
public class CustomerTest{
    public static void main(String[] args) {
        Customer customer = new Customer("wei","fei");
        Account account = new Account(12,100,0.1);
        customer.setAccount(account);
        // 取钱
        System.out.print(customer.getName()+"用户:");
        customer.getAccount().withDraw(45);
        customer.getAccount().deposit(121);
    }
}
/**
 * 用户类(在用户类中使用了账号类)
 */
class Customer{
    private String firstName;
    private String lastName;
    private Account account;


    public String getName(){
        return firstName+lastName;
    }
    /**
     * 构造器
     */
    //***********************start**************************************
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //*****************************end**********************************
    /**
     * get方法
     * FirstName,LastName通过构造器改变,没有写set方法
     *
     */
    //***********************start**************************************
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    //*****************************end**********************************
}
/**
 * 账号类
 */
class Account{
    private int id; //账号
    private double balance;//余额
    private double annualInterestRate; //年利率


    /**
     * 取钱
     * @param amount 要取的钱的多少
     */
    public void withDraw(double amount){
        if(balance < amount){
            System.out.println("余额不足,取钱失败");
            return;
        }
        balance -= amount;
        System.out.println("取钱成功"+amount);
        System.out.println("还有余额"+balance);
    }
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("成功存入:"+amount);
            System.out.println("还有余额:"+balance);
        }
    }
    /**
     * 构造器
     */
    //***********************start**************************************
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //*****************************end**********************************
    /**
     * set和get方法
     */
    //***********************start**************************************
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //*****************************end**********************************
}



