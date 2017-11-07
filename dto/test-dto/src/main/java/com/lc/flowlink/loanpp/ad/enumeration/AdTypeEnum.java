package com.lc.flowlink.loanpp.ad.enumeration;

/**
 * Created by zhuqq on 2017/10/18.
 */
public enum AdTypeEnum {

    NONE("", ""),
    /**
     * 首页头部
     */
    HOMEHEADER("01", "homeHeader"),
    /**
     * 首页中部
     */
    HOMEMIDDLE("02", "homeMiddle"),

    /**
     * 贷款详情页尾部
     */
    LOANTAIL("03", "loanTail");

    /**
     * key
     */
    private String key;

    ;
    /**
     * 取得値
     */
    private String value;

    AdTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    public static String getValueByKey(String key) {
        for (AdTypeEnum type : AdTypeEnum.values()) {
            if (type.getKey().equals(key)) {
                return type.getValue();
            }
        }
        return AdTypeEnum.NONE.getValue();
    }
}
