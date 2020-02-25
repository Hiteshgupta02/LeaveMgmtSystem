/****************************************************
 * RoleEntity.java
 *
 *	Date		Author					Remark
 *	19-Feb-2020	Hitesh Gupta			Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Hitesh Gupta
 *
 */

@Entity
@Table(name = "role")
public class RoleEntity extends AbstractEntity {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "desc")
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
