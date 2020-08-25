package com.gongbu.bootJPA.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	
	@Id @GeneratedValue
	@Column(name = "USER_ID")
	private String id;
	
	private String password;
	private String nickName;
	private String name;
	private String phone;
	private String birth;
	private String email;
	
	@OneToMany
	private List<UserAccount> account;
	
	public List<UserAccount> getAccount() {
		return account;
	}
	
	public void setAccount(List<UserAccount> account) {
		this.account = account;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}	
}
