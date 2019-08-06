package spiroDesign;

/**
 * スパーギア スパーギアの処理を専門に行う
 */
public class SpurGear extends SpiroGear{

	/**
	 *	中心座標、半径を親に伝える
	 */
	SpurGear(){

		super(300.0,300.0,200.0);


	}
	/**
	 * 引数の中心座標、半径を親に伝える
	 * @param x 中心x座標
	 * @param y 中心y座標
	 * @param r 半径
	 */
	SpurGear(Double x,Double y,Double r){

		super(x,y,r);


	}

}
