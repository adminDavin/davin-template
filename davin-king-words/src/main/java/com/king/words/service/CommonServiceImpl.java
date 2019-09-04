package com.king.words.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.king.words.dao.LoginInfoMapper;
import com.king.words.dao.UserInfoMapper;
import com.king.words.model.LoginInfo;
import com.king.words.model.LoginInfoExample;
import com.king.words.model.UserInfo;
import com.king.words.model.UserInfoExample;
import com.king.words.utils.DateTimeUtils;


@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private LoginInfoMapper loginInfoMapper;
	
	
	@Override
	public List<UserInfo> getUserList() {
		UserInfoExample example = new UserInfoExample();
		return userInfoMapper.selectByExample(example);
	}


	@Override
	public UserInfo login(String username, String password) throws LoginException {
		LoginInfoExample example = new LoginInfoExample();
		example.createCriteria().andLoginnameEqualTo(username).andPasswordEqualTo(password);
		List<LoginInfo> loginInfos = loginInfoMapper.selectByExample(example);
		if (loginInfos.isEmpty()) {
			throw new LoginException("username or password is invalid.");
		}
		LoginInfo loginInfo = loginInfos.get(0);
		return userInfoMapper.selectByPrimaryKey(loginInfo.getUserid());
	}


	@Override
	public UserInfo getUser(Integer userId) {
		return userInfoMapper.selectByPrimaryKey(userId);
	}

	public UserInfo getUserInfo(String email) {
		UserInfoExample userInfoExamle = new UserInfoExample();
		userInfoExamle.createCriteria().andEmailEqualTo(email);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExamle);
		if (userInfos.isEmpty()) {
			return null;
		} else {
			return userInfos.get(0);
		}
	}

	@Override
	@Transactional
	public UserInfo createrUser(String username, String loginName, String email, String password) throws Exception {
		UserInfo userInfo = getUserInfo(email);
		if (userInfo == null) {
			userInfo = new UserInfo();
			userInfo.setEmail(email);
			userInfo.setName(username);
			userInfo.setState(0);
			userInfo.setApplydate(DateTimeUtils.getCurrentDate());
			userInfoMapper.insert(userInfo);			
			userInfo = getUserInfo(email);
		} else {
			throw new Exception("email is exist now.");
		}
		LoginInfoExample loginInfoExample = new LoginInfoExample();
		loginInfoExample.createCriteria().andLoginnameEqualTo(loginName);
		List<LoginInfo> loginInfos = loginInfoMapper.selectByExample(loginInfoExample);
		if (loginInfos.isEmpty()) {
			LoginInfo record = new LoginInfo();
			record.setCreatedate(DateTimeUtils.getCurrentDate());
			record.setExpiredate(DateTimeUtils.getAfterYearsDate(10));
			record.setLoginname(loginName);
			record.setPassword(password);
			record.setUserid(userInfo.getUserid());
			record.setState(userInfo.getState());
			record.setUpdatedate(DateTimeUtils.getCurrentDate());
			loginInfoMapper.insert(record);
		} else {
			throw new Exception("login name is exist now.");
		}	
		return userInfo;
	}


	@Override
	public UserInfo updateUser(UserInfo userInfo, Integer userId, String loginName) {
		UserInfo updatingUserInfo = getUser(userId);
		updatingUserInfo.setBirthdate(userInfo.getBirthdate() == null? updatingUserInfo.getBirthdate(): userInfo.getBirthdate());
		updatingUserInfo.setAddress(StringUtils.isEmpty(userInfo.getAddress())? updatingUserInfo.getAddress(): userInfo.getAddress());
		updatingUserInfo.setName(StringUtils.isEmpty(userInfo.getName())? updatingUserInfo.getName(): userInfo.getName());
		updatingUserInfo.setNamepin(StringUtils.isEmpty(userInfo.getNamepin())? updatingUserInfo.getNamepin(): userInfo.getNamepin());
		updatingUserInfo.setOrganize(StringUtils.isEmpty(userInfo.getOrganize())? updatingUserInfo.getOrganize(): userInfo.getOrganize());
		updatingUserInfo.setPhone(StringUtils.isEmpty(userInfo.getPhone())? updatingUserInfo.getPhone(): userInfo.getPhone());
		updatingUserInfo.setRemark(StringUtils.isEmpty(userInfo.getRemark())? updatingUserInfo.getRemark(): userInfo.getRemark());
		updatingUserInfo.setState(StringUtils.isEmpty(userInfo.getSex())? updatingUserInfo.getSex(): userInfo.getSex());
		updatingUserInfo.setZoneqq(StringUtils.isEmpty(userInfo.getZoneqq())? updatingUserInfo.getZoneqq(): userInfo.getZoneqq());
		userInfoMapper.updateByPrimaryKey(updatingUserInfo);
		return updatingUserInfo;
	}


	@Override
	public UserInfo modifyManager(Integer userId, Integer managerId, Integer[] roleIds) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserInfo manageRoleList(Integer managerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
