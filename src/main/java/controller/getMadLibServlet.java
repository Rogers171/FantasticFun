package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String occupation = request.getParameter("occupation");
		String verb = request.getParameter("verb");
		String creature = request.getParameter("creature");
		String adjective = request.getParameter("adjective");
		String number = request.getParameter("number");
		String game = request.getParameter("game");
		
		MadLib madLib = new MadLib(name, occupation, verb, creature, adjective, number, game);
		
		request.setAttribute("madLibStory", madLib);
		
		getServletContext().getRequestDispatcher("/madLibResult.jsp").forward(request, response);
	}

}
