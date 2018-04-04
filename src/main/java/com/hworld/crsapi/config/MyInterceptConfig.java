package com.hworld.crsapi.config;

import com.hworld.crsapi.util.MyConstUtil;
import com.hworld.crsapi.util.MySecurityUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyInterceptConfig implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        /*String token = request.getHeader(MyConstUtil.TOKEN);
        String timestamp = request.getHeader(MyConstUtil.TIMESTAMP);
        System.err.println("拦截器中接收到的token=" + token + ",timestamp=" + timestamp);

        if (token == null || "".equals(token) || timestamp == null || "".equals(timestamp)) {
            response.sendRedirect(MyConstUtil.INDEX_URL);
            return true;
        }

        Date dt = new SimpleDateFormat(MyConstUtil.DATE_FORMAT).parse(timestamp);
        Date dt2 = new Date(System.currentTimeMillis() + MyConstUtil.EXPIRE);
        Date dt1 = new Date();
        if (dt.getTime() > dt2.getTime() || dt.getTime() < dt1.getTime()) {
            System.err.println("过期了");
            response.sendRedirect(MyConstUtil.INDEX_URL);
            return true;
        }

        String appKey = MyConstUtil.APP_KEY;
        String sign = MySecurityUtil.encryptMD5(appKey + timestamp);
        if (!token.equals(sign)) {
            response.sendRedirect(MyConstUtil.INDEX_URL);
            return true;
        }*/

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
