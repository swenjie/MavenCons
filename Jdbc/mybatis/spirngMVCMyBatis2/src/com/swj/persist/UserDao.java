package com.swj.persist;

import java.util.List;

import com.swj.domain.Users;

public interface UserDao {
	public List<Users> selectUserAllProxy();
	public Users selectUserByName(String username);
}
