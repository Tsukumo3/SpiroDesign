package spiroDesign;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * ビュー 描画処理を専門に行う
 *
 */
@SuppressWarnings("serial")
public class SpiroView extends JPanel{
	/**
	 * 依存物:SpiroModelのインスタンスを束縛する
	 */
	protected SpiroModel model;

	/**
	 * SpiroControllerのインスタンスを束縛する
	 */
	protected SpiroController controller;

	/**
	 * 絵画を画像として出力するために
	 * BufferedImageのインスタンスを束縛する
	 */
	private BufferedImage image;

	/**
	 * 設定したBufferedImageのインスタンスに描画するために、
	 * コンポーネントを描画して表示するGraphicsとは別のGraphicsのインスタンスを束縛する
	 */
	private Graphics graphics;


	/**
	 * 引数のaModelをインスタンスに設定し、
	 * 初期化して応答する
	 * @param aModel 設定するSpiroModel
	 */
	public SpiroView(SpiroModel aModel){
		super();
		model = aModel;
		model.addDependent(this);
		controller = new SpiroController();
		controller.setModel(model);
		controller.setView(this);

		image = new BufferedImage(800,600,BufferedImage.TYPE_INT_BGR);
		graphics =  image.createGraphics();
		//offset = new Point(0, 0);
		return;
	}

	/**
	 * 引数のaModel,aControllerをそれぞれインスタンスに設定し、
	 * 初期化して応答する
	 * @param aModel 設定するSpiroModel
	 * @param aController 設定するSpiroController
	 */
	public SpiroView(SpiroModel aModel, SpiroController aController)
	{
		super();
		model = aModel;
		model.addDependent(this);
		controller = aController;
		controller.setModel(model);
		controller.setView(this);

		image = new BufferedImage(800,600,BufferedImage.TYPE_INT_BGR);
		graphics =  image.createGraphics();
		//offset = new Point(0, 0);
		return;
	}

	/**
	 * repaint()が呼ばれた時にこのメソッドが応答する
	 * 描画の処理を行う
	 * @param aGraphics コンポーネントを描画するためGraphics
	 */
	public void paintComponent(Graphics aGraphics)
	{
		int width = this.getWidth();
		int height = this.getHeight();

		super.paintComponent(aGraphics);

		graphics.setColor(Color.white);
		aGraphics.setColor(Color.white);

		graphics.fillRect(0, 0, width, height);
		aGraphics.fillRect(0, 0, width, height);

		this.displayDesignLoci(aGraphics);
		this.displayDesignLoci(graphics);

		if (model == null) { return; }

		aGraphics.setColor(Color.white);
		aGraphics.fillRect(0, 0, width, height);
		if (model == null) { return; }

		//SpurGearの描画
		this.displaySpurGear(aGraphics);

		//piniongearの描画
		this.displayPinionGear(aGraphics);

		//過去絵の描画
		this.displayDesignLoci(aGraphics);

		//モデルに画像出力用のBufferedImageを設定する
		model.setImage(image);
	}

