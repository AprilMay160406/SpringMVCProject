package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Model.UserBean;
import Repository.UserRepository;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@RequestMapping(value="/register")
	public ModelAndView showRegister() {
		
		UserBean bean = new UserBean();
		return new ModelAndView("register","user",bean);
		
	}
	
	@RequestMapping(value="/insert")
	public String doRegister() {
		
		int i = repo.insertUser();
		
	}
	
	

}
