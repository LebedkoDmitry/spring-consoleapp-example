package org.lebedko;

import org.lebedko.domain.PrototypeDomainModel;
import org.lebedko.domain.SimpleDomainModel;
import org.lebedko.services.SimpleService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        processApplicationContext(applicationContext);
        AbstractApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("src/resources/application-context.xml");
        processApplicationContext(applicationContext1);
    }

    private static void processApplicationContext(AbstractApplicationContext applicationContext) {

        SimpleService firstSimpleService = (SimpleService) applicationContext.getBean("simpleService");
        SimpleDomainModel firstSimpleDomainModel = firstSimpleService.getDomainModel();

        SimpleService secondSimpleService = applicationContext.getBean(SimpleService.class);
        SimpleDomainModel secondSimpleDomainModel = secondSimpleService.getDomainModel();

        System.out.println(firstSimpleDomainModel);
        System.out.println(secondSimpleDomainModel);

        PrototypeDomainModel firstPrototypeDomainModel = applicationContext.getBean(PrototypeDomainModel.class);
        PrototypeDomainModel secondPrototypeDomainModel = applicationContext.getBean(PrototypeDomainModel.class);

        System.out.println(firstPrototypeDomainModel.getMessage());
        System.out.println(secondPrototypeDomainModel.getMessage());

        applicationContext.close();
    }

}
