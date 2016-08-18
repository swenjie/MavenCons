package com.ctvit.db.beans;

import java.io.Serializable;

public class UserInfo implements Serializable{
    @Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}