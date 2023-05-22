import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDebitCard {

    DebitCard debitCard;

    @Before
    public void setUp(){
        debitCard = new DebitCard("2424234", "06/34", 256, "321831473",
                "438567", 500.00);
    }

    @Test
    public void canCharge(){
       debitCard.charge(50);
       assertEquals(450, debitCard.getBalance(), 0.1);


    }

}
