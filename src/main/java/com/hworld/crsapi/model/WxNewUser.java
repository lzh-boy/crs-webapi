package com.hworld.crsapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gp_user")
public class WxNewUser {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "pkId")
    private Integer pkid;

    /**
     * 微信账号
     */
    private String openid;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 语言
     */
    private String language;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 头像
     */
    private String headimgurl;

    /**
     * 特权
     */
    private String privilege;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 插入时间戳
     */
    @Column(name = "insertTime")
    private Date inserttime;

    /**
     * 是否删除:默认FALSE
     */
    private Boolean abort;

    /**
     * 获取用户编号
     *
     * @return pkId - 用户编号
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置用户编号
     *
     * @param pkid 用户编号
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取微信账号
     *
     * @return openid - 微信账号
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信账号
     *
     * @param openid 微信账号
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取微信昵称
     *
     * @return nickname - 微信昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置微信昵称
     *
     * @param nickname 微信昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取语言
     *
     * @return language - 语言
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置语言
     *
     * @param language 语言
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取头像
     *
     * @return headimgurl - 头像
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置头像
     *
     * @param headimgurl 头像
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取特权
     *
     * @return privilege - 特权
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * 设置特权
     *
     * @param privilege 特权
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * 获取积分
     *
     * @return integral - 积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置积分
     *
     * @param integral 积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取插入时间戳
     *
     * @return insertTime - 插入时间戳
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * 设置插入时间戳
     *
     * @param inserttime 插入时间戳
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * 获取是否删除:默认FALSE
     *
     * @return abort - 是否删除:默认FALSE
     */
    public Boolean getAbort() {
        return abort;
    }

    /**
     * 设置是否删除:默认FALSE
     *
     * @param abort 是否删除:默认FALSE
     */
    public void setAbort(Boolean abort) {
        this.abort = abort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkid=").append(pkid);
        sb.append(", openid=").append(openid);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", language=").append(language);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", headimgurl=").append(headimgurl);
        sb.append(", privilege=").append(privilege);
        sb.append(", integral=").append(integral);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", abort=").append(abort);
        sb.append("]");
        return sb.toString();
    }
}