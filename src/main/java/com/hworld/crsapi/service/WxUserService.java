package com.hworld.crsapi.service;

import com.hworld.crsapi.mapper.WxUserMapper;
import com.hworld.crsapi.model.WxUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class WxUserService {

    @Autowired
    private WxUserMapper wxUserMapper;

    //REQUIRED一般用户增删改
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertSelective() {

        WxUser t1 = new WxUser();
        t1.setCity("city1");
        t1.setCountry("c1");
        t1.setHeadimgurl("d1");
        t1.setIntegral(0);
        t1.setLanguage("1");
        t1.setNickname("dd1");
        t1.setOpenid("t1");
        t1.setInserttime(new Date());
        t1.setProvince("t1");
        t1.setSex(true);
        t1.setPrivilege("t1");

        wxUserMapper.insertSelective(t1);

        int i = 1 / 0;

        WxUser t2 = new WxUser();
        t2.setCity("city2");
        t2.setCountry("c2");
        t2.setHeadimgurl("d2");
        t2.setIntegral(0);
        t2.setLanguage("2");
        t2.setNickname("dd2");
        t2.setOpenid("t2");
        t2.setInserttime(new Date());
        t2.setProvince("t2");
        t2.setSex(true);
        t2.setPrivilege("t2");

        wxUserMapper.insertSelective(t2);

        return 0;
    }

    //SUPPORTS一般用于查询
    @Transactional(propagation = Propagation.SUPPORTS)
    public WxUser selectByPrimaryKey(Integer pkid) {
        return wxUserMapper.selectByPrimaryKey(pkid);
    }
}
