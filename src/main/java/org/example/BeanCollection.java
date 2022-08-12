package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Configurable
public class BeanCollection {

        @Bean
        public Student getStudent(){
            return new Student();
        }
        @Bean
        public Address Address(){
            return new Address();
        }
}
