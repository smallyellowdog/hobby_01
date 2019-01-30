package com.xuyi.designpattern.engine.impl;

import com.xuyi.designpattern.engine.basic.BasicProcessor;
import com.xuyi.designpattern.engine.otherinfo.UserInfo;

public class UserProcessor implements BasicProcessor<OrderDetailContext> {
    @Override
    public void excute(OrderDetailContext context) {

        //mock userinfo
        UserInfo userInfo = new UserInfo();

        context.setUserInfo(userInfo);
    }
}
