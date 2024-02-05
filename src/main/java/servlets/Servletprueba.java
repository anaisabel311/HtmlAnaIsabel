package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletprueba
 */
public class Servletprueba extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servletprueba() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String numero = request.getParameter("numero");
		int num = Integer.parseInt(request.getParameter(numero));
		String sessionId = request.getSession().getId();
		//int num = Integer.parseInt(numero);
		if (num%2==0) {
		//System.out.println("Has escrito el numero "+ num + " con el id "+sessionId + " éste ES par"); este system.out pinta en consola.
		response.getWriter().append("<H1>ESTE NUMERO "+num+" ES PAR</h1"); // devuelve un html.
		}else {
			System.out.println("Has escrito el numero "+ num + " con el id "+sessionId + " éste NO es par");
				response.getWriter().append("<H1>ESTE NUMERO "+num+" NO ES PAR</h1");
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
