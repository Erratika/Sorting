package start;

import exceptions.InvalidArraySizeException;
import model.RandomArrayGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomArrayGeneratorTest {
	@Test
	void testValidSize() {
		try {
			int expectedSize = 5;
			int actualSize = RandomArrayGenerator.randomArray(expectedSize).length;
			assertEquals(expectedSize, actualSize);
		} catch (InvalidArraySizeException e) {

		}
	}

	@Test
	void testZeroSize() {
		try {
			int expectedSize = 0;
			int[] randomArray = RandomArrayGenerator.randomArray(expectedSize);
			int actualSize = randomArray.length;
			assertEquals(expectedSize, actualSize);
			assertArrayEquals(new int[0], randomArray);
		} catch (InvalidArraySizeException e) {

		}

	}

	@Test
	void testNegativeSize() {
		assertThrows(InvalidArraySizeException.class, () -> {
			int expectedSize = -4;
			RandomArrayGenerator.randomArray(expectedSize);
		});
	}

	@Test
	void testBoundaryMaxSize() {
		assertThrows(InvalidArraySizeException.class, () -> {
			int expectedSize = Integer.MAX_VALUE;
			RandomArrayGenerator.randomArray(expectedSize);
		});

	}

	@Test
	void testBoundaryMinSize() {
		assertThrows(InvalidArraySizeException.class, () -> {
			int expectedSize = Integer.MIN_VALUE;
			RandomArrayGenerator.randomArray(expectedSize);
		});

	}


}