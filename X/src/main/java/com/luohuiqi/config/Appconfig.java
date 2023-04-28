package com.luohuiqi.config;

import com.luohuiqi.entity.Account;
import com.luohuiqi.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p></p>
 *
 * @author luohuiqi
 * @date 2022/12/1 16:42
 */
@Configuration
@ComponentScan("com.luohuiqi.*")
public class Appconfig {

	@Bean
	public Account account(){
		return  new Account().setPwd("aaa").setUsername("bbb");
	}

	@Bean
	public User user(Account account){
		return new User("a","b",account);
	}

}
