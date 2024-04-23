package com.demospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {

//    @Autowired
//    @Qualifier("bikini")
    public OutFit outfit;

    public GirlFriend() {
    }

    @Autowired
    public GirlFriend(OutFit outfit) {
        this.outfit = outfit;
    }
    //@Autowired
    public void setOutfit(OutFit outfit) {
        this.outfit = outfit;
    }

    public OutFit getOutfit(OutFit outfit) {
        return this.outfit;
    }
}
