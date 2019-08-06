package spiroTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import org.junit.Test;

import spiroDesign.DesignLocus;
import spiroDesign.PinionGear;
import spiroDesign.SpiroModel;
import spiroDesign.SpiroView;
import spiroDesign.SpurGear;

public class SpiroModelTest {

	@Test
	public void testSpiroModel() {
		SpiroModel testModel1 = new SpiroModel();
		SpiroModel testModel2 = testModel1;
		assertThat(testModel1, is(sameInstance(testModel2)));
		assertThat(testModel1, is(instanceOf(SpiroModel.class)));
	}

	@Test
	public void testAddDependent() {

		SpiroModel aSpiroModel = new SpiroModel();
		SpiroView aSpiroView = new SpiroView(aSpiroModel);
		aSpiroModel.addDependent(aSpiroView);
	}

	@Test
	public void testRun() {
		//動作テストにより動作を確認する
	}

	@Test
	public void testChanged() {
		//動作テストにより動作を確認する
	}

	@Test
	public void testGetIsAnimated() {
		//インスタンスを生成しisAnimatedをfalseにする
		SpiroModel aSpiroModel = new SpiroModel();
		//falseからtureになる
		aSpiroModel.setIsAnimated();
		assertThat(aSpiroModel.getIsAnimated(),is(true));

		//trueからfakseになる
		aSpiroModel.setIsAnimated();
		assertThat(aSpiroModel.getIsAnimated(),is(false));

	}

	@Test
	public void testSetIsAnimated() {
		//インスタンスを生成しisAnimatedをfalseにする
		SpiroModel aSpiroModel = new SpiroModel();
		//falseからtureになる
		aSpiroModel.getIsAnimated();
		assertThat(aSpiroModel.getIsAnimated(),is(false));
	}

	@Test
	public void testGetIsEdited() {
		//インスタンスを生成しfalseにする
		SpiroModel aSpiroModel = new SpiroModel();
		//初期状態はfalse
		assertThat(aSpiroModel.getIsEdited(),is(false));
		//treuをセット
		aSpiroModel.setIsEdited(true);
		assertThat(aSpiroModel.getIsEdited(),is(true));
	}

