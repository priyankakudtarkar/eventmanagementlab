package emc;
import static org.junit.Assert.*;

import org.junit.Test;

public class testOption {

	@Test
	public void test() {
		Option op1 = new Option("open Hall",200);
		assertEquals(200, op1.price);
	}

}
