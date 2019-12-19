package atm.entity;

public class Atm{

    public int id;
    public int balance;
    public boolean isAvailable;

    public Atm() {
    }


    public Atm(int id, int balance, boolean isAvailable) {
        this.id = id;
        this.balance = balance;
        this.isAvailable = isAvailable;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}