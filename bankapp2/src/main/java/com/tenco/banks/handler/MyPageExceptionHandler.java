package com.tenco.banks.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.tenco.banks.handler.exception.CustomPageException;

@ControllerAdvice
public class MyPageExceptionHandler {

	@ExceptionHandler(CustomPageException.class)
	public ModelAndView handleTuntimePageException(CustomPageException e) {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("statusCode",HttpStatus.NOT_FOUND);
	modelAndView.addObject("message",e.getMessage());
	return modelAndView;
	}
}
