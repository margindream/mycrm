package com.wax.lp.bean;

import java.util.Date;

public class CrmHuishouzhan {
    private Integer hid;

    private Integer ownerid;

    private Integer createid;

    private String companyname;

    private String contactsposition;

    private String contactsname;

    private String saltname;

    private String mobile;

    private String email;

    private Date createtime;

    private Date updatetime;

    private Integer deletestatus;

    private Integer deleteuserid;

    private Date deletetime;

    private Integer istransformed;

    private Integer transformuserid;

    private Integer contactsid;

    private Integer customerid;

    private Integer businessid;

    private String nextstep;

    private Date nexttime;

    private Date havetime;

    private String address;

    private String source;

    private String leadnote;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getContactsposition() {
        return contactsposition;
    }

    public void setContactsposition(String contactsposition) {
        this.contactsposition = contactsposition == null ? null : contactsposition.trim();
    }

    public String getContactsname() {
        return contactsname;
    }

    public void setContactsname(String contactsname) {
        this.contactsname = contactsname == null ? null : contactsname.trim();
    }

    public String getSaltname() {
        return saltname;
    }

    public void setSaltname(String saltname) {
        this.saltname = saltname == null ? null : saltname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    public Integer getDeleteuserid() {
        return deleteuserid;
    }

    public void setDeleteuserid(Integer deleteuserid) {
        this.deleteuserid = deleteuserid;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public Integer getIstransformed() {
        return istransformed;
    }

    public void setIstransformed(Integer istransformed) {
        this.istransformed = istransformed;
    }

    public Integer getTransformuserid() {
        return transformuserid;
    }

    public void setTransformuserid(Integer transformuserid) {
        this.transformuserid = transformuserid;
    }

    public Integer getContactsid() {
        return contactsid;
    }

    public void setContactsid(Integer contactsid) {
        this.contactsid = contactsid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getNextstep() {
        return nextstep;
    }

    public void setNextstep(String nextstep) {
        this.nextstep = nextstep == null ? null : nextstep.trim();
    }

    public Date getNexttime() {
        return nexttime;
    }

    public void setNexttime(Date nexttime) {
        this.nexttime = nexttime;
    }

    public Date getHavetime() {
        return havetime;
    }

    public void setHavetime(Date havetime) {
        this.havetime = havetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getLeadnote() {
        return leadnote;
    }

    public void setLeadnote(String leadnote) {
        this.leadnote = leadnote == null ? null : leadnote.trim();
    }

	@Override
	public String toString() {
		return "CrmHuishouzhan [hid=" + hid + ", ownerid=" + ownerid + ", createid=" + createid + ", companyname="
				+ companyname + ", contactsposition=" + contactsposition + ", contactsname=" + contactsname
				+ ", saltname=" + saltname + ", mobile=" + mobile + ", email=" + email + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + ", deletestatus=" + deletestatus + ", deleteuserid=" + deleteuserid
				+ ", deletetime=" + deletetime + ", istransformed=" + istransformed + ", transformuserid="
				+ transformuserid + ", contactsid=" + contactsid + ", customerid=" + customerid + ", businessid="
				+ businessid + ", nextstep=" + nextstep + ", nexttime=" + nexttime + ", havetime=" + havetime
				+ ", address=" + address + ", source=" + source + ", leadnote=" + leadnote + "]";
	}
    
    
}