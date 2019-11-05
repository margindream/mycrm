package com.wax.lp.bean;

public class CrmSystemUser {
    private Integer sid;

    private String sname;

    private String ssex;

    private String password;

    private Integer roleid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

	@Override
	public String toString() {
		return "CrmSystemUser [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex + ", password=" + password
				+ ", roleid=" + roleid + "]";
	}
    
    
}