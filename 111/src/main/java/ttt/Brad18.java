package ttt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Brad18")
@MultipartConfig(
		location = "C:\\Users\\a0912\\eclipse-workspace\\111\\src\\main\\webapp\\Upload"
		)
public class Brad18 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String account=req.getParameter("account");
		System.out.println(account);
		
		Collection<Part> parts = req.getParts();
		int i=0;
		for (Part part : parts) {
			String type = part.getContentType();
			String name = part.getName();
			String sname = part.getSubmittedFileName();
			
			if(name.equals("upload")) {
				if(sname.length()==0) continue;
				
				i++;
				part.write(creatnewfilename(i));
			}
			System.out.println(type + ":" + name + ":" + sname);
		}
	}
	private String creatnewfilename(int i) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
		String filename="Mark"+simpleDateFormat.format(new Date())+"-"+i+".jpg";
		return filename;
		
	}
	
	
	
	
}
