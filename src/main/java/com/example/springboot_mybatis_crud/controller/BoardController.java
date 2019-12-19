package com.example.springboot_mybatis_crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 이승환
 * @since 2019-12-18
 */
@Controller
public class BoardController {

    @GetMapping("/")
    public String home() {
        return "read";
    }

}
