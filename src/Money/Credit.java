package Money;

import User.Client;

public class Credit {
    private double percent;
    private int month;
    private String number;
    private boolean open;
    private boolean allowed;

    public Credit(String number, int month, double percent, Client cl) {
        if(cl.getName().equals("Tom")) {
            this.number = number;
            this.month = month;
            this.percent = percent;
            this.open = true; // если клиент подходить под условие выдачи кредита, то ему остаётся ждать подтверждения менеджера
        }
        else {
            this.open = false; // клиент не подходит под условие выдачи кредита, open == false, запрос не направляется к оператору
        }
    }

    public double getPercent() { return percent; }
    public void setPercent(double percent) { this.percent = percent; }
    public int getMonth() { return month; }
    public String getNumber() { return number; }
    public boolean getOpen() { return open; }
    public void setOpen(boolean open) { this.open = open; }
}
