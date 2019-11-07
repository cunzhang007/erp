package com.xkit.pojo;


import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class Orders {

  private Integer id;
  private Date createtime;
  private Date checktime;
  private Date starttime;
  private Date endtime;
  private String type;
  private long creater;
  private long checker;
  private long starter;
  private long ender;
  private long supplierId;
  private double totalmoney;
  private String state;
  private long waybillsn;


  public Orders(Integer id, Date createtime, Date checktime, Date starttime, Date endtime, String type, long creater, long checker, long starter, long ender, long supplierId, double totalmoney, String state, long waybillsn) {
    this.id = id;
    this.createtime = createtime;
    this.checktime = checktime;
    this.starttime = starttime;
    this.endtime = endtime;
    this.type = type;
    this.creater = creater;
    this.checker = checker;
    this.starter = starter;
    this.ender = ender;
    this.supplierId = supplierId;
    this.totalmoney = totalmoney;
    this.state = state;
    this.waybillsn = waybillsn;
  }

  public Orders() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Date getChecktime() {
    return checktime;
  }

  public void setChecktime(Date checktime) {
    this.checktime = checktime;
  }

  public Date getStarttime() {
    return starttime;
  }

  public void setStarttime(Date starttime) {
    this.starttime = starttime;
  }

  public Date getEndtime() {
    return endtime;
  }

  public void setEndtime(Date endtime) {
    this.endtime = endtime;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getCreater() {
    return creater;
  }

  public void setCreater(long creater) {
    this.creater = creater;
  }

  public long getChecker() {
    return checker;
  }

  public void setChecker(long checker) {
    this.checker = checker;
  }

  public long getStarter() {
    return starter;
  }

  public void setStarter(long starter) {
    this.starter = starter;
  }

  public long getEnder() {
    return ender;
  }

  public void setEnder(long ender) {
    this.ender = ender;
  }

  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }

  public double getTotalmoney() {
    return totalmoney;
  }

  public void setTotalmoney(double totalmoney) {
    this.totalmoney = totalmoney;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public long getWaybillsn() {
    return waybillsn;
  }

  public void setWaybillsn(long waybillsn) {
    this.waybillsn = waybillsn;
  }
}
