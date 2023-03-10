package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PotQuot;

/**
 * Servlet implementation class getPotableServlet
 */
@WebServlet("/getPotableServlet")
public class getPotableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPotableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String potionPick = request.getParameter("potionPick");
		
		PotQuot potQuot = new PotQuot(potionPick);
		
		request.setAttribute("quotable", potQuot);
		
		getServletContext().getRequestDispatcher("/quoteResult.jsp").forward(request,  response);
	}

}
