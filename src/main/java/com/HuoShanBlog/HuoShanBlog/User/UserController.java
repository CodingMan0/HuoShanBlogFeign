package com.HuoShanBlog.HuoShanBlog.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。 
    @Autowired
    UserService userService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) { 
        return userService.sayHiFromClientOne( name );
    }


}
