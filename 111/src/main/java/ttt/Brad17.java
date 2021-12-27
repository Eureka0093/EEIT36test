package ttt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad17")
public class Brad17 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		String op = req.getParameter("op");
		String result = req.getParameter("result");
		
		String op1=op.equals("1")?"selected":"";
		String op2=op.equals("2")?"selected":"";
		String op3=op.equals("3")?"selected":"";
		String op4=op.equals("4")?"selected":"";
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out= resp.getWriter();
		String html=loadView("veiw1");
		out.print(String.format(html, x,op1,op2,op3,op4,y,result));
		resp.flushBuffer();	
	}
	//C:\Users\a0912\eclipse-workspace\111\src\main\webapp\veiws
	private String loadView(String viewfilename) {
		String loadfile=
				String.format("C:\\Users\\a0912\\eclipse-workspace\\111\\src\\main\\webapp\\veiws\\%s.html", viewfilename);
		File source=new File(loadfile);
		
		StringBuffer sb=new StringBuffer();
		try(FileInputStream fInputStream=new FileInputStream(source);//FileInputStream是一種用於讀取文件中的字節一個字元流類 主要就是從指定的檔案中讀取資料至目的地
				InputStreamReader inputStreamReader=new InputStreamReader(fInputStream,"UTF-8");//InputStreamReader 將位元組流轉換為字元流
				BufferedReader reader=new BufferedReader(inputStreamReader)){//BufferedReader字元輸入流中讀取文字
			String line;
			while((line=reader.readLine())!=null) {
				sb.append(line);
			}
			
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	
		return sb.toString();
	}
}
