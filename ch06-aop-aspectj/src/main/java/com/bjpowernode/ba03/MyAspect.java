package com.bjpowernode.ba03;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import javax.xml.crypto.Data;
import java.util.Date;

@Aspect

public class MyAspect {
    @Around(value = "execution(  String *..SomeServiceImpl.dofirst(..))")
    public  Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result  = null;
        String name = null;
        Object args[] = pjp.getArgs();
        if (args != null && args.length > 1) {
             name = (String)args[0];
        }
        System.out.println("环绕通知：在目标方法之前输出时间"+new Date());
        if("zhangsan".equals(name)){
            result = pjp.proceed();//执行目标方法
        }

        System.out.println("环绕通知：在目标方法之后提交事务");
        return  result;
    }

}
