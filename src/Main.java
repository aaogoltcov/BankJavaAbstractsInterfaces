import abstracts.Account;
import classes.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        Account savingAccountFirst = new SavingsAccount(1000);
        Account savingAccountSecond = new SavingsAccount(2000);

        savingAccountFirst.transfer(savingAccountSecond, 15);
    }
}
