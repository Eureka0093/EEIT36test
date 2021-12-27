package ttt;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AttributeSet.ColorAttribute;


@WebServlet("/Brad20")
public class Brad20 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
									
		response.setContentType("image/jpg");//跟別人說我輸出的是影像
		
		String source="C:\\Users\\a0912\\eclipse-workspace\\111\\src\\main\\webapp\\Upload\\IMG_20171022_0002.jpg";
		BufferedImage img =ImageIO.read(new File(source));//記憶體配置一塊空間出來 將檔案讀進來
		
		Font font = new Font(null, Font.BOLD, 100);
		
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(30));
		Font font2 = font.deriveFont(tran);
		
		Graphics2D g2d= img.createGraphics();//在檔案上畫字
		g2d.setColor(Color.white);
		g2d.setFont(font2);
		g2d.drawString("來自深淵漢化", 150 , 150);		
		
		OutputStream outputStream=response.getOutputStream();//輸出管道
		
		ImageIO.write(img, "jpg",outputStream);//(從記憶體拿出來,型態,哪個輸出串流)
		outputStream.flush();
		outputStream.close();
		
		
		String target = "C:\\Users\\a0912\\eclipse-workspace\\111\\src\\main\\webapp\\Upload\\Mark.jpg";
		FileOutputStream fout = new FileOutputStream(target);
		ImageIO.write(img, "jpg", fout);
		fout.flush();
		fout.close();
		
	}

}
