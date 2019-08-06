package spiroDesign;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * スパーギア、ピニオンギアの親として、中心座標、半径などについて処理する
 *
 */
public class SpiroGear{

	/**
	 * 	中心座標を束縛する
	 */
	Point2D.Double center;

	/**
	 * 半径を束縛する
	 */
	private Double radius;

	/**
	 * インスタンスを初期化する
	 */
	public SpiroGear() {
		this.center = new Point2D.Double(300,300);
		this.radius = 200.0;
	}
	/**
	 * 引数から中心座標をPoint2D型にした後インスタンスを設定し、半径のインスタンスを初期化する
	 * @param x 中心のx座標
	 * @param y	中心のy座標
	 */
	public SpiroGear(Double x, Double y) {
		this.center = new Point2D.Double(x,y);
		this.radius = 200.0;
	}

	/**
	 * 引数から中心座標をPoint2D型にし、中心座標、半径のインスタンスを設定する
	 * @param x 中心のx座標
	 * @param y	中心のy座標
	 * @param r 半径
	 */
	public SpiroGear(Double x, Double y, Double r) {
		this.center = new Point2D.Double(x,y);
		this.radius = r;
	}

	/**
	 * 引数から中心座標、半径のインスタンスを設定する
	 * @param p 中心座標
	 * @param r 半径
	 */
	public SpiroGear(Point2D.Double p, Double r) {
		this.center = p;
		this.radius = r;
	}

	/**
	 * 引数から半径をインスタンスに設定し、中心座標を初期化する
	 * @param r　半径
	 */
	public SpiroGear(Double r) {
		this.center = new Point2D.Double(0d,0d);
		this.radius = r;
	}

	/**
	 * 中心座標をインスタンスに設定する
	 * @param aPoint2D 中心座標
	 */
	public void setCenter(Point2D.Double aPoint2D) {
		this.center = aPoint2D;
		return;
	}

	/**
	 * インスタンスから中心座標を応答する
	 * @return 中心座標
	 */
	public Point2D.Double getCenter() { //以下、計算で四方の座標を求める
		return this.center;
	}

	/**
	 * 中心座標と半径から、円の左側に描画する四角の座標を求めて応答する
	 * @return 左側四角の中心座標
	 */
	public Point2D.Double left() {
		double aX = this.getCenter().getX() - this.getRadius();
		double aY = this.getCenter().getY();
		return new Point2D.Double(aX,aY);
	}

	/**
	 * 中心座標と半径から、円の右側に描画する四角の座標を求めて応答する
	 * @return 右側四角の中心座標
	 */
	public Point2D.Double right() {
		double aX = this.getCenter().getX() + this.getRadius();
		double aY = this.getCenter().getY();
		return new Point2D.Double(aX,aY);
	}

	/**
	 * 中心座標と半径から、円の上側に描画する四角の座標を求めて応答する
	 * @return 上側四角の中心座標
	 */
	public Point2D.Double top() {//
		double aX = this.getCenter().getX();
		double aY = this.getCenter().getY() + this.getRadius();
		return new Point2D.Double(aX,aY);
	}

	/**
	 * 中心座標と半径から、円の下側に描画する四角の座標を求めて応答する
	 * @return 下側四角の中心座標
	 */
	public Point2D.Double bottom() {//おそらく円の下部分の座標の応答するためのメソッド
		double aX = this.getCenter().getX();
		double aY = this.getCenter().getY() - this.getRadius();
		return new Point2D.Double(aX,aY);
	}

	/**
	 * 真ん中四角の中心座標と拡張する長さから、中心の四角を応答する
	 * @return 中心の四角
	 */
	public Rectangle2D.Double centerRectangle() {//Gearの中心部の四角の描画 これは操作するためのPoint2D.Doubleerになる
		return this.toRectangle2D(this.getCenter(),10.0);
	}

	/**
	 * 左四角の中心座標と拡張する長さから、左の四角を応答する
	 * @return 左の四角
	 */
	public Rectangle2D.Double leftRectangle(){//以下略
		return this.toRectangle2D(this.left(),10.0);
	}

	/**
	 * 右四角の中心座標と拡張する長さから、中心の四角を応答する
	 * @return 右の四角
	 */
	public Rectangle2D.Double rightRectangle() { //
		return this.toRectangle2D(this.right(),10.0);
	}

	/**
	 * 上四角の中心座標と拡張する長さから、中心の四角を応答する
	 * @return 上の四角
	 */
	public Rectangle2D.Double topRectangle() {//
		return this.toRectangle2D(this.top(),10.0);
	}

	/**
	 * 下四角の中心座標と拡張する長さから、下四角を応答する
	 * @return 下の四角
	 */
	public Rectangle2D.Double bottomRectangle() {//Gearの下部の四角の描画 これは操作するためのPoint2D.Doubleerになる
		return this.toRectangle2D(this.bottom(),10.0);
	}

	/**
	 * インスタンスの半径を応答する
	 * @return 半径
	 */
	public Double getRadius() {
		return this.radius;
	}

	/**
	 * インスタンスの半径を設定する
	 * @param r 半径
	 */
	public void setRadius(Double r) {//getRadius
		this.radius = r;
	}

	/**
	 * 中心座標と拡張する長さを受け取り、これらからRectangleを応答する
	 * @param aPoint2D 中心座標
	 * @param expandedAmount 拡張する長さ
	 * @return 四角
	 */
	public Rectangle2D.Double toRectangle2D(Point2D.Double aPoint2D, Double expandedAmount) {
		Rectangle2D.Double aRectangle2D = new Rectangle2D.Double(aPoint2D.getX()-expandedAmount/2,
																  aPoint2D.getY()-expandedAmount/2,
																   expandedAmount,
																	expandedAmount);

	return aRectangle2D;
	}



}