package spring.tomcat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
