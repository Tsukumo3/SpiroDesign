package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import spiroDesign.SpiroIO;

public class SpiroIOTest {

	@Test
	public void testSpiroIO() {
		SpiroIO testIO1 = new SpiroIO();
		SpiroIO testIO2 = testIO1;
		assertThat(testIO1,is(sameInstance(testIO2)));
		assertThat(testIO1,is(instanceOf(SpiroIO.class)));
	}

	@Test
	public void testMakeSaveData() {
		//動作テストで確認
	}

	@Test
	public void testLoadSaveData() {
		//動作テストで確認
	}

	@Test
	public void testGetSuffix() {
		String str = new String("test.txt");
		assertThat(SpiroIO.getSuffix(str),is("txt"));

	}

	@Test
	public void testOpenImage() {
		//動作テストで確認
	}

}
