public class DebitCard extends PaymentCard implements IChargeable{

    private String accountNumber;
    private String sortCode;

    private double balance;

    public DebitCard(String cardNumber, String expiryDate, int securityNo, String accountNumber, String sortCode, double balance) {
        super(cardNumber, expiryDate, securityNo);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public void charge(int purchaseAmount) {
        System.out.println(purchaseAmount);
        this.balance -= purchaseAmount;
    }
}
