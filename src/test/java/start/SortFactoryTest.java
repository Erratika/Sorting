package start;

import model.SortFactory;
import model.SortStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortFactoryTest {
	private SortFactory sortFactory;

	@BeforeEach
	void setUp() {
		sortFactory = new SortFactory();
	}

	@Test
	void testFactoryValid() {
		sortFactory.createSorter(SortStrategy.BUBBLE_SORT);

	}

	@Test
	void testFactoryNull() {
		sortFactory.createSorter(null);
	}
}