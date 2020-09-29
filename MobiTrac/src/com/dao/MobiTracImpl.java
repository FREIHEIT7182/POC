package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.UserLog;



public class MobiTracImpl implements MobiTracDao{
	public boolean addDetails(UserLog u) {
		boolean b = false;
		Connection con = ConnectionFactory.createConnection();
		System.out.println(con + "Connected SuccessFully!!");
		try {
			PreparedStatement pst = con.prepareStatement("insert into userSign values(?,?,?,?,?)");
			pst.setString(1, u.getFirstName());
			pst.setString(2, u.getLastname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getMno());
			pst.setString(5, u.getPassword());

			int res = pst.executeUpdate();
			if (res > 0) {
				b = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return b;

	}

	@Override
	public ArrayList<UserLog> listInfo() {
		Connection con = ConnectionFactory.createConnection();
		System.out.println("connected " + con);
		ArrayList<UserLog> al = new ArrayList<UserLog>();
		try {
			PreparedStatement pst = con.prepareStatement("select * from userSign");
			ResultSet res = pst.executeQuery();
			while (res.next()) {
				UserLog a = new UserLog(res.getString(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5));
				al.add(a);
			}
			System.out.println(al);
		} catch (Exception e) {

			System.out.println(e);
		}
		return al;
	}
	
}