	/**
	 * スパーギアを描画する
	 * @param aGraphics コンポーネントを描画するためGraphics
	 */
	public  void displaySpurGear(Graphics aGraphics){

		Point2D.Double aPoint2D = model.getSpurGear().getCenter();
		double spurRadius = this.model.getSpurGear().getRadius();

		//spurGearの描画位置
		aGraphics.setColor(Color.red);
		Ellipse2D aEllipse = new Ellipse2D.Double( aPoint2D.getX()-spurRadius,aPoint2D.getY()-spurRadius, spurRadius*2.0, spurRadius*2.0 );
		((Graphics2D) aGraphics).draw(aEllipse);

		//SpurGearの中心
		aGraphics.setColor(Color.ORANGE);
		( (Graphics2D) aGraphics ).draw(this.model.getSpurGear().centerRectangle());

		//SpurGearの上下左右
		( (Graphics2D) aGraphics ).draw(this.model.getSpurGear().rightRectangle());
		( (Graphics2D) aGraphics ).draw(this.model.getSpurGear().topRectangle());
		( (Graphics2D) aGraphics ).draw(this.model.getSpurGear().leftRectangle());
		( (Graphics2D) aGraphics ).draw(this.model.getSpurGear().bottomRectangle());

		return;

	/**
	 * ピニオンギアを描画する
	 * @param aGraphics コンポーネントを描画するためGraphics
	 */
	}
	public  void displayPinionGear(Graphics aGraphics){

		Point2D.Double aPinionGearCenter = model.getPinionGear().getCenter();
		double PinionRadius = this.model.getPinionGear().getRadius();

		//PinionGearの描画位置
		aGraphics.setColor(Color.BLUE);
		Ellipse2D aEllipse = new Ellipse2D.Double( aPinionGearCenter.getX()-PinionRadius,
													aPinionGearCenter.getY()-PinionRadius,
													PinionRadius*2.0, PinionRadius*2.0 );
		((Graphics2D) aGraphics).draw(aEllipse);

		//PinionGearの中心
		aGraphics.setColor(Color.BLUE);
		( (Graphics2D) aGraphics ).draw(this.model.getPinionGear().centerRectangle());

		//PinionGearの上下左右
		aGraphics.setColor(Color.BLUE);
		( (Graphics2D) aGraphics ).draw(this.model.getPinionGear().rightRectangle());
		( (Graphics2D) aGraphics ).draw(this.model.getPinionGear().topRectangle());
		( (Graphics2D) aGraphics ).draw(this.model.getPinionGear().leftRectangle());
		( (Graphics2D) aGraphics ).draw(this.model.getPinionGear().bottomRectangle());

		//PinionGearの十字の線drawLine   draw(new Rectangle(x, y, w, h));
		//( (Graphics2D) aGraphics ).draw( new Line );
		((Graphics2D) aGraphics).drawLine((int)this.model.getPinionGear().top().getX(),
											(int)this.model.getPinionGear().top().getY(),
											(int)this.model.getPinionGear().bottom().getX(),
											(int)this.model.getPinionGear().bottom().getY());
		((Graphics2D) aGraphics).drawLine((int)this.model.getPinionGear().right().getX(),
											(int)this.model.getPinionGear().right().getY(),
											(int)this.model.getPinionGear().left().getX(),
											(int)this.model.getPinionGear().left().getY());

		//PinionGearとSpurGEarの線
		aGraphics.setColor(Color.GREEN);
		((Graphics2D) aGraphics).drawLine((int)this.model.getPinionGear().getCenter().getX(),
											(int)this.model.getPinionGear().getCenter().getY(),
											(int)this.model.getSpurGear().getCenter().getX(),
											(int)this.model.getSpurGear().getCenter().getY());


		//Penの中心
		Point2D.Double penCenter = model.getPinionGear().getPenPosition();
		aGraphics.setColor( model.getPinionGear().getPenColor());
		Ellipse2D aEllipsePen = new Ellipse2D.Double( penCenter.getX() - model.getPinionGear().getPenNib(),
														penCenter.getY() - model.getPinionGear().getPenNib(),
														8+model.getPinionGear().getPenNib(),
														8+model.getPinionGear().getPenNib() );
		((Graphics2D) aGraphics).fill(aEllipsePen);
		aGraphics.setColor(Color.GREEN);
		((Graphics2D) aGraphics).draw(aEllipsePen);


	}

	/**
	 * 軌跡を描画する
	 * @param aGraphics コンポーネントを描画するためGraphics
	 */
	public  void displayDesignLoci(Graphics aGraphics){

		ArrayList<DesignLocus> loci =  this.model.getDesignLoci();

		for(int index = 0; index < loci.size(); index++) {
			DesignLocus locus = loci.get(index);
			if(locus != null){
				aGraphics.setColor( locus.getPenColor() );
				Ellipse2D aEllipse = new Ellipse2D.Double( locus.getPlot().getX() - locus.getPenNib(),
															locus.getPlot().getY() - locus.getPenNib(),
															locus.getPenNib(),
															locus.getPenNib());

				((Graphics2D) aGraphics).fill(aEllipse);
			}
		}
	}

	/**
	 * repaint()を呼び、描画を依頼する
	 */
	public void update()
	{
		this.repaint(0, 0, this.getWidth(), this.getHeight());
		return;
	}

}
