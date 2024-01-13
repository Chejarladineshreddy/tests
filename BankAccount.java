public class BankAccount{
    private String accno;
    private String accname;
    private double balance;
    public BankAccount(String accno,String accname,double balance){
        this.accno=accno;
        this.accname=accname;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of"+amount+" rupees was done successfully");}
            else{
                System.out.println("Invalid Amount");
            }
        
    }
    public void withdrawl(double amount)
    {
        if(amount>0){
            if (amount<=balance){
                balance-=amount;
                System.out.println("Withdrawl of"+amount+" rupess was done");
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Enter valid amount");
        }

    }
    public void display(){
        System.out.println("Account Holder Name:"+accname);
        System.out.println("Account Number:"+accno);
        System.out.println("Account Balance:"+balance);

    }
    public static void main(String[] args){
        BankAccount account=new BankAccount("Aadhya","0886974215",100000);
        account.deposit(25000);
        account.withdrawl(75000);
        account.display();
    }
}
