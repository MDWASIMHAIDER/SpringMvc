package com.nt.command;

import lombok.Data;

@Data
public class RegisterCommand {
	private String cName;
	private String cAddress;
	private String country;
	private String[] hobbies ;
	private String gender;
	private String[] products;
}
