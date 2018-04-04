package com.hworld.crsapi.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HotelBasicInfo")
public class HotelBasicInfo {
    /**
     * 自增长主键
     */
    @Id
    @Column(name = "PkId")
    private Integer pkid;

    /**
     * 集团代码
     */
    @Column(name = "HotelGroupCode")
    private String hotelgroupcode;

    /**
     * 酒店代码
     */
    @Column(name = "HotelCode")
    private String hotelcode;

    /**
     * 默认电话号码
     */
    @Column(name = "PrimaryPhone")
    private String primaryphone;

    /**
     * 备用电话号码
     */
    @Column(name = "SparePhone")
    private String sparephone;

    /**
     * 传真
     */
    @Column(name = "Fax")
    private String fax;

    /**
     * 电子邮件
     */
    @Column(name = "Email")
    private String email;

    /**
     * 礼宾邮箱
     */
    @Column(name = "GuestServiceEmail")
    private String guestserviceemail;

    /**
     * 经度
     */
    @Column(name = "Longtitude")
    private BigDecimal longtitude;

    /**
     * 纬度
     */
    @Column(name = "Latitude")
    private BigDecimal latitude;

    /**
     * 地图类型：1=百度，2=高德，3=谷歌，4=腾讯
     */
    @Column(name = "MapCategory")
    private Integer mapcategory;

    /**
     * 酒店品牌：1=宝利嘉，2=钓鱼台
     */
    @Column(name = "Brand")
    private Integer brand;

    /**
     * 星级
     */
    @Column(name = "Star")
    private Integer star;

    /**
     * 状态：1=正常营业，2=停业装修
     */
    @Column(name = "Status")
    private Integer status;

    /**
     * 经营模式：1=直营，2=加盟
     */
    @Column(name = "ManageModel")
    private Integer managemodel;

    /**
     * 开业日期
     */
    @Column(name = "OpenDate")
    private Date opendate;

    /**
     * 装修日期
     */
    @Column(name = "RefreshDate")
    private Date refreshdate;

    /**
     * 是否能接待外宾
     */
    @Column(name = "ForeignerCheckIn")
    private Boolean foreignercheckin;

    /**
     * 支持的信用卡种类：多张卡之间用逗号隔开
     */
    @Column(name = "SupportCards")
    private String supportcards;

    /**
     * 基础服务：多服务之间用逗号隔开
     */
    @Column(name = "BasicService")
    private String basicservice;

    /**
     * 基础设施：多设施之间用逗号隔开
     */
    @Column(name = "BasicFacility")
    private String basicfacility;

    /**
     * 酒店主图片
     */
    @Column(name = "MainPicture")
    private String mainpicture;

    /**
     * 酒店图片：多张图片之间用逗号隔开
     */
    @Column(name = "PictureList")
    private String picturelist;

    /**
     * PMS类型：1=opera，2=hpms+
     */
    @Column(name = "PMSCategory")
    private Integer pmscategory;

    /**
     * 是否直连PMS
     */
    @Column(name = "ConnectPMS")
    private Boolean connectpms;

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
     * 获取集团代码
     *
     * @return HotelGroupCode - 集团代码
     */
    public String getHotelgroupcode() {
        return hotelgroupcode;
    }

