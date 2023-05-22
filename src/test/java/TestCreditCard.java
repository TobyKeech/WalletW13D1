import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreditCard {
    CreditCard creditCard;

    @Before
    public void setUp(){
        creditCard = new CreditCard("1236273626", "06/28", 265, 1000);
    }

    @Test
    public void canChargeCreditCard(){
        creditCard.charge(100);
        assertEquals(880, creditCard.getAvailableCredit());

    }


}
