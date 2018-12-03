package com.lurenjia.manydataresources.controller;


import com.lurenjia.manydataresources.entity.DMUser;
import com.lurenjia.manydataresources.entity.MysqlUser;
import com.lurenjia.manydataresources.repository1.UserRepository1;
import com.lurenjia.manydataresources.repository2.UserRepository2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanggt
 * @date 18-12-3
 */
@RestController
@RequestMapping("/db")
public class DBController {
    @Resource
    private UserRepository1 userRepository1;
    @Resource
    private UserRepository2 userRepository2;

    @GetMapping("/mysql")
    public void mysql() {
        List<MysqlUser> all = userRepository1.findAll();
        for (MysqlUser user : all) {
            System.out.println(user);
        }
    }

    @GetMapping("/dameng")
    public void daMeng() {
        List<DMUser> all = userRepository2.findAll();
        for (DMUser user : all) {
            System.out.println(user);
        }
    }
}
