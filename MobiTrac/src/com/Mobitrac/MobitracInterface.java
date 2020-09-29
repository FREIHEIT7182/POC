package com.Mobitrac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MobitracInterface {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
