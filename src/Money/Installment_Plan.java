package Money;

import User.Client;

public class Installment_Plan {
    private int month;
    private String number;
    private boolean open;
    private boolean allowed;

    public Installment_Plan(String number, int month, Client cl) {
        if(cl.getName().equals("Tom")) {
            this.number = number;
            this.month = month;
            this.open = true; // если клиент подходить под условие выдачи кредита, то ему остаётся ждать подтверждения менеджера
        }
        else {
            this.open = false; // клиент не подходит под условие выдачи кредита, open == false, запрос не направляется к оператору
        }
    }

    public int getMonth() { return month; }
    public String getNumber() { return number; }
    public boolean getOpen() { return open; }
    public void setOpen(boolean open) { this.open = open; }
}
