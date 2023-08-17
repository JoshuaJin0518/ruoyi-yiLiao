package com.ruoyi.ruoyi_yiliao.aop;

import com.ruoyi.ruoyi_yiliao.uitl.StringUitl;
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
    @Pointcut("execution(* com.ruoyi.ruoyi_yiliao.controller.*ResulthandleController.add(..))")
    public void p(){}

    @After("p()")
    @Transactional
    public void insertPayMent(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getKind());
        //去除后缀
        String cutlast = StringUitl.cutlast(".", joinPoint.getSignature().toString());
        System.out.println(cutlast);
        //获得最后的字符串
        String s = StringUitl.lastSubString(".", cutlast);
        System.out.println(s);
    }
}
