package com.wax.lp.bean;

public class CrmRole {
    private Integer roleid;

    private String rolecontent;

    private Integer permissionid;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolecontent() {
        return rolecontent;
    }

    public void setRolecontent(String rolecontent) {
        this.rolecontent = rolecontent == null ? null : rolecontent.trim();
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}