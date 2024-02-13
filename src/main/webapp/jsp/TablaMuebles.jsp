<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="servlets.MobiliarioServlet, servlets.Mobiliario, servlets.Mesa, servlets.Sofa, servlets.Lampara, java.util.List, java.util.ArrayList"%>
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
		<!--<caption><%=request.getAttribute("subtitulo")%></caption>
		 coge el subtitulo guardado en web.xlm param, y convocado en el metodo init del servlet -->

<% Map<String,Object> mapa = (Map<String,Object>)request.getAttribute("mapa");
	//nos traemos el mapa desde el servlet
	List<Mobiliario> muebles = (List<Mobiliario>)mapa.get("listadoMuebles");//castear 
	// recogemos el listado de muesbles con la clave "listadoMuebles"
%>

	<h1><%=mapa.get("subtitulo") %></h1>
	

				
		<tr>
			<th>TIPO MOBILIARIO</th>
			<th>NOMBRE DEL MUEBLE</th>
			<th>PRECIO</th>
			<th>ESTILO</th>
			<th>COLOR</th>
			<th>POTENCIA</th>
						
		</tr>
		


<% for (Mobiliario mueble:muebles) {
		
	if(mueble instanceof Mesa) {     
	  Mesa mesa1 =(Mesa)mueble;%> <!-- castear -->
	  <tr>
	  <td>Mesa</td>
	  <td><%=mesa1.getNombre()%></td>
	  <td><%=mesa1.getPrecio()%></td>
	  <td><%=mesa1.getEstilo()%></td>
	  <td></td>
	  <td></td>
	  </tr>
	
	<%}else{ if (mueble instanceof Sofa){
			Sofa sofa1 =(Sofa)mueble;%>  <!-- castear -->
			<tr>
			<td>Sofa</td>
			<td><%=sofa1.getNombre()%></td>
			<td><%=sofa1.getPrecio()%></td>
			<td></td>
			<td><%=sofa1.getColor()%></td>
			<td></td>
			</tr>
		<%} else {
			if(mueble instanceof Lampara) {
				Lampara lamp1 =(Lampara)mueble;%><!-- castear -->
					<tr>
					<td>L�mpara</td>
					<td><%=lamp1.getNombre()%></td>
					<td><%=lamp1.getPrecio()%></td>
					<td></td>
					<td></td>
					<td><%=lamp1.getPotencia()%></td>
					</tr>
			<%} %>
		<%} %>		
	<%} %>		
<%} %>
</table>
<br><br> <a href="http://localhost:8082/ProyectoWeb/jsp/FormMobiliario.jsp"><input id="Alta_Mobiliario" type="submit" value="AltaMobiliario" ></input></a>



</body>
</html>