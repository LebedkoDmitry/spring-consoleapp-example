package com.tsystems;

import com.tsystems.domain.SimpleDomainModel;
import com.tsystems.services.AbstractService;
import com.tsystems.services.SimpleService;
import com.tsystems.domain.PrototypeDomainModel;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        processApplicationContext(applicationContext);
        AbstractApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("src/main/resources/application-context.xml");
        processApplicationContext(applicationContext1);

        AbstractApplicationContext applicationContext2 = new AnnotationConfigApplicationContext("com.tsystems.services.impl.annotated", "com.tsystems.domain.annotated");
        processApplicationContextBasedOnAnnotations(applicationContext2);
    }

    private static void processApplicationContext(AbstractApplicationContext applicationContext) {

        SimpleService firstSimpleService = (SimpleService) applicationContext.getBean("simpleService");
        SimpleDomainModel firstSimpleDomainModel = firstSimpleService.getDomainModel();

        SimpleService secondSimpleService = applicationContext.getBean(SimpleService.class);
        SimpleDomainModel secondSimpleDomainModel = secondSimpleService.getDomainModel();

        System.out.println(firstSimpleDomainModel);
        System.out.println(secondSimpleDomainModel);

        // LazyService lazyService = applicationContext.getBean(LazyService.class);

        AbstractService abstractService = applicationContext.getBean(AbstractService.class);
        abstractService.showMessage();

        PrototypeDomainModel firstPrototypeDomainModel = applicationContext.getBean(PrototypeDomainModel.class);
        PrototypeDomainModel secondPrototypeDomainModel = applicationContext.getBean(PrototypeDomainModel.class);

        System.out.println(firstPrototypeDomainModel.getMessage());
        System.out.println(secondPrototypeDomainModel.getMessage());

        applicationContext.close();
    }

    private static void processApplicationContextBasedOnAnnotations(AbstractApplicationContext applicationContext) {
        SimpleService firstSimpleService = applicationContext.getBean(SimpleService.class);
        SimpleDomainModel firstSimpleDomainModel = firstSimpleService.getDomainModel();
        System.out.println(firstSimpleDomainModel);
    }

}
