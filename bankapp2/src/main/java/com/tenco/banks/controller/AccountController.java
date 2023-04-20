package com.tenco.banks.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.banks.handler.exception.UnAuthorizedException;
import com.tenco.banks.repository.model.User;

@Controller
@RequestMapping("/account")
public class AccountController {

	private HttpSession session;
	
	@GetMapping({"list","/"})
	public String list() {
		User principal = (User)session.getAttribute("principal");
	if (principal == null) {
		throw new UnAuthorizedException("인증이 안된 사용자입니다.",HttpStatus.UNAUTHORIZED);
	}
		
	return "account/list";
	}
	
	@PostMapping("/save-proc")
	public String save() {
		User user = (User)session.getAttribute("principal");
		if (user == null) {
			throw new UnAuthorizedException("로그인 먼저 해주세요", HttpStatus.UNAUTHORIZED);
		}
		return "/account/saveForm";
	}
	
	@PostMapping("/save-proc")
	public String saveProc() {
		User user = (User)session.getAttribute("principal");
		if (user == null) {
			throw new UnAuthorizedException("로그인 먼저 해주세요", HttpStatus.UNAUTHORIZED);
		}
		return "redirect:/account/list";
	}
	
	
	
	
	
}
