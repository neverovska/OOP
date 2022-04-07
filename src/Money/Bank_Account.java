package Money;

public class Bank_Account {
    private String user;
    private String number;
    private double count;
    private boolean bloking;
    private boolean freezing;

    public Bank_Account(){}
    public Bank_Account(String user, String number, double count){
        this.user = user;
        this.number = number;
        this.count = count;
        bloking = false;
        freezing = false;
    }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public double getCount() { return count; }
    public void setCount(double count) { this.count = count; }

    public boolean getBloking() { return bloking; }
    public void setBloking(boolean bloking) { this.bloking = bloking; }

    public boolean getFreezing() { return freezing; }
    public void setFreezing(boolean freezing) { this.freezing = freezing; }
}
