package com.izere.pma.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApplicationLoggerAspect {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Pointcut("within (com.izere.pma.controllers..*)")
    public void definePackagePointcuts() {
    }

    @Before("definePackagePointcuts()")
    public void beforeMethod() {
        log.info("***************************");
        log.info("Trying the log @Before method\n");
    }

    @After("definePackagePointcuts()")
    public void afterMethod() {
        log.info("@After method");
        log.info("******************************");
    }

}
