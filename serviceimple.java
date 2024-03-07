package com.tunhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.entity.tunhub;
import com.tunhub.repository.tunhubrepository;
@Service
public class serviceimple implements service{
	
	@Autowired
	tunhubrepository r;

	@Override
	public String register(tunhub t) {
		r.save(t);
		return null;
	}

	@Override
	public boolean findemail(String email) {
		if(r.findByEmail(email)==null) {
		    return false;
		}else {
		   return true;
		}
	}

	@Override
	public boolean login(String email, String password) {
		tunhub t=r.findByEmail(email);
		if(t.getPassword().equals(password)) {
			return true;
		}
		else {
		    return false;
		}
	}

	@Override
	public String getrole(String email) {
		tunhub t=r.findByEmail(email);
		if(t.getRole().equals("Admin")) {
			return "adminhome";
		}else {
			if(t.isPrime()==true) {
			    return "user";
			}else {
				return "prime";
			}
		}
		
	}

	@Override
	public tunhub getuser(String email) {
		return r.findByEmail(email);
		
	}
	

}
