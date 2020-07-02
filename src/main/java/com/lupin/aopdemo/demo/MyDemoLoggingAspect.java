package com.lupin.aopdemo.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* *(..))")
    private void forPackage(){}

    @Pointcut("execution(* get*(..))")
    private void getter(){
    }

    @Pointcut("execution(* set*(..))")
    private void setter(){
    }

    @Pointcut("forPackage() && !(getter()||setter())")
    private void forPackageNozGetter(){}

    @Before("forPackageNozGetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice a method");
    }

    @Before("forPackageNozGetter()")
    public void performAPI(){
        System.out.println("\n=====>>> Perform API analyst");
    }
}
