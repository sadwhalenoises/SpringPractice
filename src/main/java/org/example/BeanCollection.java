package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configurable
public class BeanCollection {

        @Bean
        @Scope(SCOPE_PROTOTYPE)
        public Student Student(){
            return new Student();
        }
        @Bean
        public Address Address(){
            return new Address();
        }
}
