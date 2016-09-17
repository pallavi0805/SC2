package com.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.User.controller.UserDAO;

@ManagedBean
public class LoginUserBean {
	private UserDAO userDAO = new UserDAO();
	private Users user = new Users();

	public String check() {
		user = userDAO.getUser(user.getEmailId(), user.getPassword());
		if (user == null) {
			user = new Users();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Email not found", "Login Error!!"));
			return null;
		} else {
			return "loginSuccess";
		}
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
