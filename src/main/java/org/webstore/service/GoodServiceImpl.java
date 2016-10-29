package org.webstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.webstore.dao.GoodsDao;
import org.webstore.dao.UserDao;
import org.webstore.entity.GoodClass;
import org.webstore.entity.Goods;
import org.webstore.entity.User;
import org.webstore.enums.GoodsTypeEnum;

@Service
public class GoodServiceImpl implements GoodService{

	@Autowired
	GoodsDao goodsDao;
	
	@Autowired
	UserDao userDao;
	
	
	/*@Transactional
	public int addGood(Goods good) {
		int result = goodsDao.insertOne(good);
		return result;
	}

	@Transactional
	public boolean addUser(User user) {
		userDao.addUser(user);
		return true;
	}*/





	@Override
	public Goods queryDetail(Long id) {
		Goods goods = goodsDao.queryDetail(id);
		return goods;
	}

	



	@Override
	public int addGood(Goods good) {
		// TODO Auto-generated method stub
		return 0;
	}







	@Override
	public List<Goods> queryList(String search, int page) {
		int offset = (page - 1) * 40;
		int limit = 40; 
		List<Goods> list = new ArrayList<Goods>();
		list = goodsDao.queryList(search, offset, limit);
		return list;
	}



	@Override
	public Long queryPageCount(String search) {
		Long countLong = goodsDao.queryListCount(search);
		if (countLong%40 == 0) {
			return countLong/40;
		}else {
			return countLong/40 + 1;
		}
		
	}



	

	
	

}
