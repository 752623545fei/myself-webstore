package org.webstore.service;

import java.util.List;

import org.webstore.entity.Area;

public interface CommonService {


	
	public List<Area> queryAreaByParentId(Integer parent);
	public Area queryAreaByParentName(String parent);
}
