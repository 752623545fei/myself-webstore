package org.webstore.web;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.webstore.entity.Goods;
import org.webstore.entity.User;
import org.webstore.enums.GoodsTypeEnum;
import org.webstore.service.GoodService;
import org.webstore.service.GoodServiceImpl;

import ch.qos.logback.core.util.FileUtil;

@Controller
@RequestMapping("/webstore")
public class GoodsController {

	@Autowired
	GoodService goodService;
	
	@Autowired  
	private  HttpServletRequest request;  
	
	@Autowired
	private HttpServletResponse response;
	
	
	@RequestMapping(value="/gettype",method=RequestMethod.GET,
					produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public List<String> getType(){
		List<String> typeList = GoodsTypeEnum.getTypeEnum();
		return typeList;
	}
	
	@RequestMapping(value="/goodlist")
	public String goList() throws UnsupportedEncodingException{
		/*request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");*/
		return "goods";
	}
	
	@RequestMapping(value="/index")
	public String index(Model model) throws UnsupportedEncodingException{
		/*request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");*/
		
		return "index";
	}
	
	@RequestMapping(value="/search")
	public String serach(Model model) throws UnsupportedEncodingException{
		/*request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("UTF-8");*/
		String search = request.getParameter("search");
		search = new String(search.getBytes("iso8859-1"), "utf-8");
		Long pageCount = goodService.queryPageCount(search);
		System.out.println(pageCount);
		model.addAttribute("pageCount", pageCount);
		String page = request.getParameter("currentPage");
		if (page==null) {
			model.addAttribute("currentPage",1);
		}else{
			model.addAttribute("currentPage",page);
		}
		model.addAttribute("search", search);
		return "goods";
	}
	
	

	@RequestMapping(value="/query",method=RequestMethod.POST,
					produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<Goods> getGoodList() throws UnsupportedEncodingException{
		/*request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");*/
		String search = request.getParameter("search");
		int currentPage = Integer.valueOf(request.getParameter("currentPage"));
		System.out.println("============="+search);
		List<Goods> goods = goodService.queryList(search,currentPage);
		return goods;
		
	}
	/*@RequestMapping(value="/list")
	public String goodsList(Model model) {
		List<Goods> goodList = goodService.queryAll();
		
		model.addAttribute("goodList", goodList);
		System.out.println(goodList);
		
		return "goodList";
	}*/
	
	/*@RequestMapping(value="/addGood",method = RequestMethod.POST,
					produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String addGood(Goods good,@RequestParam("imgFile")MultipartFile file) throws IOException {
		System.out.println(good);
		String fileName = file.getOriginalFilename();
		String path = request.getSession().getServletContext().getRealPath("/");
		System.out.println(path);
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		if (!file.isEmpty() && fileName.contains(".jpg")) {
			long start = new Date().getTime();
			String md5 = DigestUtils.md5DigestAsHex(file.getBytes());
			long end = new Date().getTime();
			System.out.println(end - start);
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path+"/img", md5+".jpg"));
			good.setGoodsImageSource("/WebStore/img/" + md5+".jpg");
			int typeId = GoodsTypeEnum.typeOf(good.getGoodsTypeName()).getTypeId();
			good.setGoodsTypeId(typeId);
			goodService.addGood(good);
			return "添加成功";
		}else {
			return "添加失败";
		}
	}*/

	
	
	
}
