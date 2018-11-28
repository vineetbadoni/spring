package io.code.brains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CourseAPI {
    public static void main(String[] args) {

//        SpringApplication.run(CourseAPI.class,args);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
       AOPTest aopTest =  ctx.getBean("AOPTest",AOPTest.class);

        System.out.println(aopTest.getMessage());

    }
}
