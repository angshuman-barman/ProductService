package com.market.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {

    @JsonFormat(pattern = "dd-MM-yyyy")
    int age;
}
