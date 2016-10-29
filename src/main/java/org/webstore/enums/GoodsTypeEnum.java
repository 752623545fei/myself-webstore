package org.webstore.enums;

import java.util.ArrayList;
import java.util.List;

public enum GoodsTypeEnum {

	MALECLOTHES(1,"男装"),
	FAMALECLOTHES(2, "女装"),
	SHOES(3,"鞋靴"),
	TOYS(4,"玩具"),
	ELECTRICAL(5,"家电"),
	DIGITAL(6,"数码"),
	CELLPHONE(7,"手机"),
	WATCH(8,"手表"),
	FOOD(9,"食物");
	

	private int typeId;
	private String typeName;

	public int getTypeId() {
		return typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	private GoodsTypeEnum(int typeId, String typeName) {
		this.typeId = typeId;
		this.typeName = typeName;
	}
	
	public static GoodsTypeEnum typeOf(int index){
		for (GoodsTypeEnum type : values()) {
			if (type.getTypeId() == index) {
				return type;
			}
		}
		return null;
	}
	
	public static GoodsTypeEnum typeOf(String index){
		for (GoodsTypeEnum type : values()) {
			if (type.getTypeName().equals(index)) {
				return type;
			}
		}
		return null;
	}
	
	public static List<String> getTypeEnum(){
		List<String> list = new ArrayList<String>();
		for (GoodsTypeEnum type : values()){
			list.add(type.getTypeName());
		}
		return list;
	}

}
