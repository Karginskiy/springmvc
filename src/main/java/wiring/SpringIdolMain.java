package wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Performer performer = (Performer) context.getBean("poeticDuke");
        performer.perform();

        System.out.println();

        Performer performer1 = (Performer) context.getBean("kenny");
        performer1.perform();
    }


}
