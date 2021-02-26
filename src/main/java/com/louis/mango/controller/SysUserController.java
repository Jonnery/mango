package com.louis.mango.controller;

import com.louis.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Guilin
 * @version 1.0
 * @date 2021/2/26 9:50
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}