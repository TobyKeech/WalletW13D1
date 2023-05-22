public class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private int securityNo;

    public PaymentCard(String cardNumber, String expiryDate, int securityNo) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNo = securityNo;
    }
}
