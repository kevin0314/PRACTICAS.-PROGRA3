<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
   
<meta charset="ISO-8859-1">
<title>Funciones</title>

</head>
<body>
<form action="ServeleteControler" >

<table align="center">
	
   <thead>
   	<tbody>
   		<tr>
   		<td>
   			
   				<p>Id</p><input type="text" name="Id">
   				<p>Nombre producto</p><input type="text" name="Nproductos">
   				<p>Precio producto</p><input type="text" name="Pproductos">
   				<p>Cantidad de producto</p><input type="text" name="Cproductos">
   				<p>Total de producto</p><input type="text" name="Tproductos">
   				<br>
   				<br>
   				    </td>
   		</tr>

   	</tbody>

   </thead>

</table>
   				  <input type="submit" name="btn" value="GUARDAR" class="btn btn-info">
       
  </form> 				
</body>
</html>