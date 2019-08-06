package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import spiroDesign.SpiroController;
import spiroDesign.SpiroModel;
import spiroDesign.SpiroView;

public class SpiroViewTest {

	@Test
	public void testSpiroViewSpiroModel() {
		SpiroModel testModel = new SpiroModel();
		SpiroView testView1 = new SpiroView(testModel);
		SpiroView testView2 = testView1;
		assertThat(testView1,is(sameInstance(testView2)));
		assertThat(testView1,is(instanceOf(SpiroView.class)));
	}

	@Test
	public void testSpiroViewSpiroModelSpiroController() {
		SpiroModel testModel = new SpiroModel();
		SpiroController testCont = new SpiroController();
		SpiroView testView1 = new SpiroView(testModel,testCont);
		SpiroView testView2 = testView1;
		assertThat(testView1,is(sameInstance(testView2)));
		assertThat(testView1,is(instanceOf(SpiroView.class)));
	}

	@Test
	public void testPaintComponentGraphics() {
		//動作テストで確認
	}

	@Test
	public void testDisplaySpurGear() {
		//動作テストで確認
	}

	@Test
	public void testDisplayPinionGear() {
		//動作テストで確認
	}

	@Test
	public void testDisplayDesignLoci() {
		//動作テストで確認
	}

	@Test
	public void testUpdate() {
		//動作テストで確認
	}

}
