package atm.entity;


import java.sql.Timestamp;

public class Info{
    public int id;
    public int balance;
    public Timestamp time;


    public Info() {
    }

    public Info(int id, int balance, Timestamp time) {
        this.id = id;
        this.balance = balance;
        this.time = time;
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

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}