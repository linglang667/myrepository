package com.bjpowernode.ba02;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect

public class MyAspect {
    @AfterReturning(value = "execution(  String *..SomeServiceImpl.doother(..))",returning = "res")
    public  void  myafterReturning(Object res){
        System.out.println("后置通知：获取的返回值是"+ res);
    }

}
