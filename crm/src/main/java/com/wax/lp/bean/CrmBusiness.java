package com.wax.lp.bean;

import java.util.Date;

public class CrmBusiness {
    private Integer businessid;

    private String name;

    private String origin;

    private String type;

    private Integer estimateprice;

    private Integer customerid;

    private Integer creatorid;

    private Integer ownerid;

    private Integer gainrate;

    private Integer totalamount;

    private Float subtotal;

    private Float discountprice;

    private Float salesprice;

    private Date duedate;

    private Date createtime;

    private Date updatetime;

    private Integer updateuserid;

    private Integer statusid;

    private Float totalprice;

    private String nextstep;

    private Date nexttime;

    private Integer deletestatus;

    private Integer deleteuserid;

    private Date deletetime;

    private Integer contactsid;

    private String contactaddress;

    private String description;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getEstimateprice() {
        return estimateprice;
    }

    public void setEstimateprice(Integer estimateprice) {
        this.estimateprice = estimateprice;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getGainrate() {
        return gainrate;
    }

    public void setGainrate(Integer gainrate) {
        this.gainrate = gainrate;
    }

    public Integer getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Integer totalamount) {
        this.totalamount = totalamount;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Float discountprice) {
        this.discountprice = discountprice;
    }

    public Float getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Float salesprice) {
        this.salesprice = salesprice;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
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

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
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

    public Integer getContactsid() {
        return contactsid;
    }

    public void setContactsid(Integer contactsid) {
        this.contactsid = contactsid;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress == null ? null : contactaddress.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		return "CrmBusiness [businessid=" + businessid + ", name=" + name + ", origin=" + origin + ", type=" + type
				+ ", estimateprice=" + estimateprice + ", customerid=" + customerid + ", creatorid=" + creatorid
				+ ", ownerid=" + ownerid + ", gainrate=" + gainrate + ", totalamount=" + totalamount + ", subtotal="
				+ subtotal + ", discountprice=" + discountprice + ", salesprice=" + salesprice + ", duedate=" + duedate
				+ ", createtime=" + createtime + ", updatetime=" + updatetime + ", updateuserid=" + updateuserid
				+ ", statusid=" + statusid + ", totalprice=" + totalprice + ", nextstep=" + nextstep + ", nexttime="
				+ nexttime + ", deletestatus=" + deletestatus + ", deleteuserid=" + deleteuserid + ", deletetime="
				+ deletetime + ", contactsid=" + contactsid + ", contactaddress=" + contactaddress + ", description="
				+ description + "]";
	}
    
}