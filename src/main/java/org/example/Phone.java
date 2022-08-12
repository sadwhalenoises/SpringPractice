package org.example;

import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE)
public class Phone {

    private String number;

    public Phone(String number){
        this.number = number;

    }

    public void setNumber(String number){
        this.number = number;
    }



    public String getNumber(){
        return number;
    }
}
