package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService bean = ioc.getBean(IUserService.class);
        bean.getUser();
    }

}
