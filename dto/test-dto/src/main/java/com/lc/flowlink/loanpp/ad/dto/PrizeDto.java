package com.lc.flowlink.loanpp.ad.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: Tonglq
 * @Description:
 * @Date: Created in 2017/10/26 17:44
 */
@ApiModel(value = "PrizeDto", description = "奖品信息")
public class PrizeDto {

    @ApiModelProperty(value = "红包金额/积分数")
    private String redPacketAmount;

    @ApiModelProperty(value = "奖品编号")
    private String prizeId;

    @ApiModelProperty(value = "奖品序号")
    private Integer orderIdx;

    @ApiModelProperty(value = "奖品图片接")
    private String prizeImgUrl;

    @ApiModelProperty(value = "奖品类型")
    private String prizeType;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "奖品分类名称")
    private String prizeClassName;

    @ApiModelProperty(value = "奖品名称")
    private String prizeName;

    @ApiModelProperty(value = "奖品总数量")
    private Integer prizeNum;

    @ApiModelProperty(value = "奖品已获取数量")
    private Integer prizeSurplus;

    @ApiModelProperty(value = "奖品获取比例")
    private Integer prizeCoefficient;

    @ApiModelProperty(value = "入表者")
    private String insUserId;

    @ApiModelProperty(value = "入表时间")
    private String insDate;

    @ApiModelProperty(value = "奖品设置id")
    private String prizeSetId;

    @ApiModelProperty(value = "活动id")
    private String activityId;

    @ApiModelProperty(value = "抽奖类型id")
    private String activityPrizeClassId;

    @ApiModelProperty(value = "红包id")
    private String redRateId;

    public String getRedPacketAmount() {
        return redPacketAmount;
    }

    public void setRedPacketAmount(String redPacketAmount) {
        this.redPacketAmount = redPacketAmount;
    }

    public String getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(String prizeId) {
        this.prizeId = prizeId;
    }

    public String getPrizeImgUrl() {
        return prizeImgUrl;
    }

    public void setPrizeImgUrl(String prizeImgUrl) {
        this.prizeImgUrl = prizeImgUrl;
    }

    public String getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getPrizeClassName() {
        return prizeClassName;
    }

    public void setPrizeClassName(String prizeClassName) {
        this.prizeClassName = prizeClassName;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getInsUserId() {
        return insUserId;
    }

    public void setInsUserId(String insUserId) {
        this.insUserId = insUserId;
    }

    public String getInsDate() {
        return insDate;
    }

    public void setInsDate(String insDate) {
        this.insDate = insDate;
    }

    public String getPrizeSetId() {
        return prizeSetId;
    }

    public void setPrizeSetId(String prizeSetId) {
        this.prizeSetId = prizeSetId;
    }

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public Integer getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
    }

    public Integer getPrizeSurplus() {
        return prizeSurplus;
    }

    public void setPrizeSurplus(Integer prizeSurplus) {
        this.prizeSurplus = prizeSurplus;
    }

    public Integer getPrizeCoefficient() {
        return prizeCoefficient;
    }

    public void setPrizeCoefficient(Integer prizeCoefficient) {
        this.prizeCoefficient = prizeCoefficient;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityPrizeClassId() {
        return activityPrizeClassId;
    }

    public void setActivityPrizeClassId(String activityPrizeClassId) {
        this.activityPrizeClassId = activityPrizeClassId;
    }

    public String getRedRateId() {
        return redRateId;
    }

    public void setRedRateId(String redRateId) {
        this.redRateId = redRateId;
    }
}
