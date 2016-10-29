package org.webstore.service;

import java.util.List;

import org.webstore.entity.Goods;
import org.webstore.entity.User;

public interface GoodService {

	public List<Goods> queryList(String search,int page);
	public Long queryPageCount(String search);
	public Goods queryDetail(Long id);
	public int addGood(Goods good);


	
}
