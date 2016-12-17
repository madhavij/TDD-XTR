package tdd.xtr;

import org.junit.Test;

import java.util.Objects;

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
        assertEquals(8,product.length); //Assert
        product = four.times(3);
        assertEquals(12,product.length);
    }

    @Test public void
    should_test_equality(){
        assertTrue(new Meter(4).equals(new Meter(4)));
        assertFalse(new Meter(4).equals(new Meter(5)));
    }

    class Meter{
        private int length;
        public Meter(int length){
            this.length = length;
        }
        public Meter times(int multiplier){
            return new Meter(length * multiplier);
        }
        @Override
        public boolean equals(Object obj){
            Meter meter =(Meter) obj;
            return meter.length == this.length;

        }
    }

}
