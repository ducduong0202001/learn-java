package com.demospring.demo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//
//@Scope("prototype")
public class Dress implements OutFit {
    @Override
    public void wear(){
        System.out.println("tesst");
    }
}
