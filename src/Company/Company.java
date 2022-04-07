package Company;

public class Company {
    private String type;
    private String name;
    private String unp;
    private String bank_BIK;
    private String adres;
    private String password;

    public Company(String type, String name, String unp, String bank_BIK, String adres, String password) {
        this.type = type;
        this.name = name;
        this.unp = unp;
        this.bank_BIK = bank_BIK;
        this.adres = adres;
        this.password = password;
    }

    public String getType() { return type; }
    public String getName() { return name; }
    public String getUnp() { return unp; }
    public String getBank_BIK() { return bank_BIK; }
    public String getAdres() { return adres; }
    public void setType(String type) { this.type = type; }
    public void setName(String name) { this.name = name; }
    public void setUnp(String unp) { this.unp = unp; }
    public void setBank_BIK(String bank_BIK) { this.bank_BIK = bank_BIK; }
    public void setAdres(String adres) { this.adres = adres; }
}
