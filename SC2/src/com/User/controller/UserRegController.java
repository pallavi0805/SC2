package com.User.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Users;


/**
 * Servlet implementation class AdminRegController
 */
public class UserRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("users");	      
	      EntityManager entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();
	      Users user = new Users(); 
	      user.setEmailId(request.getParameter("email"));
	      user.setPassword(request.getParameter("password"));
	      user.setContactNo(request.getParameter("contact"));
	      user.setFirstName(request.getParameter("name"));	      	    
	      entitymanager.persist(user);
	      entitymanager.getTransaction().commit();
	      entitymanager.close();
	      emfactory.close();
        request.setAttribute("newUser",user.getFirstName());
		RequestDispatcher dispatcher=request.getRequestDispatcher("RegSuccess.jsp");		
		dispatcher.forward(request, response);
		
	}

}
