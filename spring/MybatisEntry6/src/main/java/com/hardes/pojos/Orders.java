package com.hardes.pojos;

import java.util.Date;
import java.util.List;


public class Orders {
    private Integer oid;
    private Integer user_id;
    private String number;
    private Date time;
    private String note;
   // private Users users;
    
    //订单明细集合
   // private List<Orders_detail> detailList;


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", user_d=" + user_id +
                ", number='" + number + '\'' +
                ", time=" + time +
                ", note='" + note + '\'' +
                '}';
    }
}
