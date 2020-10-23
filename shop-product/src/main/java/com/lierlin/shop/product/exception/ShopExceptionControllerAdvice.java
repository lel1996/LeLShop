package com.lierlin.shop.product.exception;

import com.lierlin.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
* ���д�������controller���ֵ��쳣
* */
@Slf4j
/*@ResponseBody//������jsong��ʽ����
@ControllerAdvice(basePackages = "com.lierlin.shop.product.controller")//ͳһ�����쳣*/
@RestControllerAdvice//RestControllerAdvice=ControllerAdvice+ControllerAdvice
public class ShopExceptionControllerAdvice {
    @ExceptionHandler//(����spring��һ�������쳣�ķ���)
    public R hanldvalidException(Exception e){
            log.error("����У���������:{},�쳣���ͣ�{}",e.getMessage(),e.getClass());
            return R.error();
    }
}
