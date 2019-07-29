package com.czxy.domain;

import javax.persistence.Id;
import java.util.Date;

/**
 * -- 联系方式
 */
public class Contacts {
 @Id
    private Integer id;          //编号
    private String name;      // 姓名
    private String userName;  //登录名称
    private String password; //登录密码
    private String telephone;   //联系方式
    private Date registrationDate; //注册时间
    private Date birthdayDate;//生日
    private String srcImg;  //头像
    private Integer pid; //职位id
    private Integer state; //状态
    private Integer proId; //省份 id
    private Integer citId; //城市 id
    private Integer disId; //区县 id

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", registrationDate=" + registrationDate +
                ", birthdayDate=" + birthdayDate +
                ", srcImg='" + srcImg + '\'' +
                ", pid=" + pid +
                ", state=" + state +
                ", proId=" + proId +
                ", citId=" + citId +
                ", disId=" + disId +
                '}';
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

    public Contacts() {
    }

    public Contacts(Integer id, String name, String userName, String password, String telephone, Date registrationDate, Date birthdayDate, String srcImg, Integer pid, Integer state, Integer proId, Integer citId, Integer disId) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.telephone = telephone;
        this.registrationDate = registrationDate;
        this.birthdayDate = birthdayDate;
        this.srcImg = srcImg;
        this.pid = pid;
        this.state = state;
        this.proId = proId;
        this.citId = citId;
        this.disId = disId;
    }
}
