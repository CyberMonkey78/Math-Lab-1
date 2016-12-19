package thing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingPerimeters {

	@Test
	public void test() {
		assertEquals(12.0, Geometry.squarePerimeter(3), .000001);
		assertEquals(1.5, Geometry.squareMerimeter(1.5), .000001);
	}

}
