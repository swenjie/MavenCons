package com.swj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swj.domain.Users;
import com.swj.exception.UserNotFoundException;
import com.swj.persist.UserDao;
import com.swj.service.UserManager;

@Service
public class UserManagerImpl implements UserManager {
	@Autowired
	private UserDao ud;

	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	public List<Users> findUserAll() {
		return this.ud.selectUserAllProxy();
	}

	public Users userlogin(Users user) {
		Users u =  this.ud.selectUserByName(user.getUserloginname());
		if(u == null){
			throw new UserNotFoundException("用户不存在");
		}else{
			if(!user.getUserloginpwd().equals(u.getUserloginpwd())){
				throw new UserNotFoundException("密码错误");
			}
		}
		return u;
	}
	
}
