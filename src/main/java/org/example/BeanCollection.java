package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configurable
public class BeanCollection {


        @Bean
        @Scope(SCOPE_PROTOTYPE)
        public Student Student(){

            return new Student(listPhone());
        }
        @Bean
        public Address Address(){
            return new Address();
        }

        @Bean
    public List<Phone> listPhone(){return Arrays.asList(new Phone("000-000"), new Phone("111-1111"));}
}
