package spiroDesign;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * ファイルの入出力関連の処理を専門に行う
 */
public class SpiroIO {

	/**
	 * セーブデータディレクトリがなければ生成する
	 * その後、designLociのデータを拡張子.datのファイルに保存し、datファイルを出力する
	 * @param designLoci ペンの軌跡
	 */

	public static void makeSaveData(ArrayList<DesignLocus> designLoci){
		try {
			String currentDirectory = System.getProperty("user.dir");
			String saveDirectory = currentDirectory + File.separator + "SaveOfSpiroDesign";
			File aDirectory = new File(saveDirectory);
			if (!aDirectory.exists()) { aDirectory.mkdir(); }
			String fileString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + ".dat";

			fileString = saveDirectory + File.separator + fileString;
			System.out.printf("セーブデータファイル「%s」に保存しました。%n", fileString);
			JOptionPane.showMessageDialog(null, "データファイル「"+ fileString +"」に保存しました","絵画を保存",JOptionPane.PLAIN_MESSAGE);
			File file = new File(fileString);



			//Fileクラスに書き込むファイルを指定する
			FileWriter fileWriter = new FileWriter(file);

			PrintWriter pw = new PrintWriter(new BufferedWriter(fileWriter));
			//List中のnull値をなくす
			designLoci.removeAll(Collections.singleton(null));

			for(int i = 0; i < designLoci.size();i++){
				pw.print(designLoci.get(i).getPlot().getX());
				pw.print(",");
				pw.print(designLoci.get(i).getPlot().getY());
				pw.print(",");
				pw.print(designLoci.get(i).getPenColor().getRed());
				pw.print(",");
				pw.print(designLoci.get(i).getPenColor().getGreen());
				pw.print(",");
				pw.print(designLoci.get(i).getPenColor().getBlue());
				pw.print(",");
				pw.println(designLoci.get(i).getPenNib());
			}
			pw.flush();
			pw.close();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ファイル選択画面から、datファイルを指定すると、そのdatファイルから軌跡を取得し、
	 * その軌跡のデータをDesignLociに送る
	 * @return　loci ペンの軌跡
	 * @throws FileNotFoundException ファイルが見つからない時に例外を投げる
	 */
	public static ArrayList<DesignLocus> loadSaveData() throws FileNotFoundException{


		ArrayList<DesignLocus> loci = new ArrayList<>(); //出力ファイル

		JFileChooser chooser = new JFileChooser();
		//saveDataCurrentDirectryを保取得
		String currentDirectory = System.getProperty("user.dir");
		String saveDirectory = currentDirectory + File.separator + "SaveOfSpiroDesign";

		//デフォルトの選択ファイルを指定
        chooser.setSelectedFile(new File(saveDirectory));


        FileFilter filter = new FileNameExtensionFilter("dataファイル", "dat");
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);

        chooser.setDialogTitle("ファイルを読み込む");

      //ダイアログを表示
        int selected = chooser.showOpenDialog(null);

        if(selected == JFileChooser.APPROVE_OPTION){
        	File file = chooser.getSelectedFile();

        	//読み込みファイルのインスタンス生成
        	//ファイル名を指定する
        	FileInputStream fi = new FileInputStream(file);
        	InputStreamReader is = new InputStreamReader(fi);
        	BufferedReader br = new BufferedReader(is);

        	try{


        		//読み込み行
        		String line;


        		//1行ずつ読み込みを行う
        		while ((line = br.readLine()) != null) {

        			//カンマで分割した内容を配列に格納する
        			String[] data = line.split(",");

        			//配列の中身を順位表示する。列数(=列名を格納した配列の要素数)分繰り返す
        			Point2D.Double aPoint = new Point2D.Double( Double.parseDouble(data[0]),Double.parseDouble(data[1]));

        			int cr = Integer.parseInt(data[2]);
        			int cg = Integer.parseInt(data[3]);
        			int cb = Integer.parseInt(data[4]);

        			Color aColor = new Color(cr,cg,cb);

        			int aPenNib = Integer.parseInt(data[5]);

        			loci.add(new DesignLocus(aPoint, aColor,aPenNib));

        		}

        	}
        	catch (Exception e) {
        		e.printStackTrace();
        	}
        	finally {
        		try {
        			br.close();
        		} catch (Exception e) {
        			e.printStackTrace();
        		}
        	}
        }
		return loci;
	}

	/**
	 * ファイル名から拡張子を返す。
	 * @param fileName ファイル名
	 * @return ファイルの拡張子
	 */
	public static String getSuffix(String fileName) {
	    if (fileName == null)
	        return null;
	    int point = fileName.lastIndexOf(".");
	    if (point != -1) {
	        return fileName.substring(point + 1);
	    }
	    return fileName;
	}

	/**
	 * 画像保存フォルダがなければ生成する。その後、引数の画像データをjpg形式の画像として出力する
	 * そしてその画像をプレビューで開く
	 * @param img 絵画の画像データ
	 */
	public static void saveImage(BufferedImage img) {
		BufferedImage anImage = img;

		// メモリ内に読み込んだ画像を保存するローカルなファイル名（fileString）を求める。
		String currentDirectory = System.getProperty("user.dir");
		String imageDirectory = currentDirectory + File.separator + ".." + File.separator + ".." + File.separator + ".."
														+ File.separator + ".." + File.separator + "ImagesOfSpiroDesign";
		File aDirectory = new File(imageDirectory);
		if (!aDirectory.exists()) { aDirectory.mkdir(); }
		String fileString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + ".jpg";
		fileString = imageDirectory + File.separator + fileString;
		System.out.printf("画像ファイル「%s」に保存しました。%n", fileString);

		// メモリ内に読み込んだ画像をローカルディスクのファイルに書き込む。
		File aFile = new File(fileString);
		String kindString = fileString.substring(fileString.lastIndexOf(".") + 1); // 画像ファイルの拡張子を求めます。
		try { ImageIO.write(anImage, kindString, aFile); }
		catch (IOException anException) { anException.printStackTrace(); }
		finally {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try
		{
			ProcessBuilder aProcessBuilder = new ProcessBuilder("open", "-a", "PreView", fileString);
			aProcessBuilder.start();
		}
		catch (Exception anException) { anException.printStackTrace(); }
	}
}
