package com.ctvit.db.beans;

import java.util.Date;

public class TimeSheet {
    private String timesheetid;

    private Integer userid;

    private Date timedate;

    private Date ontime;

    private Date offtime;

    private String remarks;

    private Short onexception;

    private Short offexception;

    public String getTimesheetid() {
        return timesheetid;
    }

    public void setTimesheetid(String timesheetid) {
        this.timesheetid = timesheetid == null ? null : timesheetid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getTimedate() {
        return timedate;
    }

    public void setTimedate(Date timedate) {
        this.timedate = timedate;
    }

    public Date getOntime() {
        return ontime;
    }

    public void setOntime(Date ontime) {
        this.ontime = ontime;
    }

    public Date getOfftime() {
        return offtime;
    }

    public void setOfftime(Date offtime) {
        this.offtime = offtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getOnexception() {
        return onexception;
    }

    public void setOnexception(Short onexception) {
        this.onexception = onexception;
    }

    public Short getOffexception() {
        return offexception;
    }

    public void setOffexception(Short offexception) {
        this.offexception = offexception;
    }
}