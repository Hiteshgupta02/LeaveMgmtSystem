/****************************************************
 * AbstractEntity.java
 *
 *	Date		Author					Remark
 *	19-Feb-2020	Hitesh Gupta	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Hitesh Gupta
 *
 */

@MappedSuperclass
public class AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "version")
	@Temporal(TemporalType.TIMESTAMP)
	@Version
	private Date version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
