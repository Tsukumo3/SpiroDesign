package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import spiroDesign.SpurGear;

public class SpurGearTest {

	@Test
	public void testSpurGear() {
		SpurGear testSpurGear1 = new SpurGear();
		SpurGear testSpurGear2 = testSpurGear1;
		assertThat(testSpurGear1, is(sameInstance(testSpurGear2)));
		assertThat(testSpurGear1, is(instanceOf(SpurGear.class)));
	}

	@Test
	public void testSpurGearDoubleDoubleDouble() {
		SpurGear testSpurGear1 = new SpurGear(0.0d,0.0d,0.0d);
		SpurGear testSpurGear2 = testSpurGear1;
		assertThat(testSpurGear1, is(sameInstance(testSpurGear2)));
		assertThat(testSpurGear1, is(instanceOf(SpurGear.class)));
	}

}
