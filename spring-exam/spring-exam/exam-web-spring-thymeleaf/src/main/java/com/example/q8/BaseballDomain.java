package com.example.q8;

import java.util.Date;

public class BaseballDomain {
	private Integer id;
	private String name;
	private String stadiumName;
	private Date establishedDate;
	public BaseballDomain() {}
	
	public BaseballDomain(Integer id, String name, String stadiumName, Date establishedDate) {
		super();
		this.id = id;
		this.name = name;
		this.stadiumName = stadiumName;
		this.establishedDate = establishedDate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}
}