    /**
     * 设置集团代码
     *
     * @param hotelgroupcode 集团代码
     */
    public void setHotelgroupcode(String hotelgroupcode) {
        this.hotelgroupcode = hotelgroupcode;
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
     * 获取默认电话号码
     *
     * @return PrimaryPhone - 默认电话号码
     */
    public String getPrimaryphone() {
        return primaryphone;
    }

    /**
     * 设置默认电话号码
     *
     * @param primaryphone 默认电话号码
     */
    public void setPrimaryphone(String primaryphone) {
        this.primaryphone = primaryphone;
    }

    /**
     * 获取备用电话号码
     *
     * @return SparePhone - 备用电话号码
     */
    public String getSparephone() {
        return sparephone;
    }

    /**
     * 设置备用电话号码
     *
     * @param sparephone 备用电话号码
     */
    public void setSparephone(String sparephone) {
        this.sparephone = sparephone;
    }

    /**
     * 获取传真
     *
     * @return Fax - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取电子邮件
     *
     * @return Email - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取礼宾邮箱
     *
     * @return GuestServiceEmail - 礼宾邮箱
     */
    public String getGuestserviceemail() {
        return guestserviceemail;
    }

    /**
     * 设置礼宾邮箱
     *
     * @param guestserviceemail 礼宾邮箱
     */
    public void setGuestserviceemail(String guestserviceemail) {
        this.guestserviceemail = guestserviceemail;
    }

    /**
     * 获取经度
     *
     * @return Longtitude - 经度
     */
    public BigDecimal getLongtitude() {
        return longtitude;
    }

    /**
     * 设置经度
     *
     * @param longtitude 经度
     */
    public void setLongtitude(BigDecimal longtitude) {
        this.longtitude = longtitude;
    }

    /**
     * 获取纬度
     *
     * @return Latitude - 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取地图类型：1=百度，2=高德，3=谷歌，4=腾讯
     *
     * @return MapCategory - 地图类型：1=百度，2=高德，3=谷歌，4=腾讯
     */
    public Integer getMapcategory() {
        return mapcategory;
    }

    /**
     * 设置地图类型：1=百度，2=高德，3=谷歌，4=腾讯
     *
     * @param mapcategory 地图类型：1=百度，2=高德，3=谷歌，4=腾讯
     */
    public void setMapcategory(Integer mapcategory) {
        this.mapcategory = mapcategory;
    }

    /**
     * 获取酒店品牌：1=宝利嘉，2=钓鱼台
     *
     * @return Brand - 酒店品牌：1=宝利嘉，2=钓鱼台
     */
    public Integer getBrand() {
        return brand;
    }

    /**
     * 设置酒店品牌：1=宝利嘉，2=钓鱼台
     *
     * @param brand 酒店品牌：1=宝利嘉，2=钓鱼台
     */
    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    /**
     * 获取星级
     *
     * @return Star - 星级
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 设置星级
     *
     * @param star 星级
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 获取状态：1=正常营业，2=停业装修
     *
     * @return Status - 状态：1=正常营业，2=停业装修
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：1=正常营业，2=停业装修
     *
     * @param status 状态：1=正常营业，2=停业装修
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取经营模式：1=直营，2=加盟
     *
     * @return ManageModel - 经营模式：1=直营，2=加盟
     */
    public Integer getManagemodel() {
        return managemodel;
    }

    /**
     * 设置经营模式：1=直营，2=加盟
     *
     * @param managemodel 经营模式：1=直营，2=加盟
     */
    public void setManagemodel(Integer managemodel) {
        this.managemodel = managemodel;
    }

    /**
     * 获取开业日期
     *
     * @return OpenDate - 开业日期
     */
    public Date getOpendate() {
        return opendate;
    }

    /**
     * 设置开业日期
     *
     * @param opendate 开业日期
     */
    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    /**
     * 获取装修日期
     *
     * @return RefreshDate - 装修日期
     */
    public Date getRefreshdate() {
        return refreshdate;
    }

    /**
     * 设置装修日期
     *
     * @param refreshdate 装修日期
     */
    public void setRefreshdate(Date refreshdate) {
        this.refreshdate = refreshdate;
    }

    /**
     * 获取是否能接待外宾
     *
     * @return ForeignerCheckIn - 是否能接待外宾
     */
    public Boolean getForeignercheckin() {
        return foreignercheckin;
    }

    /**
     * 设置是否能接待外宾
     *
     * @param foreignercheckin 是否能接待外宾
     */
    public void setForeignercheckin(Boolean foreignercheckin) {
        this.foreignercheckin = foreignercheckin;
    }

    /**
     * 获取支持的信用卡种类：多张卡之间用逗号隔开
     *
     * @return SupportCards - 支持的信用卡种类：多张卡之间用逗号隔开
     */
    public String getSupportcards() {
        return supportcards;
    }

    /**
     * 设置支持的信用卡种类：多张卡之间用逗号隔开
     *
     * @param supportcards 支持的信用卡种类：多张卡之间用逗号隔开
     */
    public void setSupportcards(String supportcards) {
        this.supportcards = supportcards;
    }

    /**
     * 获取基础服务：多服务之间用逗号隔开
     *
     * @return BasicService - 基础服务：多服务之间用逗号隔开
     */
    public String getBasicservice() {
        return basicservice;
    }

    /**
     * 设置基础服务：多服务之间用逗号隔开
     *
     * @param basicservice 基础服务：多服务之间用逗号隔开
     */
    public void setBasicservice(String basicservice) {
        this.basicservice = basicservice;
    }

    /**
     * 获取基础设施：多设施之间用逗号隔开
     *
     * @return BasicFacility - 基础设施：多设施之间用逗号隔开
     */
    public String getBasicfacility() {
        return basicfacility;
    }

    /**
     * 设置基础设施：多设施之间用逗号隔开
     *
     * @param basicfacility 基础设施：多设施之间用逗号隔开
     */
    public void setBasicfacility(String basicfacility) {
        this.basicfacility = basicfacility;
    }

    /**
     * 获取酒店主图片
     *
     * @return MainPicture - 酒店主图片
     */
    public String getMainpicture() {
        return mainpicture;
    }

    /**
     * 设置酒店主图片
     *
     * @param mainpicture 酒店主图片
     */
    public void setMainpicture(String mainpicture) {
        this.mainpicture = mainpicture;
    }

    /**
     * 获取酒店图片：多张图片之间用逗号隔开
     *
     * @return PictureList - 酒店图片：多张图片之间用逗号隔开
     */
    public String getPicturelist() {
        return picturelist;
    }

    /**
     * 设置酒店图片：多张图片之间用逗号隔开
     *
     * @param picturelist 酒店图片：多张图片之间用逗号隔开
     */
    public void setPicturelist(String picturelist) {
        this.picturelist = picturelist;
    }

    /**
     * 获取PMS类型：1=opera，2=hpms+
     *
     * @return PMSCategory - PMS类型：1=opera，2=hpms+
     */
    public Integer getPmscategory() {
        return pmscategory;
    }

    /**
     * 设置PMS类型：1=opera，2=hpms+
     *
     * @param pmscategory PMS类型：1=opera，2=hpms+
     */
    public void setPmscategory(Integer pmscategory) {
        this.pmscategory = pmscategory;
    }

    /**
     * 获取是否直连PMS
     *
     * @return ConnectPMS - 是否直连PMS
     */
    public Boolean getConnectpms() {
        return connectpms;
    }

    /**
     * 设置是否直连PMS
     *
     * @param connectpms 是否直连PMS
     */
    public void setConnectpms(Boolean connectpms) {
        this.connectpms = connectpms;
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
        sb.append(", hotelgroupcode=").append(hotelgroupcode);
        sb.append(", hotelcode=").append(hotelcode);
        sb.append(", primaryphone=").append(primaryphone);
        sb.append(", sparephone=").append(sparephone);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", guestserviceemail=").append(guestserviceemail);
        sb.append(", longtitude=").append(longtitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", mapcategory=").append(mapcategory);
        sb.append(", brand=").append(brand);
        sb.append(", star=").append(star);
        sb.append(", status=").append(status);
        sb.append(", managemodel=").append(managemodel);
        sb.append(", opendate=").append(opendate);
        sb.append(", refreshdate=").append(refreshdate);
        sb.append(", foreignercheckin=").append(foreignercheckin);
        sb.append(", supportcards=").append(supportcards);
        sb.append(", basicservice=").append(basicservice);
        sb.append(", basicfacility=").append(basicfacility);
        sb.append(", mainpicture=").append(mainpicture);
        sb.append(", picturelist=").append(picturelist);
        sb.append(", pmscategory=").append(pmscategory);
        sb.append(", connectpms=").append(connectpms);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}