package com.bjpowernode.ba03;

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

    @Override
    public String dofirst(String name, Integer age) {
        System.out.println("业务方法dofirst");
        return "dofirst";
    }
}
