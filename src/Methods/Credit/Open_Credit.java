package Methods.Credit;

import Company.Bank;
import Money.Credit;
import User.Client;

public class Open_Credit {
    public void Open(Bank bank, Client client){
        Credit credit = new Credit("121234", 24, 30.1, client);
        Credit_allowed allowed = new Credit_allowed();
        if(credit.getOpen() && allowed.Allowed()) {
            bank.getCredits().add(credit);
        }
        else {
            System.out.print("\nВ кредите отказано.\n");
        }
    }
}
//необходимо разрешение пользователя авторизированного как менеджер.............................