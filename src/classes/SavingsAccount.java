package classes;

import abstracts.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(int money) {
        super(money);
    }

    @Override
    public void pay(int amount) {}

    @Override
    public void transfer(Account account, int amount) {
        account.addMoney(amount);
        this.money -= amount;
        this.printOut(this.money, amount, "-");
    }

    @Override
    public void addMoney(int amount) {
        this.money += amount;
        this.printOut(this.money, amount, "+");
    }
}
