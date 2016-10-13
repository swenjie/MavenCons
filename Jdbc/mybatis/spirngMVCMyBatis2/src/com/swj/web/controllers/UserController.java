package com.swj.web.controllers;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.swj.domain.Funs;
import com.swj.domain.Menus;
import com.swj.domain.Users;
import com.swj.exception.UserNotFoundException;
import com.swj.service.UserManager;

@Controller
public class UserController {
	@Autowired
	private UserManager um;

	public UserManager getUm() {
		return um;
	}

	public void setUm(UserManager um) {
		this.um = um;
	}
	@RequestMapping("/findUserAll")
	public String findUserAll(HttpServletRequest request){
		List<Users> list = this.um.findUserAll();
		request.setAttribute("list", list);
		return "showUser";
	}
	@RequestMapping("/userLogin")
	public String userLogin(Users user,HttpServletRequest request){
		try{
			Users u = 	this.um.userlogin(user);
			HttpSession session = request.getSession();
			Set<Menus> m = u.getMenus();
			for(Menus mm:m){
				System.out.println(mm.getMenuname()+"\t"+mm.getMenuid());
			}
			System.out.println("------------------------------------");
			List<Funs> fun = u.getFuns();
			for(Funs f:fun){
				System.out.println(f.getFunid()+"\t"+f.getFunname());
			}
			session.setAttribute("u", u);
		}catch(UserNotFoundException e){
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "login";
		}
		return "redirect:index.jsp";
	}
}
