package com.star.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 
 *
 * @author star
 * @email 447805901@qq.com
 * @date 2021-12-25 02:09:33
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions(":user:list")
    public String list(@RequestParam Map<String, Object> params){

        return "hahahahha";
    }

}
