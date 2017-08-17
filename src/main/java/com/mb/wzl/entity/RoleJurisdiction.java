package com.mb.wzl.entity;

public class RoleJurisdiction {
    private String id;

    private String roleId;

    private String jurisdictionId;

    public RoleJurisdiction() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(String jurisdictionId) {
        this.jurisdictionId = jurisdictionId == null ? null : jurisdictionId.trim();
    }
}