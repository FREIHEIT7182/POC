package com.Mobitrac;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MobiTracDao;
import com.dao.MobiTracImpl;
import com.model.UserLog;


public class SignUPImpl implements MobitracInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw;
		try {
			pw = response.getWriter();
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String mno = request.getParameter("mno");
			String password = request.getParameter("password");
			System.out.println(fname+""+lname+""+email+""+mno+""+password);

			MobiTracDao dao = new MobiTracImpl();
			UserLog u = new UserLog();
			u.setFirstName(fname);
			u.setLastname(lname);
			u.setEmail(email);
			u.setMno(mno);
			u.setPassword(password);
			
			
			if (dao.addDetails(u)) {
			System.out.println("USerDetials Inserted Successfully");
			response.sendRedirect("./SecondPage.html");
			} else {
				System.out.println("Please try Again!!");
				response.sendRedirect("./page.html");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
