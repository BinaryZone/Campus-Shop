package com.wh.o2o.entity;

import java.util.Date;

public class Area {
	// ID
	private Integer areaId;
	// 名称
	private String areaName;
	// 权重	
	private Integer priority;
	// 创建时间
	private Date ceateTime;
	// 更新时间
	private Date lastEditTime;
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCeateTime() {
		return ceateTime;
	}
	public void setCeateTime(Date ceateTime) {
		this.ceateTime = ceateTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	@Override
	public String toString() {
		return "Area [areaId=" + areaId + ", areaName=" + areaName + ", priority=" + priority + ", ceateTime="
				+ ceateTime + ", lastEditTime=" + lastEditTime + "]";
	}
}
