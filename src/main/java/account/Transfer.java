package account;

public final class Transfer {
    final int amount;
    final Account a;
    final Account b;

    Transfer(int amount, Account a, Account b) {
        this.amount = amount;
        this.a = a;
        this.b = b;
    }
}
