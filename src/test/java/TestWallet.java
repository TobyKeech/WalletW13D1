import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestWallet {
    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    Wallet wallet;

    @Before
    public void setUp(){
        wallet = new Wallet();
        debitCard = new DebitCard("2424234", "06/34", 256, "321831473",
                "438567", 500.00);
        giftCard = new GiftCard(200);
        creditCard = new CreditCard("1236273626", "06/28", 265, 1000);
        wallet.addCardsToWallet(debitCard);
        wallet.addCardsToWallet(creditCard);
        wallet.addCardsToWallet(giftCard);

    }

    @Test
    public void canPay(){
        wallet.pay(debitCard,200);
        assertEquals(300, debitCard.getBalance(), 0.0);
    }
}
