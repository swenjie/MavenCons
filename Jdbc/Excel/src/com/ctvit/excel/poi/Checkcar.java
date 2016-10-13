package com.ctvit.excel.poi;

public class Checkcar {
	public Checkcar() {
	}

	public Checkcar(String carnumber, String username, String carstyle, String telnum) {
		super();
		this.carnumber = carnumber;
		this.username = username;
		this.carstyle = carstyle;
		this.telnum = telnum;
	}

	private String carnumber;
	private String username;
	private String carstyle;
	private String telnum;

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCarstyle() {
		return carstyle;
	}

	public void setCarstyle(String carstyle) {
		this.carstyle = carstyle;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
}
