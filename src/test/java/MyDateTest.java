import static org.junit.jupiter.api.Assertions.*;

import org.example.MyDate;
import org.junit.jupiter.api.Test;

class MyDateTest {

	@Test
	void constructorSetsYear() {
		MyDate d = new MyDate(2021, 9, 10);
		assertEquals(2021, d.getYear());
	}

	@Test
	void constructorSetsMonth() {
		MyDate d = new MyDate(2021, 9, 10);
		assertEquals(9, d.getMonth());
	}

	@Test
	void constructorSetsDay() {
		MyDate d = new MyDate(2021, 9, 10);
		assertEquals(10, d.getDay());
	}

	@Test
	void tooLowMonthThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new MyDate(2021, 0, 1);
		});
	}

	@Test
	void tooHighMonthThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new MyDate(2021, 13, 1);
		});
	}

}
