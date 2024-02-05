<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% for (int i=0; i<3; i++  ){ %>
	
<p> Esto es una prueba de jsp </p>

<% } %>
<ol>
<% List<String> colores = new ArrayList();
	colores.add("AZUL");
	colores.add("VERDE");
	colores.add("MORADO");
	colores.add("ROSA");
	
	for (String color : colores ){%>
		
	 	<li> <%= color %></li>
 	
<% } %>
</ol>


</body>
</html>