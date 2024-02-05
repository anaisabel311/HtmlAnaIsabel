package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AlumnoServlet
 */
public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<FormularioAlum> alumnos = new ArrayList<FormularioAlum>();
	
    /**
     * Default constructor. 
     */
    public AlumnoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Bienvenido").append(request.getContextPath());
		 */ 
		System.out.println ("Está dentro del doGet");
		request.getRequestDispatcher("servlet/AlumnoFormulario.jsp").forward(request, response);
		  		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession();
		System.out.println(session.getId());
		
		// recoge la id de cada usuario.
		
		
		System.out.println ("Está dentro del doPost");
	 // guardar los values en cada variable pojo de la clase alumno.
		String nombre = request.getParameter("nombre");
	//	System.out.println (nombre); Los systems se ven en consola
		String apellidos = request.getParameter("apellidos");
	//	System.out.println (apellidos);Los systems se ven en consola
		String sexo = request.getParameter("sexo");
	//	System.out.println (sexo);Los systems se ven en consola
		String lista = request.getParameter("lista_de_seleccion");
	//	System.out.println (lista);Los systems se ven en consola
		String descripcion = request.getParameter("descripcion_alumno");
	//	System.out.println (descripcion);Los systems se ven en consola
		
		FormularioAlum alumno = new FormularioAlum(nombre,apellidos,sexo,lista,descripcion);
		alumnos.add(alumno);
		
		System.out.println(alumnos.size());
		request.setAttribute("listadoAlumnos", alumnos);
		RequestDispatcher rd=request.getRequestDispatcher("jsp/TablaAlumnos.jsp");
		rd.forward(request, response);
		
		
		
		
		/*
		 * response.getWriter().append("Bienvenido " +
		 * alumno.getNomAlumno()+""+alumno.getApeAlumno());
		 * response.setContentType("text/html");
		 */
		/*
		 * for (FormularioAlum formularioAlum : alumnos) {
		 * response.getWriter().append("<p>" + formularioAlum.getNomAlumno()+" "+
		 * formularioAlum.getApeAlumno()+" "+ formularioAlum.getSexoAlumno()+" "+
		 * formularioAlum.getaFavorita()+ " "+ formularioAlum.getDesAlumno());
		 * 
		 * }
		 */
	
	// controla si estás dentro de una sesión, un usuario ha dado de alta Alumnos.
		
	//	List<FormularioAlum> alumnosUsuario = new ArrayList<FormularioAlum>(); // se crea un listado por cada usuario que guarda los alumnos dados de alta en cada sesión del usuario.
//		if (session.getAttribute(alumnosUsuario)== null) { terminar en casa.
			
			
		}
		
		
		
		
//	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		//config.getInitParameter("textook") textook, es un parámetro que inicializas en la creación del
		// servlet, te apareceria en el web.xml un mapping de init.
		// en <param-value> es el valor del <param-name>textook</param-name>
	}



}
