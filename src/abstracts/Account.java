package abstracts;

public abstract class Account {
    public int money;

    public Account(int money) {
        this.money = money;
    }

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);

    public void printOut(int money, int amount, String type) {
        if (type.equals("-")) {
            System.out.print("Списаны денежные средства в размере " + amount + " рублей\n");
        } else if (type.equals("+")) {
            System.out.print("Зачислены денежные средства в размере " + amount + " рублей\n");
        }
        System.out.print("Общий баланс составляет " + money + " рублей\n");
    }
}
