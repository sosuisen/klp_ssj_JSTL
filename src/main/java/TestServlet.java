
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberBean;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("name", "kcg");
		request.setAttribute("address", "kyoto");
		HttpSession session = request.getSession();
		session.setAttribute("address", "rakuhoku");

		request.setAttribute("num", 5);

		request.setAttribute("member", new MemberBean("鴨川桂"));
		
		/*
		var list = new ArrayList<String>();
		list.add("駅前校");
		list.add("洛北校");
		list.add("鴨川校");
		request.setAttribute("list", list);
	*/

		request.getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
		//request.getRequestDispatcher("/WEB-INF/test2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
