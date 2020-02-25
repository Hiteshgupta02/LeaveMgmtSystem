/****************************************************
 * LeaveEntity.java
 *
 *	Date		Author					Remark
 *	19-Feb-2020	Hitesh Gupta        	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Hitesh Gupta
 *
 */

@Entity
@Table(name = "leave")
public class LeaveEntity extends AbstractEntity {
	
	@Column(name = "type")
	private Integer type;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "start_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name = "end_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "LeaveEntity [type=" + type + ", name=" + name + ", active=" + active + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
}
