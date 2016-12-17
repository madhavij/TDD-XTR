package tdd.xtr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by m on 17/12/16.
 */
public class MeterTest {
    @Test public void
    should_test_multiply(){
        Meter four = new Meter(4); //Arrange
        Meter product = four.times(2);  //Act
        assertEquals(8,Meter(8)); //Assert
        assertEquals(12,Meter(12));
    }

    @Test public void
    should_test_equality(){
        assertTrue(new Meter(4).equals(new Meter(4)));
        assertFalse(new Meter(4).equals(new Meter(5)));
    }

}
