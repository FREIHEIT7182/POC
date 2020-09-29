package com.Mobitrac;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Page3")
public class Page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, MobitracInterface> map;
    public Page3() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	map = new HashMap<String, MobitracInterface>();
    	map.put("Login", new LoginImpl());
    	map.put("SignUp", new SignUPImpl());
    }
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	super.destroy();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	
    	String aName = request.getParameter("action");
    	System.out.println(aName);
    	MobitracInterface obj = map.get(aName);
    	try {
    		obj.execute(request,response);
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }

}
