package com.luohuiqi.entity;

/**
 * <p></p>
 *
 * @author luohuiqi
 * @date 2022/12/1 16:46
 */
public class User {

	private  String  id;

	private String gender;

	private Account account;

	public User(String id, String gender, Account account) {
		this.id = id;
		this.gender = gender;
		this.account = account;
	}


}
