package com.hworld.crsapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "HotelBasicInfoLangSpec")
public class HotelBasicInfoSpec {
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
     * 酒店名称
     */
    @Column(name = "HotelName")
    private String hotelname;

    /**
     * 酒店简称
     */
    @Column(name = "HotelShortName")
    private String hotelshortname;

    /**
     * 地址
     */
    @Column(name = "Address")
    private String address;

    /**
     * 国家
     */
    @Column(name = "County")
    private String county;

    /**
     * 省、州
     */
    @Column(name = "Provence")
    private String provence;

    /**
     * 市
     */
    @Column(name = "City")
    private String city;

    /**
     * 区
     */
    @Column(name = "District")
    private String district;

    /**
     * 币种
     */
    @Column(name = "Currency")
    private String currency;

    /**
     * 时区
     */
    @Column(name = "TimeZone")
    private String timezone;

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
     * 获取酒店名称
     *
     * @return HotelName - 酒店名称
     */
    public String getHotelname() {
        return hotelname;
    }

    /**
     * 设置酒店名称
     *
     * @param hotelname 酒店名称
     */
    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    /**
     * 获取酒店简称
     *
     * @return HotelShortName - 酒店简称
     */
    public String getHotelshortname() {
        return hotelshortname;
    }

    /**
     * 设置酒店简称
     *
     * @param hotelshortname 酒店简称
     */
    public void setHotelshortname(String hotelshortname) {
        this.hotelshortname = hotelshortname;
    }

    /**
     * 获取地址
     *
     * @return Address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取国家
     *
     * @return County - 国家
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置国家
     *
     * @param county 国家
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 获取省、州
     *
     * @return Provence - 省、州
     */
    public String getProvence() {
        return provence;
    }

    /**
     * 设置省、州
     *
     * @param provence 省、州
     */
    public void setProvence(String provence) {
        this.provence = provence;
    }

    /**
     * 获取市
     *
     * @return City - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return District - 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取币种
     *
     * @return Currency - 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取时区
     *
     * @return TimeZone - 时区
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 设置时区
     *
     * @param timezone 时区
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
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
        sb.append(", hotelname=").append(hotelname);
        sb.append(", hotelshortname=").append(hotelshortname);
        sb.append(", address=").append(address);
        sb.append(", county=").append(county);
        sb.append(", provence=").append(provence);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", currency=").append(currency);
        sb.append(", timezone=").append(timezone);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}