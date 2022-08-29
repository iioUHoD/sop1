package com.example.mathservice;
import org.springframework.web.bind.annotation.*;

@RestController
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Customer(){
        this("", null, "female", 0);
    }

    public Customer(String ID, String n, String s, int a){
        this.ID = ID;
        this.name = n;
        if(s.equals("Male") || s.equals("male")){
            this.sex = true;
        }
        else{
            this.sex = false;
        }
        if(age < 0) {
            this.age = 0;
        }
        else{
            this.age = a;
        }
    }
}
