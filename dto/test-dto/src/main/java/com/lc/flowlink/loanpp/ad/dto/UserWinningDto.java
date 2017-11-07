package com.lc.flowlink.loanpp.ad.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Tonglq
 * @Description:
 * @Date: Created in 2017/10/26 17:44
 */
@ApiModel(value = "UserWinningDto", description = "中奖名单")
public class UserWinningDto implements Serializable {

    @ApiModelProperty(value = "中奖用户")
    private String mobile;

    @ApiModelProperty(value = "奖品名称")
    private String prizeDescribe;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPrizeDescribe() {
        return prizeDescribe;
    }

    public void setPrizeDescribe(String prizeDescribe) {
        this.prizeDescribe = prizeDescribe;
    }
}
