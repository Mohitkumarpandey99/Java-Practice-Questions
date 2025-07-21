package CHALLANGES.lecture_code.kgcoding.challange78;

public class BankAccount {
    private String accountNUM;
    private String accHolderName;
    private Double AccountBalance=0.0;

    public BankAccount() {
    }

    public BankAccount(String accountNUM, String accHolderName) {
        this.accountNUM = accountNUM;
        this.accHolderName = accHolderName;
    }

    public void Deposite(double money){
        if (money<0){
            System.out.println("invalid amount entered!!");
        }else {
            AccountBalance += money;
        }
    }



    public double withdrawMoney(double money){
                 if(money<=0){
            System.out.println("invalid amount");
        }

        else if (AccountBalance<money){
           money = AccountBalance;
           AccountBalance = 0.00;
         System.out.println("Insufficient balance!! withdrawing remaining balance!!");
        }
        else {
            AccountBalance -= money;
        }
     return money;
    }

    public double checkbalance(){
        System.out.println("your Account balance is:");
        return AccountBalance;
    }
}
