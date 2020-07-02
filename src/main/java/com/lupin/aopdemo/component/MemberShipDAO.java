package com.lupin.aopdemo.component;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
    public boolean addSillyMember(){
        System.out.println(getClass() + " Doing stuff add a member");
        return true;
    }
    public void goSleep(){
        System.out.println(getClass() + " Going to sleep");
    }
}
