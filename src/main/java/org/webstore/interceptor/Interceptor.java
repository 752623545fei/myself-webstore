package org.webstore.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.webstore.entity.User;

public class Interceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		String pathString = arg0.getRequestURI();
		arg0.setAttribute("url", pathString);
		System.out.println(pathString);
		User user = (User)arg0.getSession().getAttribute("user");
		System.out.println(user);
		if (user == null) {
			arg0.getRequestDispatcher("/webstore/login").forward(arg0, arg1);
			return false;
		}
		return true;
	}

}
