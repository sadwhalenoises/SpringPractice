package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Student {
    private int id;
    private String name;

    private List<Phone> ph;
    @Autowired
    private Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add){
        this.add = add;
    }

    public String[] arrayString (List<Phone> list){
        String[] str = new String[list.size()];
        int i = 0;
        for(Phone num: list){
            str[i] = num.getNumber();
            i++;
        }
        return str;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + Arrays.toString(arrayString(ph)) +
                ", add=" + add +
                '}';
    }
}
