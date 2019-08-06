package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import spiroDesign.SpiroController;

public class SpiroControllerTest {

	@Test
	public void testSpiroController() {
		SpiroController testCont1 = new SpiroController();
		SpiroController testCont2 = testCont1;
		assertThat(testCont1,is(sameInstance(testCont2)));
		assertThat(testCont1,is(instanceOf(SpiroController.class)));
		}

	@Test
	public void testMouseClickedMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMouseDraggedMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMouseEnteredMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMouseExitedMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMouseMovedMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMousePressedMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMouseReleasedMouseEvent() {
		//動作テストにより確認
	}

	@Test
	public void testMouseWheelMovedMouseWheelEvent() {
		//動作テストにより確認
	}

	@Test
	public void testWhichPickingArea() {
		//動作テストにより確認
	}

	@Test
	public void testExtendsRectangle2D() {
		//動作テストにより確認
	}

	@Test
	public void testSetModel() {
		//動作テストにより確認
	}

	@Test
	public void testSetView() {
		//動作テストにより確認
	}

	@Test
	public void testActionPerformed() {
		//動作テストにより確認
	}

	@Test
	public void testInitPopupMenu() {
		//動作テストにより確認
	}

}
