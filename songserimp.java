package com.tunhub.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tunhub.entity.song;
import com.tunhub.entity.tunhub;
import com.tunhub.repository.songrepository;

@Service
public class songserimp implements songservice{
	
	@Autowired
	songrepository r;

	@Override
	public String addsong(song s) {
	    r.save(s);
		return "songsuccess";
	}

	@Override
	public boolean validatesong(String name) {
		
		if(r.findByName(name)==null){
		     return true;
		}else {
			return false;
		}
	}

	@Override
	public List<song> viewsong() {
		
		return r.findAll();
	}

	@Override
	public String updatesong(song s) {
		r.save(s);
		return null;
	}

	@Override
	public song getsong(String name) {
		song s=r.findByName(name);
		return s;
	}
	

	
	
	

}
