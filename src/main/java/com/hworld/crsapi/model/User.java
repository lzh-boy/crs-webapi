package com.hworld.crsapi.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class User {

    @ApiModelProperty("编号")
    private Integer pkid;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("出生日期")
    private Date birthday;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
