package com.dao;

import java.util.ArrayList;


import com.model.UserLog;

public interface MobiTracDao {
	public boolean addDetails(UserLog u);
	public ArrayList<UserLog> listInfo();
}
