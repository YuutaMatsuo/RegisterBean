                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegisterBean;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getリクエストを受けたらトップページを表示
		response.sendRedirect("/register.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//入力情報の取得
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String[] langs = request.getParameterValues("lang");
		
		// JavaBeansインスタンスの生成
		RegisterBean rb = new RegisterBean();
		rb.setName(name); //※コンストラクタでフィールドを初期化する方がおすすめ！
		rb.setAge(age);
		rb.setLangs(langs);
		
		// JavaBeansインスタンスをリクエストスコープに格納
		request.setAttribute("rb", rb); //第1引数「キー」、第2引数「インスタンス」
		// ※「インスタンス」は「Object型」でリクエストスコープに格納される
		
		// register.jspへフォワード
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
		rd.forward(request, response);
	}

}
