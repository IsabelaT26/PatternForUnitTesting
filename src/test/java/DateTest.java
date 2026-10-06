import org.example.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    private Date date;

    @BeforeEach
    public void setUp(){
        date = new Date();
    }

    @Test
    public void TheYear2024_Should_Beleap_Year(){

        assertTrue(date.isLeapYear(2024));
    }

    @Test
    public void TheYear1904_Should_Beleap_Year(){


        assertTrue(date.isLeapYear(1904));
    }

    @Test
    public void TheYear2028_Should_Beleap_Year(){


        assertTrue(date.isLeapYear(2028));
    }

    @Test
    public void TheYear2152_Should_Beleap_Year(){

        assertTrue(date.isLeapYear(2152));
    }

    @Test
    public void TheYear2276_Should_Beleap_Year(){

        assertTrue(date.isLeapYear(2276));
    }

    @Test
    public void TheYear2400_Should_Beleap_Year(){


        assertTrue(date.isLeapYear(2400));
    }

    @Test
    public void normalYear_ShouldNotBe_LeapYear(){

        assertFalse(date.isLeapYear(2026));
    }
}
