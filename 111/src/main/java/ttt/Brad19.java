package ttt;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AttributeSet.ColorAttribute;


@WebServlet("/Brad19")
public class Brad19 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String rateString=  request.getParameter("rate");
		
		double rate=0;
		try {
			rate= Double.parseDouble(rateString);

		} catch (Exception e) {
			
		}		
						
		
		response.setContentType("image/jpeg");//跟別人說我輸出的是影像
		BufferedImage img =new BufferedImage(400,20,BufferedImage.TYPE_INT_RGB);//作畫布(記憶體配置一塊空間出來)
		
		Graphics2D g2d= img.createGraphics();
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(0,0,400,20);//開始畫圖(記憶體)
		
		g2d.setColor(Color.red);
		g2d.fillRect(0,0,(int)(400*(rate/100)),20);//開始畫圖(記憶體)
		
		OutputStream outputStream=response.getOutputStream();//輸出管道
		
		ImageIO.write(img, "jpeg",outputStream);//(從記憶體拿出來,型態,哪個輸出串流)
		outputStream.flush();
		outputStream.close();
	}

}
