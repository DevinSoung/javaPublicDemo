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
@ApiModel(value = "ActivityRuleDto", description = "活动规则")
public class ActivityRuleDto implements Serializable {

    @ApiModelProperty(value = "新闻id")
    private String id;

    @ApiModelProperty(value = "新闻状态")
    private String status;

    @ApiModelProperty(value = "新闻类型名称")
    private String name;

    @ApiModelProperty(value = "新闻类型id")
    private String newsTypeId;

    @ApiModelProperty(value = "展示类型id")
    private String showTypeId;

    @ApiModelProperty(value = "新闻标题")
    private String title;

    @ApiModelProperty(value = "新闻内容")
    private String summary;

    @ApiModelProperty(value = "发布时间")
    private Date publishDate;

    @ApiModelProperty(value = "作者")
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getShowTypeId() {
        return showTypeId;
    }

    public void setShowTypeId(String showTypeId) {
        this.showTypeId = showTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
