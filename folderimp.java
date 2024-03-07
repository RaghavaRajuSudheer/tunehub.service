package com.tunhub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.entity.folder;
import com.tunhub.repository.repository;
@Service
public class folderimp implements folderservice{
	@Autowired
	repository r;

	@Override
	public String addsong(folder f) {
		r.save(f);
		return null;
	}

	@Override
	public List<folder> get() {
		List<folder> f=r.findAll();
		return f;
	}

	@Override
	public folder getfolder(String n) {
		folder f=r.findById(n).get();
		return f;
	}

}
