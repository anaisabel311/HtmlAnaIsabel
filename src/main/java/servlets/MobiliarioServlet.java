package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import daos.MobiliarioDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class MobiliarioServlet
 */
public class MobiliarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//private List<Mobiliario> muebles = new ArrayList<Mobiliario>();
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
		
		
		
// CREO UN OBJETO TIPO DAO
		MobiliarioDAO mdao = new MobiliarioDAO();
		Mobiliario mueble = null; // creo una variable tipo Mobiliario para guardar el mueble que corresponda.
		if (tipo.equalsIgnoreCase("mesa")) {
			mueble = new Mesa (nombre, precio, estilo);
			//muebles.add(mesa);
		}else {
			if (tipo.equalsIgnoreCase("sofa")) {
				mueble = new Sofa (nombre, precio, color);
				//muebles.add(sofa);
			} else {				
				mueble = new Lampara (nombre, precio, potencia);
				//muebles.add(lampara);
			}
		}
// hacemos la inserccón en la bbdd
		
		mdao.insert(mueble);
		//aca listamos todos los muebles.
		List<Mobiliario> muebles = mdao.get();
		 
		// lo guardamos en un mapa. Como hay distintos tipos de objetos, invocamos a la clase object.
		//y la clave será un String.
		
		Map<String,Object> datos = new HashMap<String,Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoMuebles", muebles);
	
		//System.out.println(datos.size());
		//request.setAttribute("titulo", subtitulo);
		//request.setAttribute("listadoMuebles", muebles);
		
		//mandamos el mapa desde el servlet
		request.setAttribute("mapa", datos);
		
		RequestDispatcher rd=request.getRequestDispatcher("jsp/TablaMuebles.jsp");
		rd.forward(request, response);	
		
		
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		subtitulo=config.getInitParameter("subtitle");
		System.out.println("Entrando init con subtitulo "+ subtitulo );
		super.init(config);
	}

}
