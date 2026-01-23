package com.market.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getDetails")
public class productController {
    @GetMapping("/sendHi")
    public String getMessage() {
        return "Hi, Hello from Product Service!";
    }


}
