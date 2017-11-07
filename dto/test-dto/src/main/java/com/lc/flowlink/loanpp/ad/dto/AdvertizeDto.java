package com.lc.flowlink.loanpp.ad.dto;

import java.util.Date;

public class AdvertizeDto extends SearchConditionBaseDto {

	private static final long serialVersionUID = 8193096285853016212L;

	private String id;
	private String advertizeShowPageId;
	private String showType;
	private String validFlg;
	private String imgPath;
	private String backgroundImgPath;
	private String linkUrl;
	private String delFlg;
	private String insUserId;
	private Date insDate;
	private Date updDate;
	private String phoneFlg;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdvertizeShowPageId() {
		return advertizeShowPageId;
	}

	public void setAdvertizeShowPageId(String advertizeShowPageId) {
		this.advertizeShowPageId = advertizeShowPageId;
	}

	public String getShowType() {
		return showType;
	}

	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getValidFlg() {
		return validFlg;
	}

	public void setValidFlg(String validFlg) {
		this.validFlg = validFlg;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getBackgroundImgPath() {
		return backgroundImgPath;
	}

	public void setBackgroundImgPath(String backgroundImgPath) {
		this.backgroundImgPath = backgroundImgPath;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public String getInsUserId() {
		return insUserId;
	}

	public void setInsUserId(String insUserId) {
		this.insUserId = insUserId;
	}

	public Date getInsDate() {
		return insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getPhoneFlg() {
		return phoneFlg;
	}

	public void setPhoneFlg(String phoneFlg) {
		this.phoneFlg = phoneFlg;
	}

}
