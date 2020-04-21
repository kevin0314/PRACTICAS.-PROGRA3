package com.controladordatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kevin.DAO.ProductoDao;
import com.model.entidades.Productospv;

/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Productospv pr = new Productospv();
		ProductoDao prd = new ProductoDao();
		
		String id = null;
		String nombrepr = null;
		String preciopr = null;
		String cantidadpr = null;
		String totalpr= null;
		try {
		
		id = request.getParameter("Id");
		nombrepr = request.getParameter("Nproductos");
		preciopr = request.getParameter("Pproductos");
	    cantidadpr = request.getParameter("Cproductos");
		totalpr = request.getParameter("Tproductos");
		
		pr.setId(Integer.parseInt(id));
		pr.setNombreProducto(nombrepr);
		pr.setPrecioProducto(Double.parseDouble(preciopr));
		pr.setCantidadProducto(Integer.parseInt(cantidadpr));
		pr.setTotalProducto(Double.parseDouble(totalpr));
		} catch (Exception e) {
			
		}
		
	
		
		String acction = request.getParameter("btn");
		
		if(acction.equals("GUARDAR")) {
			
			
			prd.agregarDatos(pr);
		
		}else if(acction.equals("EDITAR")) {
			
	
			prd.actualizarDatos(pr);
			
		}else if(acction.equals("ELIMINAR")) {
			pr.setId(Integer.parseInt(id));
			
			prd.eliminarDatos(pr);	
		}
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductoDao prdao = new ProductoDao();
		
		Gson json = new Gson();
		
		try {
			
			response.getWriter().append(json.toJson(prdao.productoLista()));
			
			
		} catch (Exception e) {
		System.out.println(e);
		}
		
		
		

	}

}
