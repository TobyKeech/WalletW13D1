import java.util.ArrayList;

public class Wallet {

    private ArrayList<IChargeable> cards;


    public Wallet() {
        this.cards = new ArrayList<>();
    }

    public void addCardsToWallet(IChargeable cardToAdd){
        this.cards.add(cardToAdd);
    }

    public void pay(IChargeable card, int price){
        card.charge(price);
    }


}
