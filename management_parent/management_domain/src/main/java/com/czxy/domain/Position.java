package com.czxy.domain;

import javax.persistence.Id;

/**
 * 职位表
 */

public class Position {
@Id
  private Integer pid;//职位id
  private String pName;//职位名称
  private Integer state;//状态

    @Override
    public String toString() {
        return "Position{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", state=" + state +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Position() {
    }

    public Position(Integer pid, String pName, Integer state) {
        this.pid = pid;
        this.pName = pName;
        this.state = state;
    }
}
