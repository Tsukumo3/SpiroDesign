package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.junit.Test;

import spiroDesign.PinionGear;
import spiroDesign.SpurGear;

public class PinionGearTest {

	@Test
	public void testRight() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行
		Point2D.Double aPoint2D = testPinionGear.right();
		//予測値 300,300,200 -> 450,300,50
		Double x = 450.0d + 50*Math.cos(0);
		Double y = 300.0d + 50*Math.sin(0);
		Point2D.Double expectPoint2D = new Point2D.Double(x, y);
		//検証
		assertThat(aPoint2D,is(expectPoint2D));
	}

	@Test
	public void testTop() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行
		Point2D.Double aPoint2D = testPinionGear.top();
		//予測値 300,300,200 -> 450,300,50
		Double x = 450.0d + 50*Math.cos(0.5d*Math.PI);
		Double y = 300.0d + 50*Math.sin(0.5d*Math.PI);
		Point2D.Double expectPoint2D = new Point2D.Double(x, y);
		//検証
		assertThat(aPoint2D,is(expectPoint2D));
	}

	@Test
	public void testLeft() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行
		Point2D.Double aPoint2D = testPinionGear.left();
		//予測値 300,300,200 -> 450,300,50
		Double x = 450.0d + 50*Math.cos(Math.PI);
		Double y = 300.0d + 50*Math.sin(Math.PI);
		Point2D.Double expectPoint2D = new Point2D.Double(x, y);
		//検証
		assertThat(aPoint2D,is(expectPoint2D));
	}

	@Test
	public void testBottom() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行
		Point2D.Double aPoint2D = testPinionGear.bottom();
		//予測値 300,300,200 -> 450,300,50
		Double x = 450.0d + 50*Math.cos(1.5d*Math.PI);
		Double y = 300.0d + 50*Math.sin(1.5d*Math.PI);
		Point2D.Double expectPoint2D = new Point2D.Double(x, y);
		//検証
		assertThat(aPoint2D,is(expectPoint2D));
	}

	@Test
	public void testPinionGearSpurGear() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear1 = new PinionGear(testSpurGear);
		PinionGear testPinionGear2 = testPinionGear1;
		assertThat(testPinionGear1, is(sameInstance(testPinionGear2)));
		assertThat(testPinionGear1, is(instanceOf(PinionGear.class)));
	}

	@Test
	public void testPinionGearSpurGearDouble() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		Double aRadius = new Double(50.0d);

		PinionGear testPinionGear1 = new PinionGear(testSpurGear,aRadius);
		PinionGear testPinionGear2 = testPinionGear1;
		//検証
		assertThat(testPinionGear1, is(sameInstance(testPinionGear2)));
		assertThat(testPinionGear1, is(instanceOf(PinionGear.class)));
	}

	@Test
	public void testPinionGearDoubleDoubleDouble() {
		//インスタンスを生成
		Point2D.Double pinionCenter = new Point2D.Double(500.0d,500.0d);
		Double aRadius = new Double(50.0d);
		Point2D.Double penPosition = new Point2D.Double(500.0d,500.0d);

		PinionGear testPinionGear1 = new PinionGear(pinionCenter,aRadius,penPosition);
		PinionGear testPinionGear2 = testPinionGear1;
		//検証
		assertThat(testPinionGear1, is(sameInstance(testPinionGear2)));
		assertThat(testPinionGear1, is(instanceOf(PinionGear.class)));
	}

	@Test
	public void testPinionGearDoubleDoubleDoubleColorInt() {
		//インスタンスを生成
		Point2D.Double pinionCenter = new Point2D.Double(500.0d,500.0d);
		Double aRadius = new Double(50.0d);
		Point2D.Double penPosition = new Point2D.Double(500.0d,500.0d);
		Integer penNib = new Integer(5);
		Color penColor = new Color(0,0,0);

		PinionGear testPinionGear1 = new PinionGear(pinionCenter,aRadius,penPosition,penColor,penNib);
		PinionGear testPinionGear2 = testPinionGear1;
		//検証
		assertThat(testPinionGear1, is(sameInstance(testPinionGear2)));
		assertThat(testPinionGear1, is(instanceOf(PinionGear.class)));
	}

	@Test
	public void testPinionGearDoubleDoubleDoubleColorIntDouble() {
		//インスタンスを生成
		Point2D.Double pinionCenter = new Point2D.Double(500.0d,500.0d);
		Double aRadius = new Double(50.0d);
		Point2D.Double penPosition = new Point2D.Double(500.0d,500.0d);
		Integer penNib = new Integer(5);
		Color penColor = new Color(0,0,0);
		Double distance = new Double(100.0d);

		PinionGear testPinionGear1 = new PinionGear(pinionCenter,aRadius,penPosition,penColor,penNib,distance);
		PinionGear testPinionGear2 = testPinionGear1;
		//検証
		assertThat(testPinionGear1, is(sameInstance(testPinionGear2)));
		assertThat(testPinionGear1, is(instanceOf(PinionGear.class)));
	}

	@Test
	public void testGetPenColor() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行 検証
		assertThat(testPinionGear.getPenColor(),is( new Color(0,0,0)));
	}

	@Test
	public void testSetPenColor() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Color aColor = new Color(255,0,0);
		//実行
		testPinionGear.setPenColor(aColor);
		//検証
		assertThat(testPinionGear.getPenColor(),is( new Color(255,0,0)));
	}

	@Test
	public void testGetPenNib() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行 検証
		assertThat(testPinionGear.getPenNib(),is(5));
	}

	@Test
	public void testSetPenNib() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Integer aInteger = new Integer(10);
		//実行
		testPinionGear.setPenNib(aInteger);
		//検証
		assertThat(testPinionGear.getPenNib(),is(aInteger));
	}

	@Test
	public void testGetPenPosition() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行//検証
		assertThat(testPinionGear.getPenNib(),is(5));
	}

	@Test
	public void testSetPenPosition() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Point2D.Double aPoint2D = new Point2D.Double(500.0d,500.0d);
		//実行
		testPinionGear.setPenPosition(aPoint2D);
		//検証
		assertThat(testPinionGear.getPenPosition(),is(aPoint2D));
	}

	@Test
	public void testGetPinionDegrees() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行//検証
		assertThat(testPinionGear.getPinionDegrees(),is(0.0d));
	}

	@Test
	public void testSetPinionDegrees() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Double aDegrees = new Double(0.0d);
		//実行
		testPinionGear.setPinionDegrees(aDegrees);
		//検証
		assertThat(testPinionGear.getPinionDegrees(),is(aDegrees));
	}

	@Test
	public void testGetPsi() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行 検証
		assertThat(testPinionGear.getPsi(),is(0.0d));
	}

	@Test
	public void testSetPsi() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Double aPsi = new Double(0.0d);
		//実行
		testPinionGear.setPsi(aPsi);
		//検証
		assertThat(testPinionGear.getPsi(),is(aPsi));
	}

	@Test
	public void testGetPhi() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行 検証
		assertThat(testPinionGear.getPhi(),is(0.0d));
	}

	@Test
	public void testSetPhi() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Double aPhi = new Double(0.0d);
		//実行
		testPinionGear.setPhi(aPhi);
		//検証
		assertThat(testPinionGear.getPhi(),is(aPhi));
	}

	@Test
	public void testGetTheta() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行検証
		assertThat(testPinionGear.getTheta(),is(0.0d));
	}

	@Test
	public void testSetTheta() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Double aTheta = new Double(0.0d);
		//実行
		testPinionGear.setTheta(aTheta);
		//検証
		assertThat(testPinionGear.getPhi(),is(aTheta));
	}

	@Test
	public void testGetPinionDistance() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行//検証
		assertThat(testPinionGear.getPinionDistance(),is(50.0d));
	}

	@Test
	public void testSetPinionDistance() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Double aTheta = new Double(0.0d);
		//実行
		testPinionGear.setTheta(aTheta);
		//検証
		assertThat(testPinionGear.getTheta(),is(aTheta));
	}

	@Test
	public void testGetPenDistance() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//実行//検証
		assertThat(testPinionGear.getPinionDistance(),is(50.0d));
	}

	@Test
	public void testSetPenDistance() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Double aDistance = new Double(50.0d);
		//実行
		testPinionGear.setPenDistance(aDistance);
		//検証
		assertThat(testPinionGear.getPinionDistance(),is(aDistance));
	}

	@Test
	public void testBottomRectangle2D() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Rectangle2D.Double aRect = testPinionGear.toRectangle2D( testPinionGear.bottom(), 10.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testPinionGear.bottomRectangle2D(),is(aRect));
	}

	@Test
	public void testLeftRectangle2D() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Rectangle2D.Double aRect = testPinionGear.toRectangle2D( testPinionGear.left(), 10.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testPinionGear.leftRectangle2D(),is(aRect));
	}

	@Test
	public void testRightRectangle2D() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Rectangle2D.Double aRect = testPinionGear.toRectangle2D( testPinionGear.right(), 10.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testPinionGear.rightRectangle2D(),is(aRect));
	}

	@Test
	public void testTopRectangle2D() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Rectangle2D.Double aRect = testPinionGear.toRectangle2D( testPinionGear.top(), 10.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testPinionGear.topRectangle2D(),is(aRect));
	}

	@Test
	public void testCenterRectangle2D() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Rectangle2D.Double aRect = testPinionGear.toRectangle2D( testPinionGear.getCenter(), 10.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testPinionGear.centerRectangle2D(),is(aRect));
	}

	@Test
	public void testPenRectangle2D() {
		//インスタンスを生成
		SpurGear testSpurGear = new SpurGear();
		PinionGear testPinionGear = new PinionGear(testSpurGear);
		//値を用意
		Rectangle2D.Double aRect = testPinionGear.toRectangle2D( testPinionGear.getPenPosition(), 20.0d);
		//実行//検証
		//300,300 r=200  -> left(100,300)
		assertThat(testPinionGear.penRectangle2D(),is(aRect));
	}
}
