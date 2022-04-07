package User;

import Money.Bank_Account;

import java.util.ArrayList;

public class Client extends User {
    private ArrayList<Bank_Account> accounts;
    private String country;


    public Client(String name, String passport, String id, String phone_number, String email, String password, String country) {
        super(name, passport, id, phone_number, email, password);
        this.country = country;
        accounts = new ArrayList<Bank_Account>();
    }

    public ArrayList<Bank_Account> getAccounts() { return accounts; }
    public void setAccounts(ArrayList<Bank_Account> accounts) { this.accounts = accounts; }
    public String getCountry() { return country; }
}
