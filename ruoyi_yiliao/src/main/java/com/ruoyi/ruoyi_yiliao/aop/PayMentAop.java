package com.ruoyi.ruoyi_yiliao.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Aspect
@Slf4j
@Component
public class PayMentAop {
    @Pointcut("execution(* com.ruoyi.ruoyi_yiliao.controller.*.add(..))")
    public void p(){}

    @After("p()")
    @Transactional
    public void insertPayMent(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getKind());

    }
}
