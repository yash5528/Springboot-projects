package demo.main.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.main.model.Person;

@RestController
public class PersonInfoController {

    @GetMapping("/person")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public @ResponseBody Person personInfo() {
        return new Person("aditya", "hyderabad", "India", 21, "Male");
    }   
}
