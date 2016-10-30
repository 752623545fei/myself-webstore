package org.webstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.webstore.entity.Goods;
import org.webstore.entity.User;
import org.webstore.enums.GoodsTypeEnum;
import org.webstore.service.GoodService;
import org.webstore.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired  
	private  HttpServletRequest request;  
	
	@Autowired
	private HttpServletResponse response;


	
	@RequestMapping(value="/register/deal",method=RequestMethod.POST)
	public String registerDeal(User user) {
		userService.addOneUser(user);
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login/deal",method=RequestMethod.POST)
	public String loginDeal(User user){
		String message = userService.login(user);
		if (message.equals("登录成功！")) {
			request.getSession().setAttribute("user", userService.queryUser(user));
			userService.writeCommonIp(user,request.getRemoteAddr());
			return "redirect:/webstore/index";
		}else {
			request.setAttribute("error", message);
			return "login";
		}
		
	}
	//login
	@RequestMapping(value="/login/cookie",method = RequestMethod.POST,
                    produces = {"application/json;charset=UTF-8"})
    @ResponseBody
	public User cookieLogin(){
        System.out.println("================");
        System.out.println("cookieLogin");
        User sessionUser = (User) request.getSession().getAttribute("user");
        if (sessionUser != null){
			System.out.println(sessionUser);
			return sessionUser;
        }
        User user = new User();
        user.setName(request.getParameter("userName"));
        user.setPassword(request.getParameter("password"));
        String ip = request.getRemoteAddr();
        if (userService.cookieLogin(user,ip)){
            String result = userService.login(user);
            if (result.equals("登录成功！")) {
                User resultUser = userService.queryUser(user);
                request.getSession().setAttribute("user", resultUser);
                return resultUser;
            }else {
                request.setAttribute("error", result);
                return null;
            }
        }else {
            return null;
        }
    }



	
	
}
