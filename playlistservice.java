package com.tunhub.service;
import java.util.List;

import com.tunhub.entity.playlist;

public interface playlistservice {
	public String addplaylist(playlist p);
	public List<playlist> viewplaylist();


}
