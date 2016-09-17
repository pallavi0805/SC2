package com.User.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Product;

/**
 * Servlet implementation class ViewProdController
 */
public class ViewProdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("users");	      
	      EntityManager entitymanager = emfactory.createEntityManager();
	      Query q = entitymanager.createQuery("SELECT p FROM Product p");
	      List<Product> prod= (List<Product>) q.getResultList();    	    	  
	      entitymanager.close();
	      emfactory.close();
	      for(Product p:prod)
	      {
	    	  System.out.println(p.getProductId()+p.getProductName());
	      }
	      request.setAttribute("product",prod);
		RequestDispatcher dispatcher=request.getRequestDispatcher("ProductView.jsp");		
		dispatcher.forward(request, response);
	}

}
