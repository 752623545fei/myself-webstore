package org.webstore.entity;

import org.webstore.enums.GoodsTypeEnum;

public class Goods {

	private Long id;
	private String title;
	private Integer cid;
	private Long sellerCids;
	private Boolean stuffStatus;
	private String locationState;
	private String locationCity;
	private Double price;
	private Integer num;
	private Short freightPayer;
	private Short postFee;
	private Short emsFee;
	private Short expressFee;
	private Boolean hasInvoice;
	private Boolean hasWarranty;
	private String description;
	private String picture;
	private Double itemWeight;
	private boolean newprepay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Long getSellerCids() {
		return sellerCids;
	}

	public void setSellerCids(Long sellerCids) {
		this.sellerCids = sellerCids;
	}

	public Boolean getStuffStatus() {
		return stuffStatus;
	}

	public void setStuffStatus(Boolean stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public String getLocationState() {
		return locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Short getFreightPayer() {
		return freightPayer;
	}

	public void setFreightPayer(Short freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Short getPostFee() {
		return postFee;
	}

	public void setPostFee(Short postFee) {
		this.postFee = postFee;
	}

	public Short getEmsFee() {
		return emsFee;
	}

	public void setEmsFee(Short emsFee) {
		this.emsFee = emsFee;
	}

	public Short getExpressFee() {
		return expressFee;
	}

	public void setExpressFee(Short expressFee) {
		this.expressFee = expressFee;
	}

	public Boolean getHasInvoice() {
		return hasInvoice;
	}

	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public Boolean getHasWarranty() {
		return hasWarranty;
	}

	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
	}

	public Boolean getNewprepay() {
		return newprepay;
	}

	public void setNewprepay(Boolean newprepay) {
		this.newprepay = newprepay;
	}

	public Goods(Long id, String title, Integer cid, Long sellerCids, Boolean stuffStatus, String locationState,
			String locationCity, Double price, Integer num, Short freightPayer, Short postFee, Short emsFee,
			Short expressFee, Boolean hasInvoice, Boolean hasWarranty, String description, String picture,
			Double itemWeight, Boolean newprepay) {
		super();
		this.id = id;
		this.title = title;
		this.cid = cid;
		this.sellerCids = sellerCids;
		this.stuffStatus = stuffStatus;
		this.locationState = locationState;
		this.locationCity = locationCity;
		this.price = price;
		this.num = num;
		this.freightPayer = freightPayer;
		this.postFee = postFee;
		this.emsFee = emsFee;
		this.expressFee = expressFee;
		this.hasInvoice = hasInvoice;
		this.hasWarranty = hasWarranty;
		this.description = description;
		this.picture = picture;
		this.itemWeight = itemWeight;
		this.newprepay = newprepay;
	}

	public Goods() {
		super();
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", title=" + title + ", cid=" + cid + ", sellerCids=" + sellerCids + ", stuffStatus="
				+ stuffStatus + ", locationState=" + locationState + ", locationCity=" + locationCity + ", price="
				+ price + ", num=" + num + ", freightPayer=" + freightPayer + ", postFee=" + postFee + ", emsFee="
				+ emsFee + ", expressFee=" + expressFee + ", hasInvoice=" + hasInvoice + ", hasWarranty=" + hasWarranty
				+ ", description=" + description + ", picture=" + picture + ", itemWeight=" + itemWeight
				+ ", newprepay=" + newprepay + "]";
	}

}
