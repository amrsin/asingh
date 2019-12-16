package vectornew;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class vectorTest {

	@Test
	void test() {
		assertEquals(21, vector.max(new int []{14,21,12,9, 7}));	
	}
	
	@Test
	void selectionSort (  ) {
		int[] v1= {14, 21, 12, 7, 9};
		vector.ordenar(v1);
		assertArrayEquals(new int[] {7, 9, 12, 14, 21}, v1);
	}
}

