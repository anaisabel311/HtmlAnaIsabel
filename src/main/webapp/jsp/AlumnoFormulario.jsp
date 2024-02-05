<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1> FORMULARIO ALTA ALUMNO</h1>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 <script type="text/javascript">                                                       
	//https://api.jquery.com/category/events/
	
	$(document).ready(function(){
		
		$('#AlumnoForm').submit(function(){
			//alert ($('#lista_de_seleccion').val())
			//alert("Guardando")
			if ( $('#lista_de_seleccion').val() == 0){
				alert("Debes seleccionar una asignatura")
				return false // para que no vaya al servidor 
			}else{
				alert("Todo está correcto")
				return true // para que vaya al servidor 
			}	
	});
});	
</script>

<% 
 String nombre = request.getParameter("nombre")!=null?request.getParameter("nombre"):"";
 String apellidos = request.getParameter("apellidos")!=null?request.getParameter("apellidos"):"";
 String sexo = request.getParameter("sexo")!=null?request.getParameter("sexo"):"";
 String lista_de_seleccion = request.getParameter("lista_de_seleccion")!=null?request.getParameter("lista_de_seleccion"):"";
 String descripcion = request.getParameter("descripcion_alumno")!=null?request.getParameter("descripcion_alumno"):"";
 %>

<body>
	<form action="/ProyectoWeb/AlumnoServlet" method="post" id="AlumnoForm">
		<!-- AlumnoServlet del action es igual al <url-pattern> del </servlet-mapping> -->
		
	<!--<form action="/ProyectoWeb/AlumnoServlet" method="post" name="AlumnoForm" onsubmit "return enviar()">
		 este form hace la validación con javascript puro, por eso se pone el evento dentro de la entiqueta form (onsubmit "validacion") 	-->
		
		Nombre del Alumno: <input type="text" name="nombre" placeholder="Introduce tu nombre" value="<%=nombre %>" tabindex="1"></label> <br>
		<!-- el tabindex, es el orden en que quieres que te mueva por los campos utilizando el tabulador -->	
		
		Apellidos del Alumno:<input type="text" name="apellidos" placeholder="Introduce tus apellidos" value="<%=apellidos%>" tabindex="2"></label><br><br>
		
		<label for="sexo">Selecciona el sexo del alumno</label><br>
    M <input type="radio" name="sexo" value="Masculino" tabindex="3">
    F <input type="radio" name="sexo" value="Femenino" tabindex="4">
    OTROS <input type="radio" name="sexo" value="Otros" checked tabindex="5"><br>
		
		
		<br> Lista de Asignaturas favoritas: <br>
		<select id="lista_de_seleccion" name="lista_de_seleccion" tabindex="6"> 
			<option value="0">Seleccione una opcion</option>
			<option value="JAVA" selected>JAVA</option>
			<option value="MATEMATICAS">MATEMATICAS</option>
			<option value="NATURALES">NATURALES</option>
			 selected="selected">opcionSelect</option>
		</select>
		<br><br>
		
		<br> Breve descripcion Alumno: <br>
		<textarea name="descripcion_alumno" cols="20" maxlength="200" tabindex="7"></textarea><br>
			
		<br> <input id="validacion" type="submit" value="Enviar datos" >
	</form>



<!--<script type ="text/javascript">
	
	function enviar(){
		document.getElementById("lista_de_seleccion").value
		
		if (document.getElementById("lista_de_seleccion").value ){
			alert("Debes seleccionar una asignatura")
			document.getElementById("lista_de_seleccion").focus()
			return false //si devuelve la funcion false, devuelve el evento al formulario 
			}else{
				alert("Todo correcto")
				return true 
				//si devuelve la funcion true, manda el formulario al servidor
			}
	}
	
</script>-->
	
</body>
</html>

</body>
</html>