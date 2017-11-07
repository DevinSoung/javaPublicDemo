package com.lc.flowlink.loanpp.ad.dto;

/**
 * iloan系统：消息的数据传输类。
 *
 * @author yingcankeji
 */
public class MessageMDto extends SearchConditionBaseDto {

	private static final long serialVersionUID = 1L;

	private String id;
	private String msgType;
	private String sender;
	private String receiver;
	private String subject;
	private String contents;
	private String replyFlg;
	private String openFlg;
	private String delFlg;
	private String topFlg;
	private String insDate;
	private String updDate;
	private String senderDelFlg;
	private String receiverDelFlg;
	private boolean isGetFlatSms;
	private boolean isPlay;
	private String tenantId;
	
	public boolean isGetFlatSms() {
		return isGetFlatSms;
	}
	public void setGetFlatSms(boolean isGetFlatSms) {
		this.isGetFlatSms = isGetFlatSms;
	}

	public boolean isPlay() {
		return isPlay;
	}
	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	public String getTopFlg() {
		return topFlg;
	}
	public void setTopFlg(String topFlg) {
		this.topFlg = topFlg;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getSenderDelFlg() {
		return senderDelFlg;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param senderDelFlg
	 */
	public void setSenderDelFlg(String senderDelFlg) {
		this.senderDelFlg = senderDelFlg;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getReceiverDelFlg() {
		return receiverDelFlg;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param receiverDelFlg
	 */
	public void setReceiverDelFlg(String receiverDelFlg) {
		this.receiverDelFlg = receiverDelFlg;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 取得get的方法。
	 *
	 * @return
	 */
	public String getMsgType() {
		return msgType;
	}
	/**
	 * 设置set的方法。
	 *
	 * @param msgType
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getReplyFlg() {
		return replyFlg;
	}
	public void setReplyFlg(String replyFlg) {
		this.replyFlg = replyFlg;
	}
	public String getOpenFlg() {
		return openFlg;
	}
	public void setOpenFlg(String openFlg) {
		this.openFlg = openFlg;
	}
	public String getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}
	public String getInsDate() {
		return insDate;
	}
	public void setInsDate(String insDate) {
		this.insDate = insDate;
	}
	public String getUpdDate() {
		return updDate;
	}
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}


	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
