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
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanCollection.class);

        Phone studentPhone = (Phone)context.getBean("Phone");
        Phone studentPhone2 = (Phone)context.getBean("Phone1");
        Phone studentPhone3 = (Phone)context.getBean("Phone2");
        Student student =  context1.getBean(Student.class);
        Address address = context1.getBean(Address.class);

        address.setState("Mississippi");
        address.setCity("Laurel");
        address.setZipcode("99999");
        address.setCountry("USA");

        student.setAdd(address);

        studentPhone.setNumber("000-0000");
        studentPhone2.setNumber("111-1111");
        studentPhone3.setNumber("222-2222");

        List<Phone> ph = new ArrayList<>();
        ph.add(studentPhone);
        ph.add(studentPhone2);
        ph.add(studentPhone3);

        student.setPh(ph);
        student.setId(1);
        student.setName("Alex");




         System.out.println(student);




    }
}
