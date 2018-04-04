package com.hworld.crsapi.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "gp_sale")
public class Sale {
    @Id
    @Column(name = "PkId")
    private Integer pkid;

    /**
     * 销售人员的openid
     */
    @Column(name = "SaleOpenId")
    private String saleopenid;

    /**
     * 客户人员的openid
     */
    @Column(name = "CustomerOpenId")
    private String customeropenid;

    /**
     * 商品Id
     */
    @Column(name = "GoodsId")
    private Integer goodsid;

    /**
     * 商品数量
     */
    @Column(name = "GoodsNum")
    private Integer goodsnum;

    /**
     * 商品总价
     */
    @Column(name = "GoodsTotalPrice")
    private BigDecimal goodstotalprice;

    /**
     * 优惠金额
     */
    @Column(name = "DiscountPrice")
    private BigDecimal discountprice;

    /**
     * 奖金提成
     */
    @Column(name = "Bonuses")
    private BigDecimal bonuses;

    /**
     * 备注
     */
    @Column(name = "Note")
    private String note;

    /**
     * 记录时间
     */
    @Column(name = "InsertTime")
    private Date inserttime;

    @Column(name = "Abort")
    private Boolean abort;

    /**
     * @return PkId
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * @param pkid
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取销售人员的openid
     *
     * @return SaleOpenId - 销售人员的openid
     */
    public String getSaleopenid() {
        return saleopenid;
    }

    /**
     * 设置销售人员的openid
     *
     * @param saleopenid 销售人员的openid
     */
    public void setSaleopenid(String saleopenid) {
        this.saleopenid = saleopenid;
    }

    /**
     * 获取客户人员的openid
     *
     * @return CustomerOpenId - 客户人员的openid
     */
    public String getCustomeropenid() {
        return customeropenid;
    }

    /**
     * 设置客户人员的openid
     *
     * @param customeropenid 客户人员的openid
     */
    public void setCustomeropenid(String customeropenid) {
        this.customeropenid = customeropenid;
    }

    /**
     * 获取商品Id
     *
     * @return GoodsId - 商品Id
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * 设置商品Id
     *
     * @param goodsid 商品Id
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * 获取商品数量
     *
     * @return GoodsNum - 商品数量
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * 设置商品数量
     *
     * @param goodsnum 商品数量
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * 获取商品总价
     *
     * @return GoodsTotalPrice - 商品总价
     */
    public BigDecimal getGoodstotalprice() {
        return goodstotalprice;
    }

    /**
     * 设置商品总价
     *
     * @param goodstotalprice 商品总价
     */
    public void setGoodstotalprice(BigDecimal goodstotalprice) {
        this.goodstotalprice = goodstotalprice;
    }

    /**
     * 获取优惠金额
     *
     * @return DiscountPrice - 优惠金额
     */
    public BigDecimal getDiscountprice() {
        return discountprice;
    }

    /**
     * 设置优惠金额
     *
     * @param discountprice 优惠金额
     */
    public void setDiscountprice(BigDecimal discountprice) {
        this.discountprice = discountprice;
    }

    /**
     * 获取奖金提成
     *
     * @return Bonuses - 奖金提成
     */
    public BigDecimal getBonuses() {
        return bonuses;
    }

    /**
     * 设置奖金提成
     *
     * @param bonuses 奖金提成
     */
    public void setBonuses(BigDecimal bonuses) {
        this.bonuses = bonuses;
    }

    /**
     * 获取备注
     *
     * @return Note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取记录时间
     *
     * @return InsertTime - 记录时间
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * 设置记录时间
     *
     * @param inserttime 记录时间
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * @return Abort
     */
    public Boolean getAbort() {
        return abort;
    }

    /**
     * @param abort
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
        sb.append(", saleopenid=").append(saleopenid);
        sb.append(", customeropenid=").append(customeropenid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", goodsnum=").append(goodsnum);
        sb.append(", goodstotalprice=").append(goodstotalprice);
        sb.append(", discountprice=").append(discountprice);
        sb.append(", bonuses=").append(bonuses);
        sb.append(", note=").append(note);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", abort=").append(abort);
        sb.append("]");
        return sb.toString();
    }
}