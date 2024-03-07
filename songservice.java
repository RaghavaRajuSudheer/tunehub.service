package com.tunhub.service;

import java.util.List;

import com.tunhub.entity.song;

public interface songservice {
	
	public String addsong(song s);
	
	public boolean validatesong(String name);
	
	public List<song> viewsong();
	
	public String updatesong(song s);
	
	public song getsong(String name);

}
