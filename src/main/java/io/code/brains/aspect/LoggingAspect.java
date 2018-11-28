package io.code.brains.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public String getMessage())")
    public void beforeAdvice(){
        System.out.println("LoggingAdvice run. getMessage called");
    }

    @After("execution(public String getMessage())")
    public void afterAdvice(){
        System.out.println("LoggingAdvice run. getMessage called");
    }

    @Around("execution(public String getMessage())")
   public void aroundAdvice(ProceedingJoinPoint p) throws Throwable{
        Long startTime = System.currentTimeMillis();
        p.proceed();
        System.out.println("Total time to execute getMessage() :: "+(System.currentTimeMillis()-startTime) +"ms.");
   }
}
