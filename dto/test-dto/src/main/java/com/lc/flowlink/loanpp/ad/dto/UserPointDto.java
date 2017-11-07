package com.lc.flowlink.loanpp.ad.dto;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

public class UserPointDto {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 可用积分
     */
    private BigDecimal usablePoint;

    /**
     * 冻结积分
     */
    private BigDecimal frozePoint;

    /**
     * 转换积分
     */
    private BigDecimal convertedPoint;

    private Date insDate;

    private Date updDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getUsablePoint() {
        return usablePoint;
    }

    public void setUsablePoint(BigDecimal usablePoint) {
        this.usablePoint = usablePoint;
    }

    public BigDecimal getFrozePoint() {
        return frozePoint;
    }

    public void setFrozePoint(BigDecimal frozePoint) {
        this.frozePoint = frozePoint;
    }

    public BigDecimal getConvertedPoint() {
        return convertedPoint;
    }

    public void setConvertedPoint(BigDecimal convertedPoint) {
        this.convertedPoint = convertedPoint;
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
}