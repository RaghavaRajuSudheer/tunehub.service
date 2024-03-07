package com.tunhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.entity.playlist;
import com.tunhub.repository.playlistrepository;
@Service
public class playlistserimp implements playlistservice{
	@Autowired
	playlistrepository r;

	@Override
	public String addplaylist(playlist p) {
		r.save(p);
		return null;
	}

	@Override
	public List<playlist> viewplaylist() {
		
		return r.findAll();
	}

}
