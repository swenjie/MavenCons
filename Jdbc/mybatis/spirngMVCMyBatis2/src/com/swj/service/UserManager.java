package com.swj.service;

import java.util.List;

import com.swj.domain.Users;

public interface UserManager {
	public List<Users> findUserAll();
	public Users userlogin(Users user);
}
