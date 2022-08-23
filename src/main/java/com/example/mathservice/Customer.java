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

    public Customer(String ID, String n, boolean s, int a){
        this.ID = ID;
        this.name = n;
        if(this.sex == "Male" || this.sex == "male"){
            return true;
        } else if (this.sex == "Male" || this.sex == "male") {
            return false;
        }

    }
}
