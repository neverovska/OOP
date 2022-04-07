package Money;

public class Money_Transfer {
    public void Transfer(Bank_Account client1, Bank_Account client2, float count) {
        if(client1.getCount() >= count) {
            client1.setCount(client1.getCount() - count);
            client2.setCount(client2.getCount() + count);
            System.out.printf("%f   %f", client1.getCount(),client2.getCount());
        }
        else {
            System.out.print("\nОшибка операции (недостаточно средств).\n");
        }
    }
}
