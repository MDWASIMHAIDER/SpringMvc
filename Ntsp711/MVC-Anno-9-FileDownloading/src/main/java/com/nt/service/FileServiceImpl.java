package com.nt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("service")
public class FileServiceImpl implements FileService {

	@Override
	public List<String> fetchFileList(String location) {
		List<String>flist=null;
		File floc=null;
		File[] files=null;
		flist=new ArrayList();
		floc=new File(location);
		if(floc.exists()) {
			files=floc.listFiles();
			for(File f:files) {
				if(f.isFile()) {
					flist.add(f.getName());
				}
			}
			
		}
		return flist;
	}

}
