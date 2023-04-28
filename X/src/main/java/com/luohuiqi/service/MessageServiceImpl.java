package com.luohuiqi.service;

/**
 * <p>信息实现</p>
 *
 * @author luohuiqi
 * @date 2023/4/26 11:26
 */
public class MessageServiceImpl  implements  MessageService{
	@Override
	public String send(Integer num) {
		return "你好，你收到的短信为"+num;
	}
}
