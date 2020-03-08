package com.nt.command;

import lombok.Data;

@Data
public class UserCommand {
	private int userId;
	private String uName;
	private String address;
	private String email;
}
