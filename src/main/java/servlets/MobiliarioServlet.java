package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MobiliarioServlet
 */
public class MobiliarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Mobiliario> muebles = new ArrayList<Mobiliario>();
	private String subtitulo;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobiliarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println ("Está dentro del doGet");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println ("Está dentro del doPost");
		//System.out.println ("valor seleccionado " + request.getParameter("TipoMobiliario"));
		String tipo = request.getParameter("TipoMobiliario");
			
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		String estilo = request.getParameter("estiloMesa");
		String color = request.getParameter("colorSofa");
		String potencia = request.getParameter("potenciaLampara");
		
		if (tipo.equalsIgnoreCase("mesa")) {
			Mobiliario mesa = new Mesa (nombre, precio, estilo);
			muebles.add(mesa);
		}else {
			if (tipo.equalsIgnoreCase("sofa")) {
				Mobiliario sofa = new Sofa (nombre, precio, color);
				muebles.add(sofa);
			} else {				
				Mobiliario lampara = new Lampara (nombre, precio, potencia);
				muebles.add(lampara);
			}
		}
		
		// lo guardamos en un mapa. Como hay distintos tipos de objetos, invocamos a la clase object.
		//y la clave será un String.
		Map<String,Object> datos = new HashMap<String,Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoMuebles", muebles);
	
		System.out.println(muebles.size());
		//request.setAttribute("titulo", subtitulo);
		//request.setAttribute("listadoMuebles", muebles);
		
		//mandamos el mapa desde el servlet
		request.setAttribute("mapa", datos);
		RequestDispatcher rd=request.getRequestDispatcher("jsp/TablaMuebles.jsp");
		
		rd.forward(request, response);	
		
		
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		subtitulo=config.getInitParameter(subtitulo);
		System.out.println("Entrando init con subtitulo "+ subtitulo );
		super.init(config);
	}

}
