package com.louis.mango.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Guilin
 * @version 1.0
 * @date 2021/2/25 16:02
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public  Object hello(){return "Hello Mango";}
}
