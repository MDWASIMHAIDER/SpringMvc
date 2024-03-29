package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.FileCommand;

@Controller
public class FileController {
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showForm(FileCommand cmd) {
		return "input_form";
	}
	
	@RequestMapping(value="/upload.htm",method=RequestMethod.POST)
	public String uploadFiles(Map<String,Object>map,@ModelAttribute("fcmd") FileCommand command,HttpServletRequest req) throws Exception {
		FileCommand cmd=command;
		InputStream is1=null,is2=null;
		OutputStream os1=null,os2=null;
		String fname1=null,fname2=null;
		ServletContext sc=null;
		File uploc=null;
		sc=req.getServletContext();
		uploc=new File(sc.getInitParameter("upload"));
		if(!uploc.exists()) {
			uploc.mkdir();
		}
		is1=cmd.getPhotoFile().getInputStream();
		is2=cmd.getResumeFile().getInputStream();
		fname1=cmd.getPhotoFile().getOriginalFilename();
		fname2=cmd.getResumeFile().getOriginalFilename();
		os1=new FileOutputStream(uploc.getAbsolutePath()+"/"+fname1);
		os2=new FileOutputStream(uploc.getAbsolutePath()+"/"+fname2);
		IOUtils.copy(is2, os1);
		IOUtils.copy(is2, os2);
		map.put("fname1", fname1);
		map.put("fname2", fname2);
		
		return "upload_success";
	}
}
