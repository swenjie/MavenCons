package ctvit.mybatis_ts.model;

import java.util.Date;
import java.util.List;

public class user {
  
	private String userid;

    private String username;

    private String userpassword;

    private String organizationid;

    private Integer userflag;

    private Date createtime;

    private String creator;

    private Integer roleflag;
    
    private List<role> rolelist;
    

    public List<role> getRolelist() {
		return rolelist;
	}

	public void setRolelist(List<role> rolelist) {
		this.rolelist = rolelist;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public Integer getUserflag() {
        return userflag;
    }

    public void setUserflag(Integer userflag) {
        this.userflag = userflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getRoleflag() {
        return roleflag;
    }

    public void setRoleflag(Integer roleflag) {
        this.roleflag = roleflag;
    }
    @Override
  	public String toString() {
  		return "user [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
  				+ ", organizationid=" + organizationid + ", userflag=" + userflag + ", createtime=" + createtime
  				+ ", creator=" + creator + ", roleflag=" + roleflag + "]";
  	}
}