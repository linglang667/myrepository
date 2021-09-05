package com.bjpowernode.ba01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome(String name,Integer age) {
        System.out.println("目标方法dosome的执行");
    }
}
