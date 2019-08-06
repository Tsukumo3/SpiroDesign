package spiroDesign;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
軌跡 座標,色,ペンの大きさを格納する

*/
public class DesignLocus {

	/**
	 * ペンの座標を束縛する
	 */
	private Point2D.Double plot;//座標

	/**
	 * ペンの色を束縛する
	 */
	private Color penColor;//色

	/**
	 * ペン先の太さを束縛する
	 */
	private Integer penNib;//ペン先の太さ

	/**
	 * 引数を受け取り、それらをインスタンスに設定する
	 *
	 * @param aPoint2D　ペンの座標
	 * @param aColor ペンの色
	 * @param aNib ペンの太さ
	 */
	public DesignLocus(Point2D.Double aPoint2D, Color aColor, Integer aNib){
		this.plot = aPoint2D;
		this.penColor = aColor;
		this.penNib = aNib;
	}

	/**
	 * ペンの座標を設定する
	 * @param aPoint2D ペンの座標
	 */
	public void setPlot(Point2D.Double aPoint2D){
		this.plot = aPoint2D;
	}

	/**
	 * ペンの座標を取得する
	 * @return ペンの座標
	 */
	public Point2D.Double getPlot(){
		return this.plot;
	}

	/**
	 * ペンの色を設定する
	 * @param aColor ペンの色
	 */
	public void setPenColor(Color aColor){
		this.penColor = aColor;
	}

	/**
	 * ペンの色を取得する
	 * @return ペンの色
	 */
	public Color getPenColor(){
		return this.penColor;
	}

	/**
	 * ペンの太さを設定する
	 * @param aNib ペンの太さ
	 */
	public void setPenNib(Integer aNib){
		this.penNib = aNib;
	}

	/**
	 * ペンの太さを応答する
	 * @return ペンの太さ
	 */
	public Integer getPenNib(){
		return this.penNib;
	}
}
