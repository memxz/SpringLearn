package com.hardes.pojo;

import java.util.Date;
import java.util.List;


public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date time;
    private String note;
    
    //订单明细集合
    private List<Orders_detail> detailList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Orders_detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Orders_detail> detailList) {
        this.detailList = detailList;
    }
}
