package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class HaruibeTest {

	@Test
	public void capitalize() {
		InToEng scu = new InToEng();
		String expected = "one hundred twenty three";
		String actual = scu.translateEng(123);
		assertThat(actual,is(expected));

	}
}
