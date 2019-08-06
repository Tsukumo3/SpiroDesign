package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.junit.Test;

import spiroDesign.SpiroGear;



public class SpiroGearTest {

	@Test
	public void testSpiroGear() {
		SpiroGear testGear1 = new SpiroGear();
		SpiroGear testGear2 = testGear1;
		assertThat(testGear1, is(sameInstance(testGear2)));
		assertThat(testGear1, is(instanceOf(SpiroGear.class)));
	}

	@Test
	public void testSpiroGearDoubleDouble() {
		//値を用意
		Double x = 300.0d;
		Double y = 300.0d;

		SpiroGear testGear1 = new SpiroGear(x,y);
		SpiroGear testGear2 = testGear1;
		assertThat(testGear1, is(sameInstance(testGear2)));
		assertThat(testGear1, is(instanceOf(SpiroGear.class)));
	}

	@Test
	public void testSpiroGearDoubleDoubleDouble() {
		//値を用意
		Double x = 300.0d;
		Double y = 300.0d;
		Double r = 200.0d;
		SpiroGear testGear1 = new SpiroGear(x,y,r);
		SpiroGear testGear2 = testGear1;
		assertThat(testGear1, is(sameInstance(testGear2)));
		assertThat(testGear1, is(instanceOf(SpiroGear.class)));
	}

	@Test
	public void testSpiroGearPoint2DDoubleDouble() {
		//値を用意
		Double x = 300.0d;
		Double y = 300.0d;
		Point2D.Double aPoint2D = new Point2D.Double(x,y);
		Double r = 200.0d;
		SpiroGear testGear1 = new SpiroGear(aPoint2D,r);
		SpiroGear testGear2 = testGear1;
		assertThat(testGear1, is(sameInstance(testGear2)));
		assertThat(testGear1, is(instanceOf(SpiroGear.class)));
	}

	@Test
	public void testSpiroGearDouble() {
		Double r = 200.0d;
		SpiroGear testGear1 = new SpiroGear(r);
		SpiroGear testGear2 = testGear1;
		assertThat(testGear1, is(sameInstance(testGear2)));
		assertThat(testGear1, is(instanceOf(SpiroGear.class)));
	}

	@Test
	public void testSetCenter() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//値を用意
		Point2D.Double aPoint2D = new Point2D.Double(200.0d,200.0d);
		//実行
		testGear.setCenter(aPoint2D);
		//検証
		assertThat(testGear.getCenter(),is(aPoint2D));
	}

	@Test
	public void testGetCenter() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行//検証　
		assertThat(testGear.getCenter(),is(new Point2D.Double(300.0d,300.0d)));
	}

	@Test
	public void testLeft() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testGear.left(),is(new Point2D.Double(100.0d,300.0d)));
	}

	@Test
	public void testRight() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行//検証
		//300,300 r=200  -> rigt(500,300)
		assertThat(testGear.right(),is(new Point2D.Double(500.0d,300.0d)));
	}

	@Test
	public void testTop() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行//検証
		//300,300 r=200  -> top(300,500)
		assertThat(testGear.top(),is(new Point2D.Double(300.0d,500.0d)));
	}

	@Test
	public void testBottom() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行//検証
		//300,300 r=200  -> bottom(500,100)
		assertThat(testGear.bottom(),is(new Point2D.Double(300.0d,100.0d)));
	}

	@Test
	public void testCenterRectangle() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//値を用意
		Rectangle2D.Double aRect = testGear.toRectangle2D( testGear.getCenter(), 10.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testGear.centerRectangle(),is(aRect));
	}

	@Test
	public void testLeftRectangle() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//値を用意
		Rectangle2D.Double aRect = testGear.toRectangle2D( testGear.left(), 10.0d);
		//実行//検証
		assertThat(testGear.leftRectangle(),is(aRect));
	}

	@Test
	public void testRightRectangle() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//値を用意
		Rectangle2D.Double aRect = testGear.toRectangle2D( testGear.right(), 10.0d);
		//実行//検証
		assertThat(testGear.rightRectangle(),is(aRect));
	}

	@Test
	public void testTopRectangle() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//値を用意
		Rectangle2D.Double aRect = testGear.toRectangle2D( testGear.top(), 10.0d);
		//実行//検証
		assertThat(testGear.topRectangle(),is(aRect));
	}

	@Test
	public void testBottomRectangle() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//値を用意
		Rectangle2D.Double aRect = testGear.toRectangle2D( testGear.bottom(), 10.0d);
		//実行//検証
		assertThat(testGear.bottomRectangle(),is(aRect));
	}

	@Test
	public void testGetRadius() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行 検証
		assertThat(testGear.getRadius(),is(200.0d));
	}

	@Test
	public void testSetRadius() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//実行
		testGear.setRadius(200.0d);
		//検証
		assertThat(testGear.getRadius(),is(200.0d));
	}

	@Test
	public void testRotate() {
		//なにもしていない
	}

	@Test
	public void testToRectangle2D() {
		//インスタンスを生成
		SpiroGear testGear = new SpiroGear();
		//座標とサイズから四角を生成する
		//実行
		Rectangle2D.Double testRect = testGear.toRectangle2D( testGear.getCenter(), 10.0d);
		Rectangle2D.Double aRect = new Rectangle2D.Double(testGear.getCenter().getX()-5.0d,
														  testGear.getCenter().getY()-5.0d,
														  10,10);
		//検証
		assertThat(testRect,is(aRect));
	}

	@Test
	public void testToString() {
		//何もしていない
	}

}
