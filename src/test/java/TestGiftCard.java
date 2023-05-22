import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGiftCard {

    GiftCard giftCard;

    @Before
    public void setUp(){
        giftCard = new GiftCard(200);
    }

    @Test
    public void canCharge(){
        giftCard.charge(100);
        assertEquals(100, giftCard.getBalance());
    }
}
