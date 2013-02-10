package account;

public class TransferMoney {
    static void transfer(Transfer transfer) {
        Account lower = transfer.a.hashCode() < transfer.b.hashCode() ? transfer.a : transfer.b;
        Account higher = lower == transfer.a ? transfer.b : transfer.a;

        lower.lock();
        higher.lock();
        transfer.a.setAmount(transfer.a.getAmount() - transfer.amount);
        transfer.b.setAmount(transfer.b.getAmount() + transfer.amount);
        higher.unlock();
        lower.unlock();
    }

    public static void main(String[] args) {
        final Account account1 = new Account();
        final Account account2 = new Account();
        transfer(new Transfer(3, account1, account2));
        account1.lock();
        System.out.println(account1.getAmount());
        account1.unlock();
        account2.lock();
        System.out.println(account2.getAmount());
        account2.unlock();
    }
}
