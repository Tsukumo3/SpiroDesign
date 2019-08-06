package spiroDesign;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * メイン ウィンドウを開いて、モデルを呼ぶ
 */
public class SpiroDesign {

	public static void main(String[] arguments) throws InterruptedException
	{
		// ウィンドウのサイズを決め、モデルを作る。
		Dimension aDimension = new Dimension(800, 600);
		SpiroModel aModel = new SpiroModel();

		Integer width = aDimension.width;
		Integer height = aDimension.height;
		Integer x = (width / 2) - (width / 2);
		Integer y = (height / 2) - (height / 2);
		Point displayPoint = new Point(x, y);

		// 上記のモデルのビューとコンピュローラのペアを作り、ウィンドウに乗せる。
		SpiroView aView = new SpiroView(aModel);
		JFrame aWindow = new JFrame("スピロデザイン");
		aWindow.getContentPane().add(aView);

		// 高さはタイトルバーの高さを考慮してウィンドウの大きさを決定する。
		aWindow.addNotify();
		Integer titleBarHeight = aWindow.getInsets().top;
		width = aDimension.width;
		height = aDimension.height + titleBarHeight;
		Dimension windowSize = new Dimension(width, height);
		aWindow.setSize(windowSize.width, windowSize.height);

		// ウィンドウに各種の設定を行って出現させる。
		aWindow.setMinimumSize(new Dimension(400, 300 + titleBarHeight));
		aWindow.setResizable(true);
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = displayPoint.x;
		y = displayPoint.y;
		aWindow.setLocation(x, y);
		aWindow.setVisible(true);
		aWindow.toFront();
		//モデルを動かす

		Thread aThread = new Thread(aModel);


		aThread.run();

	}
}
