<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1> FORMULARIO ALTA MOBILIARIO</h1>

<script type="text/javascript">

	function cambioVisibilidad(){
		tipo=document.getElementById("TipoMobiliario").value
		if (tipo == "Mesa"){
			document.getElementById("estilo").style.display="block";
			document.getElementById("color").style.display="none";
			document.getElementById("potencia").style.display="none";
		}else if (tipo == "Sofa"){
			document.getElementById("estilo").style.display="none";
			document.getElementById("color").style.display="block";
			document.getElementById("potencia").style.display="none";
			} else if (tipo == "lampara"){
				document.getElementById("estilo").style.display="none";
				document.getElementById("color").style.display="none";
				document.getElementById("potencia").style.display="block";
				}
  		}

</script> 





<body>
	<form action="/ProyectoWeb/MobiliarioServlet" method="post" id="MobilForm">
	
		<br> Tipo de Mobiliario <br>
		<select id="TipoMobiliario"	name="TipoMobiliario" onchange="cambioVisibilidad()">
			<option value="0"> Seleccione un tipo de Mobiliario</option>
			<option value="Mesa"> MESA </option>
			<option value="Sofa"> SOFÁ </option>
			<option value="lampara"> LÁMPARA </option>		
		</select><br><br> 
		Nombre: <input type="text" name="nombre" placeholder="Introduzca el nombre del mueble" ></label> <br><br>
		Precio: <input type="number" name="precio" placeholder="Introduzca el precio" ></label> <br><br>
		
		
		<div id="estilo">Estilo: <input type="text" name="estiloMesa" placeholder="Introduce el estilo de la mesa" ></label> <br><br></div>
		<div id="color">Color: <input type="text" name="colorSofa" placeholder="Introduce el color del sofá" ></label> <br><br></div>
		<div id="potencia">Potencia: <input type="text" name="potenciaLampara" placeholder="Introduce la potencia de la lámpara" ></label> <br><br></div>
		
		<br><br> <input id="enviar_datos" type="submit" value="Enviar datos" >
	
	</form>



</body>
</html>