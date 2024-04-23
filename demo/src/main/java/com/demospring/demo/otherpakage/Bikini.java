package com.demospring.demo.otherpakage;

import com.demospring.demo.OutFit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements OutFit {
    @Override
    public void wear(){
        System.out.println("tesst");
    }
}
