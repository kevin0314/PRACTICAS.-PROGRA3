package com.kevin.DAO;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.entidades.Productospv;
import com.mysql.fabric.xmlrpc.base.Array;
public class ProductoDao {
	
	public List<Productospv> productoLista(){
		Productospv pr = new Productospv();
		List<Productospv> listapr = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("KEVIN-PRACTICAS");
		em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			listapr = em.createQuery("from Productospv").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		
		
		return listapr;
		
	}
	
	public void agregarDatos(Productospv pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("KEVIN-PRACTICAS");
		em = emf.createEntityManager();
		em.getTransaction().begin();
    	em.persist(pr);
		em.flush();
		em.getTransaction().commit();
	}
	
	public void actualizarDatos(Productospv pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("KEVIN-PRACTICAS");
		em = emf.createEntityManager();
		pr.getId();
		pr.getNombreProducto();
		pr.getPrecioProducto();
		pr.getCantidadProducto();
		pr.getTotalProducto();
		em.getTransaction().begin();
    	em.merge(pr);
    	em.flush();
		em.getTransaction().commit();
	}
	
	public void eliminarDatos(Productospv pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("KEVIN-PRACTICAS");
		em = emf.createEntityManager();
		pr = em.getReference(Productospv.class, pr.getId());
    	em.getTransaction().begin();
		em.remove(pr);
		em.flush();
		em.getTransaction().commit();
	}
	

}
