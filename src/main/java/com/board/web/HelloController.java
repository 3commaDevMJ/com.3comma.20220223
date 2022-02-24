package com.board.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON으로 반환해주는 어노테이션. @ResponseBody 안써두댐.
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
