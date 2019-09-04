package com.king.words.manual.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSON;
import com.king.words.Application;

@SpringBootTest(classes = Application.class)
public class UserServiceTest {
	
	@Autowired
	private ManualDao dbDao;
	
	@Test
	public void getSimpleUserInfo() {
		System.out.println(JSON.toJSON(dbDao.getSimpleUserInfo()));
	}
}
