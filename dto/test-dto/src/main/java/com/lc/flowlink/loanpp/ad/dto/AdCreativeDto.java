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
@ApiModel(value = "ActivityRuleDto", description = "广告位")
public class AdCreativeDto implements Serializable {

    @ApiModelProperty(value = "广告位置")
    private String name="";

    @ApiModelProperty(value = "展示类型")
    private String showType="";

    @ApiModelProperty(value = "图片地址")
    private String imgPath="";

    @ApiModelProperty(value = "链接地址")
    private String linkUrl="";

    @ApiModelProperty(value = "链接类型 0.h5   1.原生")
    private String linkType="";

    @ApiModelProperty(value = "权重")
    private String weight="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
