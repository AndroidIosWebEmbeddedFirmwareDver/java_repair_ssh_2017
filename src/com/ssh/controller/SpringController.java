package com.ssh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssh.biz.impl.UserBaseInfoBizImpl;
import com.ssh.entity.UserBaseInfo;

/**
 * 
 * 类名称：SpringController 类描述：spring测试 
 * 
 * @version
 */
@Controller
@RequestMapping(value = "/spring")
public class SpringController {

	@Resource(name = "UserService")
	private UserBaseInfoBizImpl userBaseInfoBiz;

	/**
	 * 方法名：测试方法 
	 */
	@RequestMapping(value = "/test", method = { RequestMethod.POST, RequestMethod.GET })
	public String hello() {
		return "/test";
	}

	@RequestMapping(value = "/list", method = { RequestMethod.POST, RequestMethod.GET })
	public void userList() {
		List<UserBaseInfo> userBaseInfos = userBaseInfoBiz.findUserBaseInfo();
		if (userBaseInfos != null) {
			for (UserBaseInfo userBaseInfo : userBaseInfos) {
				System.out.println(userBaseInfo.toString());
//				System.out.println(userBaseInfo.getName());
			}
		}
	}

}
