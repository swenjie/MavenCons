package ctvit.mybatis_ts.model;

import java.util.Date;

public class organization {
    private String organizationid;

    private String organizationname;

    private Date organizationcreatetime;

    private Integer organizationflag;

    private String organizationdesc;

    private String organizationietitle;

    private String beizu;

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }

    public Date getOrganizationcreatetime() {
        return organizationcreatetime;
    }

    public void setOrganizationcreatetime(Date organizationcreatetime) {
        this.organizationcreatetime = organizationcreatetime;
    }

    public Integer getOrganizationflag() {
        return organizationflag;
    }

    public void setOrganizationflag(Integer organizationflag) {
        this.organizationflag = organizationflag;
    }

    public String getOrganizationdesc() {
        return organizationdesc;
    }

    public void setOrganizationdesc(String organizationdesc) {
        this.organizationdesc = organizationdesc == null ? null : organizationdesc.trim();
    }

    public String getOrganizationietitle() {
        return organizationietitle;
    }

    public void setOrganizationietitle(String organizationietitle) {
        this.organizationietitle = organizationietitle == null ? null : organizationietitle.trim();
    }

    public String getBeizu() {
        return beizu;
    }

    public void setBeizu(String beizu) {
        this.beizu = beizu == null ? null : beizu.trim();
    }
}