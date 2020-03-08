package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.service.FileService;

@Controller
public class FileDownloadController {
	@Autowired
	private FileService service;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showHome(Map<String,Object>map,HttpServletRequest req) {
		ServletContext sc=null;
		String location=null;
		List<String>filelist=null;
		sc=req.getServletContext();
		location=sc.getInitParameter("dlocation");
		filelist=service.fetchFileList(location);
		map.put("filelist", filelist);
		return "downloadPage";
	}
	
	@RequestMapping("/download.htm")
	public void download(@RequestParam("fname")String fileName,HttpServletRequest req,HttpServletResponse res) throws Exception {
		ServletContext sc=null;
		InputStream is=null;
		OutputStream os=null;
		File file=null;
		String location=null;
		sc=req.getServletContext();
		location=sc.getInitParameter("dlocation");
		file=new File(location+"/"+fileName);
		res.setContentLengthLong(file.length());
		res.setContentType(sc.getMimeType(location)+"/"+fileName);
		res.addHeader("Content-Disposition","attachment;fileName="+fileName);
		is=new FileInputStream(file);
		os=res.getOutputStream();
		IOUtils.copy(is, os);
		is.close();
		os.close();
	}
}
