package CHALLANGES.lecture_code.kgcoding.challange78;

public class Coustomer {
    public static void main(String[] args) {
        BankAccount coustomer1 = new BankAccount("001","mohit");
        System.out.println(coustomer1.checkbalance());
        coustomer1.Deposite(400.69);
        System.out.println(coustomer1.checkbalance());
        System.out.println(coustomer1.withdrawMoney(100));
        //coustomer1.withdraw(0);
        System.out.println(coustomer1.checkbalance());

    }
}
