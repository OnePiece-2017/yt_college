package com.acsm.ytcollege.entity;

import javax.persistence.*;

/**
 * Created by HASEE on 2017/12/16.
 */
@Entity
@Table(name = "job_user", schema = "yt_college", catalog = "")
public class JobUser {
    private int userId;
    private int userType;
    private String phone;
    private String ico;
    private int ytAccountId;

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_type")
    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "ico")
    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    @Basic
    @Column(name = "yt_account_id")
    public int getYtAccountId() {
        return ytAccountId;
    }

    public void setYtAccountId(int ytAccountId) {
        this.ytAccountId = ytAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobUser jobUser = (JobUser) o;

        if (userId != jobUser.userId) return false;
        if (userType != jobUser.userType) return false;
        if (ytAccountId != jobUser.ytAccountId) return false;
        if (phone != null ? !phone.equals(jobUser.phone) : jobUser.phone != null) return false;
        if (ico != null ? !ico.equals(jobUser.ico) : jobUser.ico != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + userType;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (ico != null ? ico.hashCode() : 0);
        result = 31 * result + ytAccountId;
        return result;
    }
}
