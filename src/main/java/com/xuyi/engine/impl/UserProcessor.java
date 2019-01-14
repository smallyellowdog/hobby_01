package com.xuyi.engine.impl;

import com.xuyi.engine.basic.BasicProcessor;
import com.xuyi.engine.otherinfo.UserInfo;

public class UserProcessor implements BasicProcessor<OrderDetailContext> {
    @Override
    public void excute(OrderDetailContext context) {

        //mock userinfo
        UserInfo userInfo = new UserInfo();

        context.setUserInfo(userInfo);
    }
}