	@Test
	public void testSetIsEdited() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//trueをセットしたらtrueになる
		aSpiroModel.setIsEdited(true);
		assertThat(aSpiroModel.getIsEdited(),is(true));
		//trueをセットしたらtrueになる
		aSpiroModel.setIsEdited(false);
		assertThat(aSpiroModel.getIsEdited(),is(false));
	}

	@Test
	public void testPerform() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		aSpiroModel.perform();
		System.out.println();
		//検証
		assertThat(aSpiroModel.getPinionGear().getTheta() ,is(0.01d));
	}

	@Test
	public void testAddDesignLociDoubleColorInteger() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//引数を用意
		Point2D.Double aPoint2D = new Point2D.Double(0.0d, 0.0d);
		Color aColor = new Color(0,0,0);
		Integer aInteger = new Integer(0);
		//値をList格納
		aSpiroModel.addDesignLoci(aPoint2D,aColor,aInteger);
		//値を確認
		//assertThat(,is());.0
		//x座標
		assertThat(aSpiroModel.getDesignLoci().get(0).getPlot().getX(),is(0.0d));
		//y座標
		assertThat(aSpiroModel.getDesignLoci().get(0).getPlot().getY(),is(0.0d));
		//color Red
		assertThat(aSpiroModel.getDesignLoci().get(0).getPenColor().getRed(),is(0));
		//color Green
		assertThat(aSpiroModel.getDesignLoci().get(0).getPenColor().getGreen(),is(0));
		//color Blue
		assertThat(aSpiroModel.getDesignLoci().get(0).getPenColor().getBlue(),is(0));
		//penNib
		assertThat(aSpiroModel.getDesignLoci().get(0).getPenNib(),is(0));
	}

	@Test
	public void testAddDesignLoci() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//nullを格納
		aSpiroModel.addDesignLoci();
		assertThat(aSpiroModel.getDesignLoci().get(0), is(nullValue()));
	}

	@Test
	public void testSetTickTime() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		aSpiroModel.setTickTime(0);
		assertThat(aSpiroModel.getTickTime(),is(0));
		aSpiroModel.setTickTime(100);
		assertThat(aSpiroModel.getTickTime(),is(100));
	}

	@Test
	public void testGetTickTime() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//初期値は50
		assertThat(aSpiroModel.getTickTime(),is(50));
	}

	@Test
	public void testListFlush() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//designLociに値を50000個入れる
		for(int index = 0; index < 50000; index++){
			aSpiroModel.addDesignLoci();
		}
		//50000個めが削除されれば成功
		aSpiroModel.listFlush();
		assertThat(aSpiroModel.getDesignLoci().size()-1 ,is(49999));
	}

	@Test
	public void testSpiroStartAndStop() {
		//インスタンスを生成し
		SpiroModel aSpiroModel = new SpiroModel();
		//falseからtureになる
		aSpiroModel.spiroStartAndStop();
		assertThat(aSpiroModel.getIsAnimated(),is(true));
	}

	@Test
	public void testSetSpiroSpeed() {
		//インスタンスを生成し
		SpiroModel aSpiroModel = new SpiroModel();
		aSpiroModel.spiroSetSpeed(10);
		assertThat(aSpiroModel.getTickTime(),is(10));
	}


	@Test
	public void testSetIsRainbow() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//初期値falseからtrue
		assertThat(aSpiroModel.getIsRainbow(),is(false));
	}

	@Test
	public void testGetIsRainbow() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//初期値false
		assertThat(aSpiroModel.getIsRainbow(),is(false));
	}

	@Test
	public void testRainbow() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();

		//赤
		//pinionThetaを設定
		aSpiroModel.getPinionGear().setTheta(0.0d);
		//初期位相を設定
		aSpiroModel.getPinionGear().setPhi(0.0d);
		//実行
		aSpiroModel.rainbow();
		//測定
		Color penColor = aSpiroModel.getPinionGear().getPenColor();
		Color red = new Color(255,0,0);
		assertThat(penColor,is(red));

	}

	@Test
	public void testSetImage() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を用意
		BufferedImage img = aSpiroModel.getImage();
		//実行
		aSpiroModel.setImage(img);
		//検証
		assertThat(aSpiroModel.getImage(),is(img));
	}

	@Test
	public void testGetImage() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を用意//実行
		BufferedImage img = aSpiroModel.getImage();
		//検証
		assertThat(aSpiroModel.getImage(),is(img));
	}

	@Test
	public void testSpiroOpenImage() {
		//SpiroIOで動作を確認
	}

	@Test
	public void testSpiroSaveLoci() {
		//SpiroIOで動作を確認
	}

	@Test
	public void testSpiroLoadLoci() {
		//SpiroIOで動作を確認
	}


	@Test
	public void testSpiroDive() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		aSpiroModel.spiroDive();
		//検証
		Double aTheta = aSpiroModel.getPinionGear().getTheta();
		assertThat(aTheta,is(0.0d));

	}

	@Test
	public void testSpiroUndo() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//size = 0のとき
		//実行
		aSpiroModel.spiroUndo();
		//検証
		assertThat(aSpiroModel.getDesignLoci().size(),is(0));

		//size = 1 nullのみのとき
		aSpiroModel.addDesignLoci();
		//実行
		aSpiroModel.spiroUndo();
		//検証
		assertThat(aSpiroModel.getDesignLoci().size(),is(0));

		//size = 1 [data]のとき
		Point2D.Double aPoint2D = new Point2D.Double(0.0d, 0.0d);
		Color aColor = new Color(0,0,0);
		Integer aInteger = new Integer(0);
		//値をList格納
		aSpiroModel.addDesignLoci(aPoint2D,aColor,aInteger);
		//実行
		aSpiroModel.spiroUndo();
		//検証
		assertThat(aSpiroModel.getDesignLoci().size(),is(0));

		//size = 4 [data],[null] ,[data],[null]のとき
		//値をList格納
		aSpiroModel.addDesignLoci(aPoint2D,aColor,aInteger);
		aSpiroModel.addDesignLoci();
		aSpiroModel.addDesignLoci(aPoint2D,aColor,aInteger);
		aSpiroModel.addDesignLoci();
		//実行
		aSpiroModel.spiroUndo();
		//検証
		assertThat(aSpiroModel.getDesignLoci().size(),is(1));


	}

	@Test
	public void testSpiroClear() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		aSpiroModel.spiroClear();
		//検証
		assertThat( aSpiroModel.getDesignLoci().size(),is(0));
	}

	@Test
	public void testGetDesignLoci() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		ArrayList<DesignLocus> aLoci = aSpiroModel.getDesignLoci();
		//検証
		assertThat( aLoci.size(),is(0));
	}

	@Test
	public void testSetTheta() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		aSpiroModel.setTheta(100.0d);
		//検証
		assertThat(aSpiroModel.getTheta(),is(100.0d));
	}

	@Test
	public void testGetTheta() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行//検証
		assertThat(aSpiroModel.getTheta(),is(0.0d));
	}

	@Test
	public void testGetSpurGear() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を設定
		aSpiroModel.setSpurCenter(new Point2D.Double(300.0d,300.0d));
		//実行
		SpurGear aSpurGear = aSpiroModel.getSpurGear();
		//検証
		//center
		assertThat(aSpurGear.getCenter(),is(new Point2D.Double(300.0d,300.0d)));
		//
	}

	@Test
	public void testSetSpurCenter() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		aSpiroModel.setSpurCenter(new Point2D.Double(300.0d,300.0d));
		//検証
		SpurGear aSpurGear = aSpiroModel.getSpurGear();
		//center
		assertThat(aSpurGear.getCenter(),is(new Point2D.Double(300.0d,300.0d)));
	}

	@Test
	public void testSetSpurRadius() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		aSpiroModel.setSpurRadius(new Point2D.Double(200.0d,300.0d));
		//検証
		SpurGear aSpurGear = aSpiroModel.getSpurGear();
		//center
		assertThat(aSpurGear.getRadius(),is(100.0d));
	}

	@Test
	public void testGetPinionGear() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を設定
		aSpiroModel.setPinionParameter(new Point2D.Double(400.0d,300.0d));
		//実行
		PinionGear aPinionGear = aSpiroModel.getPinionGear();
		//検証
		//center
		assertThat(aPinionGear.getCenter(),is(new Point2D.Double(400.0d,300.0d)));
		//radius
		assertThat(aPinionGear.getRadius(),is(100.0d));
	}

	@Test
	public void testSetPinionParameter() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行//値を設定
		aSpiroModel.setPinionParameter(new Point2D.Double(400.0d,300.0d));

		PinionGear aPinionGear = aSpiroModel.getPinionGear();
		//検証
		//center
		assertThat(aPinionGear.getCenter(),is(new Point2D.Double(400.0d,300.0d)));
		//radius
		assertThat(aPinionGear.getRadius(),is(100.0d));
	}

	@Test
	public void testGetDistanceBetweenAToB() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		Point2D.Double aPointA = new Point2D.Double(0.0d,0.0d);
		Point2D.Double aPointB = new Point2D.Double(1.0d,1.0d);
		//実行
		Double aDistance = aSpiroModel.getDistanceBetweenAToB(aPointA,aPointB);
		//検証
		assertThat(aDistance,is(Math.pow(2,0.5)));
	}

	@Test
	public void testGetPinionDegrees() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		Double aDegrees = aSpiroModel.getPinionDegrees();
		//検証
		assertThat(aDegrees,is(-0.0d));
	}

	@Test
	public void testIsInscribe() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//実行
		assertThat(aSpiroModel.isInscribe(), is(true));
	}

	@Test
	public void testSetPenParameter() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を設定
		Point2D.Double aPoint2D = new Point2D.Double(500.0d,300.0d);
		//実行
		aSpiroModel.setPenParameter(aPoint2D);
		//検証
		//座標
		assertThat(aSpiroModel.getPinionGear().getPenPosition(),is(new Point2D.Double(500.0d,300.0d)));
	}

	@Test
	public void testCalcPenDegrees() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を設定
		Point2D.Double aPoint2D = new Point2D.Double(500.0d,300.0d);
		//実行
		Double penDegrees = aSpiroModel.calcPenDegrees(aPoint2D);
		//検証
		assertThat(penDegrees,is(0.0d));
	}

	@Test
	public void testReCalcPinionGear() {
		//インスタンスを生成
		SpiroModel aSpiroModel = new SpiroModel();
		//値を設定
		Point2D.Double aPoint2D = new Point2D.Double(500.0d,300.0d);
		//実行
		Double penDegrees = aSpiroModel.calcPenDegrees(aPoint2D);
		//検証
		assertThat(penDegrees,is(0.0d));
	}

}
