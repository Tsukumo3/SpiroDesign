package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.awt.Color;
import java.awt.geom.Point2D;

import org.junit.Test;

import spiroDesign.DesignLocus;

public class DesignLocusTest {

	//引数を用意
	Point2D.Double testPoint2D = new Point2D.Double(0.0d, 0.0d);
	Color testColor = new Color(0,0,0);
	Integer testInteger = new Integer(0);

	@Test
	public void testDesignLocus() {
		//インスタンスを生成
		DesignLocus testDesignLocus1 = new DesignLocus(testPoint2D,testColor,testInteger);
		DesignLocus testDesignLocus2 = testDesignLocus1;
		assertThat(testDesignLocus1, is(sameInstance(testDesignLocus2)));
		assertThat(testDesignLocus1, is(instanceOf(DesignLocus.class)));
	}

	@Test
	public void testSetPlot() {
		//インスタンスを生成
		DesignLocus testDesignLocus = new DesignLocus(testPoint2D,testColor,testInteger);
		//値を用意
		Point2D.Double aPoint2D = new Point2D.Double(1.0d, 1.0d);
		//実行
		testDesignLocus.setPlot(aPoint2D);
		//検証
		assertThat(testDesignLocus.getPlot(),is(aPoint2D));
	}

	@Test
	public void testGetPlot() {
		//インスタンスを生成
		DesignLocus testDesignLocus = new DesignLocus(testPoint2D,testColor,testInteger);
		//実行//検証
		assertThat(testDesignLocus.getPlot(),is(testPoint2D));
	}

	@Test
	public void testSetPenColor() {
		//インスタンスを生成
		DesignLocus testDesignLocus = new DesignLocus(testPoint2D,testColor,testInteger);
		//値を用意
		Color aColor = new Color(255,0,0);
		//実行
		testDesignLocus.setPenColor(aColor);
		//検証
		assertThat(testDesignLocus.getPenColor(),is(aColor));
	}

	@Test
	public void testGetPenColor() {
		//インスタンスを生成
		DesignLocus testDesignLocus = new DesignLocus(testPoint2D,testColor,testInteger);
		//実行//検証
		assertThat(testDesignLocus.getPenColor(),is(testColor));
	}

	@Test
	public void testSetPenNib() {
		//インスタンスを生成
		DesignLocus testDesignLocus = new DesignLocus(testPoint2D,testColor,testInteger);
		//値を用意
		Integer aInteger = new Integer(1);
		//実行
		testDesignLocus.setPenNib(aInteger);
		//検証
		assertThat(testDesignLocus.getPenNib(),is(aInteger));
	}

	@Test
	public void testGetPenNib() {
		//インスタンスを生成
		DesignLocus testDesignLocus = new DesignLocus(testPoint2D,testColor,testInteger);
		//実行//検証
		assertThat(testDesignLocus.getPenNib(),is(testInteger));
	}
}
