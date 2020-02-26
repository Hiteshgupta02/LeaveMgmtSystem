package com.abc.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Leave {
	
	private Long Id;
	
	@NotNull
	private Integer type;
	
	@NotEmpty
	private String name;
	
	@NotNull
	private Boolean active;
	
	@NotNull
	private Date startDate;
	
	@NotNull
	private Date endDate;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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
		return "Leave [Id=" + Id + ", type=" + type + ", name=" + name + ", active=" + active + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

}
