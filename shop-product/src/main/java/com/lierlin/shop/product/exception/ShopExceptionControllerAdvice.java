package com.lierlin.shop.product.exception;

import com.lierlin.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
* 集中处理所有controller出现的异常
* */
@Slf4j
/*@ResponseBody//数据以jsong格式返回
@ControllerAdvice(basePackages = "com.lierlin.shop.product.controller")//统一处理异常*/
@RestControllerAdvice//RestControllerAdvice=ControllerAdvice+ControllerAdvice
public class ShopExceptionControllerAdvice {
    @ExceptionHandler//(告诉spring是一个处理异常的方法)
    public R hanldvalidException(Exception e){
            log.error("数据校验出现问题:{},异常类型：{}",e.getMessage(),e.getClass());
            return R.error();
    }
}
