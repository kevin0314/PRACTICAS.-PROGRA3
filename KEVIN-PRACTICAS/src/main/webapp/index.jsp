<html>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
   <script src="http://code.jquery.com/jquery-latest.js">
   </script>

   <script type="text/javascript">
     $(document).ready(function(){
         $('#carga').click(function(event){
          var btn = $('#carga').val();
          $.post('ServeleteControler',{

          }, function(response){
          let datos = JSON.parse(response);
          //console.log(datos);
          var tabladatos = document.getElementById('tablaDatos');

           for(let item of datos){
            tabladatos.innerHTML += ` 
              <tr>
               <td>${item.id}</td>
               <td>${item.nombreProducto}</td>
               <td>${item.precioProducto}</td>
               <td>${item.cantidadProducto}</td>
               <td>${item.totalProducto}</td>
              </tr>

            `


           }

          });

         });
     
     });
   </script>
   

<body>
<h2>Agregar Culos</h2>
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
   				  <input type="submit" name="btn" value="Agregar" class="btn btn-info">
   				   <input type="submit" name="btn" value="Editar" class="btn btn-Warning">
               <input type="submit" name="btn" value="Eliminar" class="btn btn-danger">
               <input type="submit" name="btn" value="Cargar" class="btn btn-danger" id="carga">

               <br>
               <br>

               <table class="table table-dark" id="tablaDatos">
                  <thead>
                     
                     <th>ID</th>
                     <th>NOMBRE</th>
                     <th>PRECIO</th>
                     <th>CANTIDAD</th>
                     <th>TOTAL</th>

                  </thead>
                  <tbody>
                     
                  </tbody>
                  

               </table>
   				
   				
   			
           </td>
   		</tr>

   	</tbody>

   </thead>

</table>


</body>
</html>

