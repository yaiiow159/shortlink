package com.timmy.shortlink.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
@ControllerAdvice
public class GlobalCheckRequestParameter  {

    @InitBinder
    // 前端傳送的字段 檢查
    public void checkString() {

    }
}
