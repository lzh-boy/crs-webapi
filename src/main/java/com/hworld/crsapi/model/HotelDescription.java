package com.hworld.crsapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "HotelDescription")
public class HotelDescription {
    /**
     * 自增长主键
     */
    @Id
    @Column(name = "PkId")
    private Integer pkid;

    /**
     * 酒店代码
     */
    @Column(name = "HotelCode")
    private String hotelcode;

    /**
     * 语言类型：0=英语，1=汉语，2=日语
     */
    @Column(name = "Language")
    private Integer language;

    /**
     * 酒店描述
     */
    @Column(name = "HotelDescription")
    private String hoteldescription;

    /**
     * 酒店策略
     */
    @Column(name = "HotelStrategy")
    private String hotelstrategy;

    /**
     * 取消策略
     */
    @Column(name = "CancelPolicy")
    private String cancelpolicy;

    /**
     * 酒店提示
     */
    @Column(name = "HotelAlert")
    private String hotelalert;

    /**
     * 交通信息
     */
    @Column(name = "TravelInfo")
    private String travelinfo;

    /**
     * 会议室
     */
    @Column(name = "Meeting")
    private String meeting;

    /**
     * 餐饮娱乐
     */
    @Column(name = "DinningEntertainment")
    private String dinningentertainment;

    /**
     * 创建时间
     */
    @Column(name = "InsertTime")
    private Date inserttime;

    /**
     * 修改时间
     */
    @Column(name = "UpdateTime")
    private Date updatetime;

    /**
     * 操作人
     */
    @Column(name = "Operator")
    private String operator;

    /**
     * 获取自增长主键
     *
     * @return PkId - 自增长主键
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置自增长主键
     *
     * @param pkid 自增长主键
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取酒店代码
     *
     * @return HotelCode - 酒店代码
     */
    public String getHotelcode() {
        return hotelcode;
    }

    /**
     * 设置酒店代码
     *
     * @param hotelcode 酒店代码
     */
    public void setHotelcode(String hotelcode) {
        this.hotelcode = hotelcode;
    }

    /**
     * 获取语言类型：0=英语，1=汉语，2=日语
     *
     * @return Language - 语言类型：0=英语，1=汉语，2=日语
     */
    public Integer getLanguage() {
        return language;
    }

    /**
     * 设置语言类型：0=英语，1=汉语，2=日语
     *
     * @param language 语言类型：0=英语，1=汉语，2=日语
     */
    public void setLanguage(Integer language) {
        this.language = language;
    }

    /**
     * 获取酒店描述
     *
     * @return HotelDescription - 酒店描述
     */
    public String getHoteldescription() {
        return hoteldescription;
    }

    /**
     * 设置酒店描述
     *
     * @param hoteldescription 酒店描述
     */
    public void setHoteldescription(String hoteldescription) {
        this.hoteldescription = hoteldescription;
    }

    /**
     * 获取酒店策略
     *
     * @return HotelStrategy - 酒店策略
     */
    public String getHotelstrategy() {
        return hotelstrategy;
    }

    /**
     * 设置酒店策略
     *
     * @param hotelstrategy 酒店策略
     */
    public void setHotelstrategy(String hotelstrategy) {
        this.hotelstrategy = hotelstrategy;
    }

    /**
     * 获取取消策略
     *
     * @return CancelPolicy - 取消策略
     */
    public String getCancelpolicy() {
        return cancelpolicy;
    }

    /**
     * 设置取消策略
     *
     * @param cancelpolicy 取消策略
     */
    public void setCancelpolicy(String cancelpolicy) {
        this.cancelpolicy = cancelpolicy;
    }

    /**
     * 获取酒店提示
     *
     * @return HotelAlert - 酒店提示
     */
    public String getHotelalert() {
        return hotelalert;
    }

    /**
     * 设置酒店提示
     *
     * @param hotelalert 酒店提示
     */
    public void setHotelalert(String hotelalert) {
        this.hotelalert = hotelalert;
    }

    /**
     * 获取交通信息
     *
     * @return TravelInfo - 交通信息
     */
    public String getTravelinfo() {
        return travelinfo;
    }

    /**
     * 设置交通信息
     *
     * @param travelinfo 交通信息
     */
    public void setTravelinfo(String travelinfo) {
        this.travelinfo = travelinfo;
    }

    /**
     * 获取会议室
     *
     * @return Meeting - 会议室
     */
    public String getMeeting() {
        return meeting;
    }

    /**
     * 设置会议室
     *
     * @param meeting 会议室
     */
    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    /**
     * 获取餐饮娱乐
     *
     * @return DinningEntertainment - 餐饮娱乐
     */
    public String getDinningentertainment() {
        return dinningentertainment;
    }

    /**
     * 设置餐饮娱乐
     *
     * @param dinningentertainment 餐饮娱乐
     */
    public void setDinningentertainment(String dinningentertainment) {
        this.dinningentertainment = dinningentertainment;
    }

    /**
     * 获取创建时间
     *
     * @return InsertTime - 创建时间
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * 设置创建时间
     *
     * @param inserttime 创建时间
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * 获取修改时间
     *
     * @return UpdateTime - 修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置修改时间
     *
     * @param updatetime 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取操作人
     *
     * @return Operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkid=").append(pkid);
        sb.append(", hotelcode=").append(hotelcode);
        sb.append(", language=").append(language);
        sb.append(", hoteldescription=").append(hoteldescription);
        sb.append(", hotelstrategy=").append(hotelstrategy);
        sb.append(", cancelpolicy=").append(cancelpolicy);
        sb.append(", hotelalert=").append(hotelalert);
        sb.append(", travelinfo=").append(travelinfo);
        sb.append(", meeting=").append(meeting);
        sb.append(", dinningentertainment=").append(dinningentertainment);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}