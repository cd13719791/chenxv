package com.school.core;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletWebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	private Logger logger = LoggerFactory
			.getLogger(GlobalExceptionHandler.class);

	/**
	 * 系统异常处理，比如：404,500
	 * 
	 * @param req
	 * @param resp
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public void defaultErrorHandler(HttpServletRequest request, Exception e)
			throws Exception {
		System.out.println("404");
		logger.error("", e);

		if (e instanceof RuntimeException) {
			// 404
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/index.html");
			HttpServletResponse resp = ((ServletWebRequest) RequestContextHolder
					.getRequestAttributes()).getResponse();
			dispatcher.forward(request, resp);
		}
	}
}
