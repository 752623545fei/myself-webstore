package org.webstore.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.webstore.entity.Area;
import org.webstore.service.CommonService;

@Controller
@RequestMapping("/common")
public class CommonController {

	@Autowired
	CommonService commonService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/area")
	public String goArea(){
		return "area";
	}
	
	
	@RequestMapping(value="/area/first",method=RequestMethod.POST,
					produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<Area> queryFirstArea(){
		String string = request.getParameter("parent");
		int parent = Integer.valueOf(string.trim());
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		List<Area> list = commonService.queryAreaByParentId(parent);
		return list;
	}
	
	@RequestMapping(value="/area/other",method=RequestMethod.GET,
			produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<Area> queryOtherArea() throws UnsupportedEncodingException{
		String parent = request.getParameter("parent");
		parent = new String(parent.getBytes("iso8859-1"), "utf-8");
		System.out.println("------------------------");
		System.out.println(parent);
		Area area = commonService.queryAreaByParentName(parent);
		int parentId = area.getAreaNo();
		List<Area> list = commonService.queryAreaByParentId(parentId);
		return list;
	}
}
