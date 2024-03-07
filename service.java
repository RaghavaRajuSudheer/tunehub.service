package com.tunhub.service;


import com.tunhub.entity.tunhub;

public interface service {
	public String register(tunhub t) ;
	public boolean findemail(String email);
    public boolean login(String email,String password);
    public String getrole(String email);
	public tunhub getuser(String email);

}
