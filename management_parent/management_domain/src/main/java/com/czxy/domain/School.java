package com.czxy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 学校
 */
@Entity
public class School {
    @Id
    private Integer schId; //学校id
    private String schName; //学校名称
    private Integer proId;//省市id
    private Integer citId;//城市id
    private Integer disId;//县区

    @Override
    public String toString() {
        return "School{" +
                "schId=" + schId +
                ", schName='" + schName + '\'' +
                ", proId=" + proId +
                ", citId=" + citId +
                ", disId=" + disId +
                '}';
    }

    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
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

    public School() {
    }

    public School(Integer schId, String schName, Integer proId, Integer citId, Integer disId) {
        this.schId = schId;
        this.schName = schName;
        this.proId = proId;
        this.citId = citId;
        this.disId = disId;
    }
}
