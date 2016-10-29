package org.webstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webstore.dao.AreaDao;
import org.webstore.entity.Area;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	AreaDao areaDao;

	@Override
	public List<Area> queryAreaByParentId(Integer parent) {
		List<Area> list = areaDao.queryAreaByParentId(parent);
		return list;
	}

	@Override
	public Area queryAreaByParentName(String parent) {
		Area area = areaDao.queryAreaByParentName(parent);
		return area;
	}

	
	
	
	

	
}
