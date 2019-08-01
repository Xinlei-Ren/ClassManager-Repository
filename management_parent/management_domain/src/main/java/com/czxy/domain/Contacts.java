package com.czxy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 联系方式
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.29 18:23
 */
@Entity
@Table(name = "contacts")
public class Contacts {
    @Id
    /*编号*/
    private Integer id;
    /*姓名*/
    private String name;
    /*登录名称*/
    private String userName;
    /*登录密码*/
    private String password;
    /*联系方式*/
    private String telephone;
    /*注册时间*/
    private Date registrationDate;
    /*性别*/
    private String sex;
    /*生日*/
    private Date birthdayDate;
    /*头像*/
    private String srcImg;
    /*职位id*/
    private Integer pid;
    /*状态*/
    private Integer state;
    /*省份 id*/
    private Integer proId;
    /*城市 id*/
    private Integer citId;
    /*区县 id*/
    private Integer disId;
    /*删除状态*/
    private Integer delStatus;
    /*拼音首字母*/
    private String initial;
    /*省份*/
    private Pcd byProId;
    /*城市*/
    private Pcd byCitId;
    /*区县*/
    private Pcd byDisId;

    public Contacts() {
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Contacts(Integer id, String name, String userName, String password, String telephone, Date registrationDate, String sex, Date birthdayDate, String srcImg, Integer pid, Integer state, Integer proId, Integer citId, Integer disId, Integer delStatus, String initial, Pcd byProId, Pcd byCitId, Pcd byDisId) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.telephone = telephone;
        this.registrationDate = registrationDate;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.srcImg = srcImg;
        this.pid = pid;
        this.state = state;
        this.proId = proId;
        this.citId = citId;
        this.disId = disId;
        this.delStatus = delStatus;
        this.initial = initial;
        this.byProId = byProId;
        this.byCitId = byCitId;
        this.byDisId = byDisId;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", registrationDate=" + registrationDate +
                ", sex='" + sex + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", srcImg='" + srcImg + '\'' +
                ", pid=" + pid +
                ", state=" + state +
                ", proId=" + proId +
                ", citId=" + citId +
                ", disId=" + disId +
                ", delStatus=" + delStatus +
                ", initial='" + initial + '\'' +
                ", byProId=" + byProId +
                ", byCitId=" + byCitId +
                ", byDisId=" + byDisId +
                '}';
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public Contacts(Integer id, String name, String userName, String password, String telephone, Date registrationDate, String sex, Date birthdayDate, String srcImg, Integer pid, Integer state, Integer proId, Integer citId, Integer disId, Integer delStatus, Pcd byProId, Pcd byCitId, Pcd byDisId) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.telephone = telephone;
        this.registrationDate = registrationDate;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.srcImg = srcImg;
        this.pid = pid;
        this.state = state;
        this.proId = proId;
        this.citId = citId;
        this.disId = disId;
        this.delStatus = delStatus;
        this.byProId = byProId;
        this.byCitId = byCitId;
        this.byDisId = byDisId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getSrcImg() {
        return srcImg;
    }

    public void setSrcImg(String srcImg) {
        this.srcImg = srcImg;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getCitId() {
        return citId;
    }

    public void setCitId(Integer citId) {
        this.citId = citId;
    }

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public Pcd getByProId() {
        return byProId;
    }

    public void setByProId(Pcd byProId) {
        this.byProId = byProId;
    }

    public Pcd getByCitId() {
        return byCitId;
    }

    public void setByCitId(Pcd byCitId) {
        this.byCitId = byCitId;
    }

    public Pcd getByDisId() {
        return byDisId;
    }

    public void setByDisId(Pcd byDisId) {
        this.byDisId = byDisId;
    }

}
