package com.wh.o2o.entity;

import java.util.Date;

public class WechatAuth {
	private Long wecharAuthId;
	private String openId;
	private Date creatTime;
	private PersonInfo personInfo;
	public Long getWecharAuthId() {
		return wecharAuthId;
	}
	public void setWecharAuthId(Long wecharAuthId) {
		this.wecharAuthId = wecharAuthId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
}
