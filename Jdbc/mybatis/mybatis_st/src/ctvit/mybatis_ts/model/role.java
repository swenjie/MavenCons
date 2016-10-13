package ctvit.mybatis_ts.model;

import java.util.Date;
import java.util.List;

public class role {
	
    private String roleid;

    private String rolename;

    private String organizationid;

    private String roledesc;

    private Integer roleflag;

    private Date createtime;

    private Date updatecreatetime;

    private String updateuserid;

    private byte[] rolerights;

    private List<user> userlist;
    
    public List<user> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<user> userlist) {
		this.userlist = userlist;
	}

	public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    public Integer getRoleflag() {
        return roleflag;
    }

    public void setRoleflag(Integer roleflag) {
        this.roleflag = roleflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatecreatetime() {
        return updatecreatetime;
    }

    public void setUpdatecreatetime(Date updatecreatetime) {
        this.updatecreatetime = updatecreatetime;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public byte[] getRolerights() {
        return rolerights;
    }

    public void setRolerights(byte[] rolerights) {
        this.rolerights = rolerights;
    }
}