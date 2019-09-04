package com.king.words.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.king.words.model.UserInfo;

public interface CommonService {
	public List<UserInfo> getUserList();
	public UserInfo login(String username, String password) throws LoginException;
	public UserInfo getUser(Integer userId);
	public UserInfo createrUser(String username, String loginName, String email, String password) throws Exception;
	public UserInfo updateUser(UserInfo userInfo, Integer userId, String loginName);
	public UserInfo modifyManager(Integer userId, Integer managerId, Integer[] roleIds);
	public UserInfo manageRoleList(Integer managerId);
}
