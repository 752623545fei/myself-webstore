package org.webstore.entity;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private String password;
	private String nickname;
	private Long phone;
	private String email;
	private String realName;
	private String idCardNumber;
	private Date birthday;
	private String headImg;
	private Integer tradeCount;

	public User() {
	}

	public User(Integer id, String name, String password, String nickname, long phone, String email, String realName, String idCardNumber, Date birthday, String headImg, Integer tradeCount) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.nickname = nickname;
		this.phone = phone;
		this.email = email;
		this.realName = realName;
		this.idCardNumber = idCardNumber;
		this.birthday = birthday;
		this.headImg = headImg;
		this.tradeCount = tradeCount;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(Integer tradeCount) {
		this.tradeCount = tradeCount;
	}
}
