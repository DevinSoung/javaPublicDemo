package com.lc.flowlink.loanpp.ad.dto;

public class PointTypeDto extends SearchConditionBaseDto {

	private static final long serialVersionUID = 1L;
	
	private String pointType;
	private String pointDescription;
	private String validFlg;
	private String delFlg;
	private String point;
	private String rule;
	private String remark;
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getPointType() {
		return pointType;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param pointType
	 */
	public void setPointType(String pointType) {
		this.pointType = pointType;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getPointDescription() {
		return pointDescription;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param pointDescription
	 */
	public void setPointDescription(String pointDescription) {
		this.pointDescription = pointDescription;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getValidFlg() {
		return validFlg;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param validFlg
	 */
	public void setValidFlg(String validFlg) {
		this.validFlg = validFlg;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getDelFlg() {
		return delFlg;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param delFlg
	 */
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getPoint() {
		return point;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param point
	 */
	public void setPoint(String point) {
		this.point = point;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getRule() {
		return rule;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param rule
	 */
	public void setRule(String rule) {
		this.rule = rule;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
