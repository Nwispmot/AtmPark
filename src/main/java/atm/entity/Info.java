package atm.entity;

import java.sql.Time;

public class Info{
    public int id;
    public int balance;
    public Time time;


    public Info() {
    }

    public Info(int id, int balance, Time time) {
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}