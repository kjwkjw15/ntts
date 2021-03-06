package com.ty.sms.entity;

import java.io.IOException;

import javax.persistence.*;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private int id;
	private String userName;
	private String passWord;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public User(){
		System.out.println("fuck User");
	}
	
	public String toString() {
		System.out.println("====toString====");
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	public User(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}	
}
