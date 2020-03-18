package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


class B{
	void b() {//선언부 	
		System.out.println("b");//구현부 
	}
}


class A extends B{
	//메소드 오버라이딩이란 상속받은 b라는 메소드를 그대로 사용하지 않고 구현부만 개발자가 구현해서 사용 
	void b() {
		//구현부를 재구현(메소드 오버라이딩) 
		System.out.println("재구현한 b메소드");
	}


}


//사용자가 직접 만든 서블릿 클래스이다
//사용자가 직접 만든 서블릿 클래스는 무조건 HttpServlet클래스를 상속 받는 형태로 만들어야 함.
//이유는 HttpServlet 클래스의 메소드들을 재구현(오버라이딩)해서 사용 해야 하기 때문이다.
public class FirstServlet extends HttpServlet{

	//실제로는 GenericServlet에 있는거 
	//HttpServlet 클래스에 존재하는 init메소드를 오버라이딩(재구현)함.
	@Override
	public void init() throws ServletException {	//콜백메서드 
		// TODO Auto-generated method stub
		System.out.println();	//메소드 구현부 재구현 (메소드 오버라이딩) 
	}

	//클라이언트가 FirstServlet 요청 시 요청방식 중에서 ...GET방식으로 요청하면 호출되는 메소드이다.(톰캣메소드) 
	@Override	//Override라는 이름의 어노테이션 기호?
		//현재 아래의 doGet이라는 메소드는 오버라이딩한 메소드이라라고 표시하는 기호이다.
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet메소드 호출당함.");
	}

	@Override
	public void destroy() {//서블릿이 기능을 수행하고 톰캣 메모리에서 소멸될때 호출되는 콜백메소드
							//서블릿의 마무리 작업을 주로 수행함.
		// TODO Auto-generated method stub
		System.out.println("destroy메소드 호출당함.");
	}
	
	
	
	//메소드 오버라이딩이란? 조상 인터페이스 또는 조상클래스에 있는 메소드를 상속받아 그대로 사용하지 않고 
	//			메소드 이름은 동일하게 하되... 메소드 기능의 내용만 재구현 한다는 의미.
	//메소드 오버라이딩 단축키 
	// -> alt + shift + s + v키 
	
}//FirstServlet클래스 닫는 부분
