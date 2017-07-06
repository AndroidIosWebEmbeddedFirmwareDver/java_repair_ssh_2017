package com.ssh.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user_base_info")
public class UserBaseInfo implements Serializable {

	private static final long serialVersionUID = -1948330516997216009L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private Integer status;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "create_time")
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append(this.getId()).append("--");
		stringBuffer.append(this.getName()).append("--");
		stringBuffer.append(this.getStatus()).append("--");
		stringBuffer.append(this.getCreateTime());
		return stringBuffer.toString();
	}
	


}