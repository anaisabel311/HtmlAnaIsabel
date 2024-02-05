<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="servlets.AlumnoServlet, servlets.FormularioAlum, java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
	table, td, th { border:1px solid black; }
	#table { border-spacing:10px; }
	#table { border-collapse:collapse; }
	#td { padding:10px; }
	#td, th { padding:5px; }
	table { width:100%; }
	thead { color:navy; } 
	tbody { color:green; } 
	tfoot { color:maroon; }
</style>
</head>
<body>
	<table>
		<caption>LISTADO ALUMNOS</caption>
		<tr>
			<th>NOMBRE</th>
			<th>APELLIDOS</th>
			<th>SEXO</th>
			<th>ASIGNATURA FAVORITA</th>
			<th>DESCRIPCIÓN</th>
			
		</tr>
<form action="AlumnoServlet" method="post">		
<% List<FormularioAlum> alumnos = (List<FormularioAlum>)request.getAttribute("listadoAlumnos");%>		
<!-- // hay que castear el objeto "listadoAlumnos", ya que en el setAttribute te manda un objeto. -->

		
<% for (FormularioAlum forAlum : alumnos) { %>
		<tr>
			<td><%=forAlum.getNomAlumno()%></td>
			<td><%=forAlum.getApeAlumno()%></td>
			<td><%=forAlum.getSexoAlumno()%></td>
			<td><%=forAlum.getaFavorita()%></td>
			<td><%=forAlum.getDesAlumno()%></td>
			
			<br><td><a href="/ProyectoWeb/jsp/AlumnoFormulario.jsp?nombre=<%=forAlum.getNomAlumno()%>
			&apellidos=<%=forAlum.getApeAlumno()%>
			&sexo=<%=forAlum.getSexoAlumno()%>
			&lista_de_seleccion=<%=forAlum.getaFavorita()%>
			&descripcion_alumno=<%=forAlum.getDesAlumno()%>">
			
			
			<input id="modificacion" type="button" value="Modificar"></td></a>
			
</form>
			
		</tr>
<%}%>		
	</table>
	<br><a href="/ProyectoWeb/jsp/AlumnoFormulario.jsp"><input id="altaAlumno" type="submit" value="AltaNuevoAlumno"></input></a>

</body>


</script>
</html>
