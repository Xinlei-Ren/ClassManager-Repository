package com.czxy.domain;


import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Chat {
@Id
  private Integer id;
  @Column(name = "received_id")
  private Integer receivedId;
  private String content;
  @Column(name = "`current_date`")
  private Date currentDate;

  @Override
  public String toString() {
    return "Chat{" +
            "id=" + id +
            ", receivedId=" + receivedId +
            ", content='" + content + '\'' +
            ", currentDate=" + currentDate +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getReceivedId() {
    return receivedId;
  }

  public void setReceivedId(Integer receivedId) {
    this.receivedId = receivedId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(Date currentDate) {
    this.currentDate = currentDate;
  }

  public Chat() {
  }

  public Chat(Integer id, Integer receivedId, String content, Date currentDate) {
    this.id = id;
    this.receivedId = receivedId;
    this.content = content;
    this.currentDate = currentDate;
  }
}
