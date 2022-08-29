package com.example.mathservice;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {

    private List<Customer> customers=new ArrayList<Customer>(
            Arrays.asList(
                    new Customer("1010", "John", "Male", 25),
                    new Customer("1018", "Peter", "Male", 24),
                    new Customer("1019", "Sara", "Female", 23),
                    new Customer("1010", "Rose", "Female", 23),
                    new Customer("1001", "Emma", "Female", 30)
            )
    );
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return customers;
    }
    @RequestMapping(value = "/customerbyid/{ID}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("ID") String ID){
        for(Customer i : customers) {
            if (i.getID().equals(ID)) {
                return i;
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerbyname/{n}", method = RequestMethod.GET)
    public Customer getCustomerByName(@PathVariable("n") String n){
        for(Customer i : customers) {
            if (i.getName().equals(n)) {
                return i;
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerDelByid/{id}", method = RequestMethod.GET)
    public boolean delCustomerById(@PathVariable("id") String ID){
        for(Customer i : customers) {
            if (i.getID().equals(ID)) {
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/customerDelByname/{n}", method = RequestMethod.GET)
    public boolean delCustomerByName(@PathVariable("n")String n){
        for(Customer i : customers) {
            if (i.getName().equals(n)) {
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id")String ID, @RequestParam("name")String n, @RequestParam("sex")String s, @RequestParam("age")int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }
    @RequestMapping(value = "/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id")String ID, @RequestParam("name")String n, @RequestParam("sex")String s, @RequestParam("age")int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }
}