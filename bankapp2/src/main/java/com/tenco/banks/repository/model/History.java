package com.tenco.banks.repository.model;

import java.security.Timestamp;

import lombok.Data;

@Data
public class History {

	private Integer id;
	private Long amount;
	private Long wBalance;
	private Long dBalance;
	private Integer wAccountId;
	private Integer dAccountId;
	private Timestamp timestamp;
}
