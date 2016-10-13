package com.swj.domain;

import java.util.List;
import java.util.Set;

public class Users {
	private String userloginname;
	private String userloginpwd;
	private String userage;
	private String usersex;
	private Roles roles;
	private Set<Menus> menus;
	private List<Funs> funs;
	
	public List<Funs> getFuns() {
		return funs;
	}
	public void setFuns(List<Funs> funs) {
		this.funs = funs;
	}
	public Set<Menus> getMenus() {
		return menus;
	}
	public void setMenus(Set<Menus> menus) {
		this.menus = menus;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public String getUserloginname() {
		return userloginname;
	}
	public void setUserloginname(String userloginname) {
		this.userloginname = userloginname;
	}
	public String getUserloginpwd() {
		return userloginpwd;
	}
	public void setUserloginpwd(String userloginpwd) {
		this.userloginpwd = userloginpwd;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	
}
