package ctvit.mybatis_ts.model;

public class channel {
    private String channelid;

    private String organizationid;

    private String channelname;

    private String channeldesc;

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname == null ? null : channelname.trim();
    }

    public String getChanneldesc() {
        return channeldesc;
    }

    public void setChanneldesc(String channeldesc) {
        this.channeldesc = channeldesc == null ? null : channeldesc.trim();
    }
}