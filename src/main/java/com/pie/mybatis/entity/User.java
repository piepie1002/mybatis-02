package com.pie.mybatis.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    /**
     *
     */
    private Integer uId;

    /**
     * 用户名
     */
    private String uUsername;

    /**
     * 密码
     */
    private String uPassword;

    /**
     * 0表示未删除,1表示删除
     */
    private Integer uStatus;
    
    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uUsername='" + uUsername + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uStatus=" + uStatus +
                ", addresses=" + addresses +
                '}';
    }
}

