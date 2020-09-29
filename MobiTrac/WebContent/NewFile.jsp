<%@page import="com.model.UserLog"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.MobiTracImpl"%>
<%@page import="com.dao.MobiTracDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String email = request.getParameter("email");
String password = request.getParameter("password");

out.println(email+" "+password);

 	MobiTracDao dao = new MobiTracImpl();
 	ArrayList<UserLog> al = dao.listInfo();
 	for (UserLog b : al) {
 		if(b.getEmail().equals(email))
 		out.println(b.getFirstName());
 	}
 %>
