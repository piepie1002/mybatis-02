package com.pie.mybatis.entity;

import java.io.Serializable;
import java.util.List;

public class Roles implements Serializable {
    /**
     *
     */
    private Integer roleId;

    /**
     * 角色名字
     */
    private String roleName;

    /**
     * 角色说明
     */
    private String dec;

    /**
     * 0表示未删除,1表示删除
     */
    private Integer isDel;
    
    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", dec='" + dec + '\'' +
                ", isDel=" + isDel +
                ", privileges=" + privileges +
                '}';
    }
}

