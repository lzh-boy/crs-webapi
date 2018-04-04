package com.hworld.crsapi.service;

import com.hworld.crsapi.mapper.WeChatUserMapper;
import com.hworld.crsapi.model.WechatUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeChatUserService {

    @Autowired
    private WeChatUserMapper weChatUserMapper;

    public WechatUser selectByPrimaryKey(Integer pkid) {
        return weChatUserMapper.selectByPrimaryKey(pkid);
    }
}
