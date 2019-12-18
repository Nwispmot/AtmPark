package atm.entity;

public class Atm{

    public int id;
    public int account;
    public boolean isAvailable;

    public Atm() {
    }


    public Atm(int id, int account, boolean isAvailable) {
        this.id = id;
        this.account = account;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}