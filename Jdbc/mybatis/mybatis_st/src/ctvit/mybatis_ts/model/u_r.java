package ctvit.mybatis_ts.model;

public class u_r {
    private String relationid;

    private String userUserid;

    private String rolRoleid;

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid == null ? null : relationid.trim();
    }

    public String getUserUserid() {
        return userUserid;
    }

    public void setUserUserid(String userUserid) {
        this.userUserid = userUserid == null ? null : userUserid.trim();
    }

    public String getRolRoleid() {
        return rolRoleid;
    }

    public void setRolRoleid(String rolRoleid) {
        this.rolRoleid = rolRoleid == null ? null : rolRoleid.trim();
    }
}