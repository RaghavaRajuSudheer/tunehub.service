package com.tunhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tunhub.entity.folder;

public interface folderservice {
	
	 public String addsong(folder f);
     public List<folder> get();
     public folder getfolder(String n);


}
