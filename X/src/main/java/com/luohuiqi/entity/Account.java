package com.luohuiqi.entity;

/**
 * <p></p>
 *
 * @author luohuiqi
 * @date 2022/12/1 16:44
 */

public class Account {

	private String pwd;

	private String username;

	public String getPwd() {
		return pwd;
	}

	public Account setPwd(String pwd) {
		this.pwd = pwd;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public Account setUsername(String username) {
		this.username = username;
		return this;
	}
}
