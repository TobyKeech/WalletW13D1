public class CreditCard extends PaymentCard implements IChargeable{
    private int availableCredit;

    public CreditCard(String cardNumber, String expiryDate, int securityNo, int availableCredit) {
        super(cardNumber, expiryDate, securityNo);
        this.availableCredit = availableCredit;
    }

    public int getAvailableCredit() {
        return this.availableCredit;
    }
    @Override
    public void charge(int purchaseAmount) {
        double creditAmount = purchaseAmount * 0.2;
        double totalTransaction = purchaseAmount + creditAmount;
        System.out.println(totalTransaction);
        this.availableCredit -= totalTransaction;
    }
}
