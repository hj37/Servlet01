package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹브라우저 주소창에 입력할 요청주소 : http://localhost:8080/pro05/third
//@WebServlet 어노테이션 기호를 이용해 
//클라이언트가 요청할 가짜주소(서블릿연결주소, 서블릿매핑주소)를 설정하여 쉽게 
//서블릿을 요청할 수 있다.
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
 
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("ThirdServlet init 메소드 호출됨");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("ThirdServlet doGet메소드 호출됨");
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("ThirdServlet destroy메소드 호출됨");
	}

	
	
}
