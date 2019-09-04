package com.king.words.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.king.words.dao.AuthInfoMapper;
import com.king.words.dao.RoleInfoMapper;
import com.king.words.dao.UserInfoMapper;
import com.king.words.model.AuthInfo;
import com.king.words.model.RoleInfo;
import com.king.words.model.UserInfo;
import com.king.words.model.UserInfoExample;
import com.king.words.response.handler.ResponseUtils;
import com.king.words.service.CommonService;
import com.king.words.utils.DateTimeUtils;
import com.king.words.utils.UserStatus;

@RestController
@RequestMapping("/kw")
public class KingWordsController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CommonService commonService;

	@Autowired
	private AuthInfoMapper authInfoMapper;
	
	@Autowired
	private RoleInfoMapper roleInfoMapper;
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	/**
	 * 展示所有用户
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/users")
	public ResponseEntity<JSONObject> listUsers(HttpServletRequest request) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		List<UserInfo> list = commonService.getUserList();
		return builder.body(ResponseUtils.getResponseBody(list));
	}

	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public ResponseEntity<JSONObject> login(@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "password", required = true) String password) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo userInfo = commonService.login(username, password);
		return builder.body(ResponseUtils.getResponseBody(userInfo));
	}

	/**
	 * 获取用户信息
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/user/{userId}")
	public ResponseEntity<JSONObject> getUser(@PathVariable Integer userId) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo userInfo = commonService.getUser(userId);
		return builder.body(ResponseUtils.getResponseBody(userInfo));
	}

	/**
	 * 更新用户信息
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(path = "/user/{userId}/update", method = RequestMethod.POST)
	public ResponseEntity<JSONObject> update(@PathVariable Integer userId,
			@RequestParam(name = "loginName", required = true) String loginName, @RequestBody UserInfo userInfo)
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo updatedUserInfo = commonService.updateUser(userInfo, userId, loginName);
		return builder.body(ResponseUtils.getResponseBody(updatedUserInfo));
	}

	/**
	 * 注册用户
	 * 
	 * @param username
	 * @param loginName
	 * @param email
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/user/register")
	public ResponseEntity<JSONObject> register(@RequestParam(name = "email", required = true) String email,
			@RequestParam(name = "password", required = true) String password) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo userInfo = commonService.createrUser(email, email, email, password);
		return builder.body(ResponseUtils.getResponseBody(userInfo));
	}

	/**
	 * 管理员列表
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager/list")
	public ResponseEntity<JSONObject> listManager()
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andStateEqualTo(UserStatus.MANAGER.getValue());
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		return builder.body(ResponseUtils.getResponseBody(userInfos));
	}

	/**
	 * 添加管理员
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager/{managerId}/add/{userId}")
	public ResponseEntity<JSONObject> createManager(@PathVariable Integer managerId, @PathVariable Integer userId)
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
		userInfo.setState(UserStatus.MANAGER.getValue());
		userInfo.setAcceptdate(DateTimeUtils.getCurrentDate());
		userInfo.setAccepterid(managerId);
		userInfoMapper.updateByPrimaryKey(userInfo);
		return builder.body(ResponseUtils.getResponseBody(userInfo));
	}

	/**
	 * 管理员获取用户列表
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager/{managerId}/user")
	public ResponseEntity<JSONObject> manageUserList(@PathVariable Integer managerId)
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andAccepteridEqualTo(managerId);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		return builder.body(ResponseUtils.getResponseBody(userInfos));
	}

	/**
	 * 管理员对用户进行管理
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager/{managerId}/user/{userId}")
	public ResponseEntity<JSONObject> manageUser(@PathVariable Integer managerId, @PathVariable Integer userId,
			@RequestParam(name = "status", required = true) String status)
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		int userstatus = UserStatus.auditStatus(status);
		if (userstatus < 0) {
			throw new Exception("status is invalid, only is auditing,unaudit,agree,reject");
		}
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
		userInfo.setState(userstatus);
		userInfo.setAcceptdate(DateTimeUtils.getCurrentDate());
		userInfo.setAccepterid(managerId);
		userInfoMapper.updateByPrimaryKey(userInfo);
		return builder.body(ResponseUtils.getResponseBody(userInfo));
	}

	
	/**
	 * 修改管理员角色
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager/{userId}/modify")
	public ResponseEntity<JSONObject> modifyManager(@PathVariable Integer userId, @RequestParam(name = "managerId", required = true) Integer managerId, @RequestParam(name = "roleIds", required = true) Integer[] roleIds)
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo updatedUserInfo = commonService.modifyManager(userId, managerId, roleIds);
		return builder.body(ResponseUtils.getResponseBody(updatedUserInfo));
	}

	
	/**
	 * 管理员的角色列表
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager/{managerId}/role")
	public ResponseEntity<JSONObject> manageRoleList(@PathVariable Integer managerId)
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UserInfo updatedUserInfo = commonService.manageRoleList(managerId);
		return builder.body(ResponseUtils.getResponseBody(updatedUserInfo));
	}


	/**
	 * 角色列表
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/role")
	public ResponseEntity<JSONObject> roleList()
			throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		List<RoleInfo> roleInfos = roleInfoMapper.selectByExample(null);
		return builder.body(ResponseUtils.getResponseBody(roleInfos));
	}

	/**
	 * 权限解表
	 * 
	 * @param userId
	 * @param loginName
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/auth")
	public ResponseEntity<JSONObject> authList() throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		List<AuthInfo> authInfos = authInfoMapper.selectByExample(null);
		return builder.body(ResponseUtils.getResponseBody(authInfos));
	}
}
