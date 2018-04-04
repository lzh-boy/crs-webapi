package com.hworld.crsapi.controller;


import com.hworld.crsapi.model.HotelBasicInfo;
import com.hworld.crsapi.service.HotelBasicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("酒店基本信息")
@RestController
@RequestMapping("hotel")
public class HotelBasicInfoController {

    @Autowired
    private HotelBasicInfoService service;

    @ApiOperation("根据酒店代码获取酒店基本信息")
    @GetMapping("basic/{hotelCode}")
    public HotelBasicInfo selectOne(@PathVariable("hotelCode") String hotelCode) {
        HotelBasicInfo t = new HotelBasicInfo();
        t.setHotelcode(hotelCode);
        return service.selectOne(t);
    }
}
