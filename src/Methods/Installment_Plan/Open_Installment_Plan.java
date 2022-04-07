package Methods.Installment_Plan;

import Company.Bank;
import Methods.Credit.Credit_allowed;
import Money.Installment_Plan;
import User.Client;

public class Open_Installment_Plan {
    public void Open(Bank bank, Client client){
        Installment_Plan installment_plan = new Installment_Plan("121234", 24, client);
        Installment_Plan_allowed allowed = new Installment_Plan_allowed();
        if(installment_plan.getOpen() && allowed.Allowed()) {
            bank.getInstallment_plans().add(installment_plan);
        }
        else {
            System.out.print("\nВ кредите отказано.\n");
        }
    }
}
