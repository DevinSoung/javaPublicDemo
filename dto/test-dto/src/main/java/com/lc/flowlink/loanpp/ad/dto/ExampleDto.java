package com.lc.flowlink.loanpp.ad.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class ExampleDto {

    @ApiModelProperty(value="id")
    private String id;
    @ApiModelProperty(value="姓名")
    private String name;
    @ApiModelProperty(value="金额")
    private Double money;
    @ApiModelProperty(value="时间戳")
    private Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
