package com.lc.flowlink.loanpp.ad.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Tonglq
 * @Description:
 * @Date: Created in 2017/10/26 17:44
 */
@ApiModel(value = "PointDto", description = "抽奖赢红包")
public class PointDto implements Serializable {

    @ApiModelProperty(value = "需要积分")
    private BigDecimal needPoint;

    @ApiModelProperty(value = "我的积分")
    private BigDecimal myPoint;

    @ApiModelProperty(value = "奖品信息")
    private List<PrizeDto> prizeList;

    @ApiModelProperty(value = "中奖名单")
    private List<UserWinningDto> userWinningList;

    public BigDecimal getNeedPoint() {
        return needPoint;
    }

    public void setNeedPoint(BigDecimal needPoint) {
        this.needPoint = needPoint;
    }

    public BigDecimal getMyPoint() {
        return myPoint;
    }

    public void setMyPoint(BigDecimal myPoint) {
        this.myPoint = myPoint;
    }

    public List<PrizeDto> getPrizeList() {
        return prizeList;
    }

    public void setPrizeList(List<PrizeDto> prizeList) {
        this.prizeList = prizeList;
    }

    public List<UserWinningDto> getUserWinningList() {
        return userWinningList;
    }

    public void setUserWinningList(List<UserWinningDto> userWinningList) {
        this.userWinningList = userWinningList;
    }
}
