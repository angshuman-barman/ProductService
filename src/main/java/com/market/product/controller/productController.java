package com.market.product.controller;

import com.market.product.model.Student;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/getDetails")
public class productController {
    @PostMapping("/sendHi")
    public String getMessage(@RequestBody @Valid Student student) {
        return "Hi, Hello from Product Service!";
    }
}
