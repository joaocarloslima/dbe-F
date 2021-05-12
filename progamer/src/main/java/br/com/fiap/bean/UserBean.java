package br.com.fiap.bean;

import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UserDAO;
import br.com.fiap.model.User;


@Named
@RequestScoped
public class UserBean {
	
	private User user = new User();
	
	public void save() {
		new UserDAO().create(this.user);
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage("Usuário cadastrado com sucesso"));
	}
	
	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();
		boolean exist = new UserDAO().exist(user);
		
		if (exist) {
			//gravar o usr na sessao
			context.getExternalContext().getSessionMap().put("user", user);
			return "index?faces-redirect=true";
		}
		
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_ERROR, 
						"Login inválido",
						"Erro")
				);

		return "login?faces-redirect=true";
	}
	
	public String logout() {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.remove("user");
		return "login?faces-redirect=true";
		
	}
	
	public List<User> getUsers(){
		return new UserDAO().getAll();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

}
