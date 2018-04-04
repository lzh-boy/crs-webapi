package com.hworld.crsapi.service;

import com.hworld.crsapi.mapper.HotelBasicInfoMapper;
import com.hworld.crsapi.model.HotelBasicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelBasicInfoService {

    @Autowired
    private HotelBasicInfoMapper hotelBasicInfoMapper;

    public HotelBasicInfo selectOne(HotelBasicInfo t) {
        return hotelBasicInfoMapper.selectOne(t);
    }
}
