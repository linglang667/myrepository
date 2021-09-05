package com.bjpowernode.ba02;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome(String name,Integer age) {
        System.out.println("目标方法dosome的执行");
    }

    @Override
    public String doother(String name, Integer age) {
        System.out.println("目标方法doother");
        return "abcd";
    }
}
