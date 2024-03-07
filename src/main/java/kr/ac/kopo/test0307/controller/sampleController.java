package kr.ac.kopo.test0307.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {
    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"Hello", "World"};
    }
}
