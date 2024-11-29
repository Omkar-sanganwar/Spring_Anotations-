package com.grp132.SpringAno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECIController {

    @Autowired
    @Qualifier("myx")  // Explicitly specify which bean to inject
    X objx;

    @Autowired
    @Qualifier("mybeanofX")  // Specify the second bean
    X objy;

    @GetMapping("/homepage")
    public String MyFirstAPI() {
        objx.XMethod();  // Calls XMethod from the first bean
        objy.XMethod();  // Calls XMethod from the second bean
        return "Hello All!";
    }
}
