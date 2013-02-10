package account;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int amount;
    private final ReentrantLock lock = new ReentrantLock();

    void lock() {
        lock.lock();
    }
    void unlock() {
        lock.unlock();
    }

    public int getAmount() {
        checkLocked();
        return amount;
    }

    private void checkLocked() {
        if (!lock.isLocked())
            throw new IllegalStateException();
    }

    public void setAmount(int newAmount) {
        checkLocked();
        amount = newAmount;
    }
}