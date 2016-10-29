package test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.webstore.dao.AreaDao;
import org.webstore.dao.GoodsDao;
import org.webstore.dao.UserDao;
import org.webstore.entity.Area;
import org.webstore.entity.GoodClass;
import org.webstore.entity.Goods;
import org.webstore.entity.User;
import org.webstore.service.GoodService;
import org.webstore.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class DaoTest {

	@Resource
	GoodsDao dao;
	
	@Resource
	AreaDao areaDao;

	@Resource
	UserDao userDao;

	@Resource
	GoodService service;

	@Resource
	UserService userService;

	@Test
	public void testasdasd(){
		userDao.addCommonIp("1","192.168.0.1");
	}

	@Test
	public void testArea(){
		User user = new User();
		user.setName("752623545fei");
		user.setPassword("qazwsx123");
		userService.writeCommonIp(user,"127.0.0.1");

	}
	
	@Test
	public void testQuery(){
		
		Long page = service.queryPageCount("女装");
		System.out.println(page);
	}
	
	@Test
	public void testDao(){
		long list = dao.queryListCount("123");
		System.out.println(list);
	}
	
	@Test
	public void test() throws IOException {//15:30:00开始
		for (int i = 2; i < 2053; i++) {
			//long start = new Date().getTime();
			//List<Goods> list = new ArrayList<Goods>();
			GoodClass goodClass = dao.queryClass(i);
			System.out.println(goodClass);
			System.out.println(i);
				/*for (int j = 1; j < 501; j++) {
					Goods good = new Goods();//48:30
					String title1 = goodClass.toString();
					String title2 = String.format("%04d", j);
					String title = title1 + title2;
					//System.out.println(title);
					good.setTitle(title);
					good.setCid(i);
					//System.out.println(i);
					Long sellerCids = (long) (1+Math.random()*(5000));
					
					//System.out.println(sellerCids);
					good.setSellerCids(sellerCids);
					good.setLocationState("河北");
					good.setLocationCity("邯郸");
					double price = 1+Math.random()*(5000);
					good.setPrice(price);
					Integer num = (int) (10+Math.random()*(100));
					good.setNum(num * 100);
					short freight = (short) (Math.random()*(4));
					good.setFreightPayer(freight);
					System.out.println(freight);
					if (freight == 0) {
						good.setEmsFee((short)12);
						good.setPostFee((short)0);
						good.setExpressFee((short)0);
					}
					if (freight == 1) {
						good.setEmsFee((short)0);
						good.setPostFee((short)8);
						good.setExpressFee((short)0);
					}
					if (freight == 2) {
						good.setEmsFee((short)0);
						good.setPostFee((short)0);
						good.setExpressFee((short)10);
					}
					if (freight == 3) {
						good.setEmsFee((short)0);
						good.setPostFee((short)0);
						good.setExpressFee((short)0);
					}
					Random r = new Random();
					
					good.setHasInvoice(r.nextBoolean());
					good.setHasWarranty(r.nextBoolean());
					good.setNewprepay(r.nextBoolean());
					good.setPicture("testpicture");
					good.setItemWeight(0.5);
					dao.insertOne(good);
				}*/
				//long end = new Date().getTime();
				//System.out.println(end-start);
		}
		
	}
	
	
	

}
