package com.ruobilin.mall.admin.entity;

/**
 * 商品基本信息图片表
 */
public class CommodityBasicImage {
	private String id;
	private String commodityBasicId;	//商品基本信息ID
	private String imageUrl;	//图片路径
	private String smallUrl;	//缩略图路径
	private String type;	//图片类型：0主图、1细节图
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommodityBasicId() {
		return commodityBasicId;
	}
	public void setCommodityBasicId(String commodityBasicId) {
		this.commodityBasicId = commodityBasicId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getSmallUrl() {
		return smallUrl;
	}
	public void setSmallUrl(String smallUrl) {
		this.smallUrl = smallUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
