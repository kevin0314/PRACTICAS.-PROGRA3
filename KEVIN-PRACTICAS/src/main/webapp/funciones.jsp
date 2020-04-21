<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
   
<meta charset="ISO-8859-1">
<title>Funciones</title>

</head>
<%
String idBus = request.getParameter("idBus");
String nombre = request.getParameter("Npr");
String precio = request.getParameter("PrecioPr");
String cantidad = request.getParameter("CantidadPr");
String total = request.getParameter("TotalPr");

%>
<%
if(idBus==null){
	idBus="";
	nombre="";
	precio="";
	cantidad="";
	total="";
}
%>
<body>
<form action="ServeleteControler" >

<table align="center">
	
   <thead>
   	<tbody>
   		<tr>
   		<td>
   			
   				<p>Id</p><input type="text" name="Id" value="<%=idBus %>">
   				<p>Nombre producto</p><input type="text" name="Nproductos" value="<%=nombre %>">
   				<p>Precio producto</p><input type="text" name="Pproductos" value="<%=precio %>">
   				<p>Cantidad de producto</p><input type="text" name="Cproductos" value="<%=cantidad %>">
   				<p>Total de producto</p><input type="text" name="Tproductos" value="<%=total %>">
   				<br>
   				<br>
   				    </td>
   		</tr>

   	</tbody>

   </thead>

</table>
   				  <input type="submit" name="btn" value="GUARDAR" class="btn btn-info" name="btn">
   				  <input type="submit" name="btn" value="EDITAR" class="btn btn-warning" name="btn">
       
  </form> 				
</body>
</html>