public class GiftCard implements IChargeable {

    private int balance;

    public GiftCard(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    @Override
    public void charge(int purchaseAmount) {
        this.balance -= purchaseAmount;
    }
}
