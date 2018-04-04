package com.hworld.crsapi.controller;

import com.hworld.crsapi.model.User;
import com.hworld.crsapi.model.WechatUser;
import com.hworld.crsapi.model.WxUser;
import com.hworld.crsapi.service.WeChatUserService;
import com.hworld.crsapi.service.WxUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api("Home接口")
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private WeChatUserService weChatUserService;

    @Autowired
    private WxUserService wxUserService;

    @ApiOperation("Index接口")
    @GetMapping("index")
    public String index() {
        return "Hello World";
    }

    @ApiOperation("获取用户信息")
    @GetMapping("user")
    public User getUser() {
        User user = new User();
        user.setPkid(1);
        user.setName("小欣欣");
        user.setBirthday(new Date());
        return user;
    }

    @ApiOperation("获取微信用户")
    @GetMapping("wechat/{pkid}")
    public WechatUser getWechatUser(@PathVariable("pkid") Integer pkid) {
        return weChatUserService.selectByPrimaryKey(pkid);
    }

    @ApiOperation("新增微信用户")
    @GetMapping("wechat/insert")
    public int insertSelective() {
        wxUserService.insertSelective();
        return 0;
    }
}
