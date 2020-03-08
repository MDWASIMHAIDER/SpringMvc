package com.nt.command;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileCommand {
	private  String  jsName;
	private  String  jsDesg;
	private MultipartFile resumeFile;
	private MultipartFile photoFile;
}
