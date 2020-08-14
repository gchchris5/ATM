import java.text.DecimalFormat;

public class Account {

    private String name;
    private int pinID;
    private double balance;
    private DecimalFormat format = new DecimalFormat("0.00");

    public Account(String nameIn, int pinIDIn) {
        this.name = nameIn;
        this.pinID = pinIDIn;
        this.balance = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }

    public int getPinID() {
        return this.pinID;
    }

    public void setPinID(int pinIDIn) {
        this.pinID = pinIDIn;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balanceIn) {
        this.balance = balanceIn;
    }

    public String toString() {
        String output = "Account Name: " + name + "\nAccount PIN: " + pinID
                + "\nAccount Balance: $" + format.format(balance);
        return output;
    }
}
