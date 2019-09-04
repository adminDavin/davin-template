package com.king.words.dao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.king.words.Application;
import com.king.words.model.UserInfoExample;

@SpringBootTest(classes = Application.class)
public class UserInfoMapperTest {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Test
    void runTest() {
		long count = userInfoMapper.countByExample(new UserInfoExample());
		System.out.println(count);
    }
}
