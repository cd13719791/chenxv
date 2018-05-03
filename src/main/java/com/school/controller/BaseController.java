package com.school.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.core.ApiResult;
import com.school.core.GlobalExceptionHandler;
import com.school.core.Response;

@RestController
@RequestMapping("/")
public class BaseController {
	private Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping("/test")
	public Object test() {
		throw new RuntimeException("aaaaa");
		// return "index";
	}

	@RequestMapping("/index")
	public String index() {
		return "redirect:/index.html";
	}
	/**
	 * 登录接口
	 * @param map
	 * @return
	 */
	@RequestMapping("/login")
	public ApiResult login(HttpServletRequest req,@RequestBody Map<String,Object> map){
			Object account=map.get("account");
			Object password=map.get("password");
		if(StringUtils.isEmpty(account) ){
			logger.debug("账号为空");
		}else if(StringUtils.isEmpty(password) ){
			logger.debug("密码为空");
		}else{
			req.setAttribute("userId", 1);
			return new ApiResult(Response.SUCCESS,"成功", null);
		}
		return new ApiResult(Response.ERRO,"请不要皮。。", null);
	}
	/**
	 * 注册逻辑
	 * @param req
	 * @param map
	 * @return
	 */
	@RequestMapping("/register")
	public ApiResult register(HttpServletRequest req,@RequestBody Map<String,Object> map){
			Object account=map.get("account");
			Object password=map.get("password");
		if(StringUtils.isEmpty(account) ){
			logger.debug("账号为空");
		}else if(StringUtils.isEmpty(password) ){
			logger.debug("密码为空");
		}else{
			req.setAttribute("userId", 1);
			return new ApiResult(Response.SUCCESS,"成功", null);
		}
		return new ApiResult(Response.ERRO,"请不要皮。。", null);
	}
}
