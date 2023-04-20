package com.tenco.banks.handler.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class UnAuthorizedException extends RuntimeException {

	private HttpStatus status;
	
	public UnAuthorizedException(String meesage, HttpStatus status) {
	super(meesage);
	this.status = status;
	}
}
