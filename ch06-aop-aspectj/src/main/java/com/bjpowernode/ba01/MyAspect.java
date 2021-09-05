package com.bjpowernode.ba01;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


import java.util.Date;

@Aspect

public class MyAspect {
    @Before(value = "execution(public  void com.bjpowernode.ba01.SomeService.dosome(String,Integer))")
    public  void  mybefore(){
        System.out.println("切面功能：在目标方法之前输出执行时间："+ new Date());
    }

}
