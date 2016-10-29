package org.webstore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.webstore.entity.GoodClass;
import org.webstore.entity.Goods;

public interface GoodsDao {

	List<Goods> queryList(@Param("search")String search,@Param("offset")int offset,@Param("limit")int limit);
	Long queryListCount(@Param("search")String search);
	Goods queryDetail(Long id);
	int insertOne (Goods good);
	int insertArray(List<Goods> list);
	GoodClass queryClass(int id);
}
