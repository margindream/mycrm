package com.wax.lp.bean;

import java.util.Date;

public class CrmProduct {
    private Integer id;

    private Integer categoryid;

    private String name;

    private Integer createuserid;

    private Float costprice;

    private Float suggestedprice;

    private String developmentteam;

    private Date developmenttime;

    private String link;

    private Date createtime;

    private Date updatetime;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Float getCostprice() {
        return costprice;
    }

    public void setCostprice(Float costprice) {
        this.costprice = costprice;
    }

    public Float getSuggestedprice() {
        return suggestedprice;
    }

    public void setSuggestedprice(Float suggestedprice) {
        this.suggestedprice = suggestedprice;
    }

    public String getDevelopmentteam() {
        return developmentteam;
    }

    public void setDevelopmentteam(String developmentteam) {
        this.developmentteam = developmentteam == null ? null : developmentteam.trim();
    }

    public Date getDevelopmenttime() {
        return developmenttime;
    }

    public void setDevelopmenttime(Date developmenttime) {
        this.developmenttime = developmenttime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}