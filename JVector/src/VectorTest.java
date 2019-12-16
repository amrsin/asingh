import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class VectorTest {

	@Test
	void indexOf() {
		
		int [] v = new int[] {17, 12, 15, 9, 14};
		int x = 15;
		int index = vector2.indexOf(v, x);
		
		assertEquals(2, index);
		assertEquals(0, vector2.indexOf(v, 17));
		assertEquals(1, vector2.indexOf(v, 12));
		assertEquals(2, vector2.indexOf(v, 15));
		assertEquals(3, vector2.indexOf(v, 9));
		assertEquals(4, vector2.indexOf(v, 14));
		assertEquals(-1, vector2.indexOf(v, 33));
		
	}

}
