package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanCollection.class);

        Student student =  context1.getBean(Student.class);

         System.out.println(student);




    }
}
