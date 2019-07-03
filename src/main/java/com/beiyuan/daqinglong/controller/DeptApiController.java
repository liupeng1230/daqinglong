package com.beiyuan.daqinglong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：xiao ka
 * @date ：Created in 2019/7/3 11:28
 */
@RestController
@RequestMapping("/api/dept")
public class DeptApiController {

    @GetMapping
    public List<String> getTest(){
        return Arrays.asList("1","2","3");
    }
}
