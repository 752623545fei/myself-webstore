package org.webstore.entity;

public class GoodClass {

	private String firstClassName;
	private String secondClassName;
	private String thirdClassName;

	public GoodClass(String firstClassName, String secondClassName, String thirdClassNameString) {
		super();
		this.firstClassName = firstClassName;
		this.secondClassName = secondClassName;
		this.thirdClassName = thirdClassNameString;
	}

	public String getFirstClassName() {
		return firstClassName;
	}

	public void setFirstClassName(String firstClassName) {
		this.firstClassName = firstClassName;
	}

	public String getSecondClassName() {
		return secondClassName;
	}

	public void setSecondClassName(String secondClassName) {
		this.secondClassName = secondClassName;
	}

	public String getThirdClassNameString() {
		return thirdClassName;
	}

	public void setThirdClassNameString(String thirdClassNameString) {
		this.thirdClassName = thirdClassNameString;
	}

	public GoodClass() {
		super();
	}

	@Override
	public String toString() {
		return "测试数据：" + firstClassName + "/" + secondClassName
				+ "/" + thirdClassName + "/";
	}

}
