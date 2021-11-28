package com.xtd.bs.controller;


import com.alibaba.fastjson.JSON;
import com.xtd.bs.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
@RestController
@RequestMapping("/bs/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping("classList")
    public String findAllClass(){
        return JSON.toJSONString(classService.findAllClass());
    }

}

