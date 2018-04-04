package com.hworld.crsapi.mapper;

import com.hworld.crsapi.model.WechatUser;

public interface WeChatUserMapper {

    WechatUser selectByPrimaryKey(Integer pkid);
}
