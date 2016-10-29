package org.webstore.dao;

import java.util.List;

import org.webstore.entity.Area;

public interface AreaDao {

	List<Area> queryAreaByParentId (int parent);
	Area queryAreaByParentName (String parent);
}
