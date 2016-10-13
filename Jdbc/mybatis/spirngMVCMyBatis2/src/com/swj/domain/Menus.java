package com.swj.domain;

public class Menus {
	private int menuid;
	private String menuname;
	private String menuurl;
	private int fatherid;
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuurl() {
		return menuurl;
	}
	public void setMenuurl(String menuurl) {
		this.menuurl = menuurl;
	}
	public int getFatherid() {
		return fatherid;
	}
	public void setFatherid(int fatherid) {
		this.fatherid = fatherid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fatherid;
		result = prime * result + menuid;
		result = prime * result
				+ ((menuname == null) ? 0 : menuname.hashCode());
		result = prime * result + ((menuurl == null) ? 0 : menuurl.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menus other = (Menus) obj;
		if (fatherid != other.fatherid)
			return false;
		if (menuid != other.menuid)
			return false;
		if (menuname == null) {
			if (other.menuname != null)
				return false;
		} else if (!menuname.equals(other.menuname))
			return false;
		if (menuurl == null) {
			if (other.menuurl != null)
				return false;
		} else if (!menuurl.equals(other.menuurl))
			return false;
		return true;
	}
	
}
