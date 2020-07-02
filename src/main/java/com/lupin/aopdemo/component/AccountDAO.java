package com.lupin.aopdemo.component;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String name;
    private String service;

    public void addAccount(Account account, boolean t){
        System.out.println(getClass() + " Doing my DB work: Add an account");
    }

    public boolean doWork(){
        System.out.println(getClass() + " Doing doWork()");
        return true;
    }

    public String getName() {
        System.out.println(getClass() + " in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + " in setName()");
        this.name = name;
    }

    public String getService() {
        System.out.println(getClass() + " in getService()");
        return service;
    }

    public void setService(String service) {
        System.out.println(getClass() + " in setService()");
        this.service = service;
    }
}
