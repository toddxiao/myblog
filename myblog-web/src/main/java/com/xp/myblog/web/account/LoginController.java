/**
 * Description:
 * UserController.java Create on 2013-3-19 下午12:18:01 
 * @author 肖聘   xiaopin@yhiker.com
 * @version 1.0
 * Copyright (c) 2013 Hiker,Inc. All Rights Reserved.
 */
package com.xp.myblog.web.account;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.xp.myblog.common.controller.ApplicationController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author 肖聘 xiaopin@yhiker.com
 * @date 2013-3-19 下午12:18:01
 * 
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends ApplicationController{

    @RequestMapping()
    public String execute(HttpServletRequest request,ModelMap model) {
        model.addAttribute("contextPath", request.getContextPath()); 
        System.setProperty("staticResourceVersion", "1");
        return "login";
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> verify(@RequestParam("userEmail") String userEmail,
            @RequestParam("userPassword") String userPassword,HttpServletRequest request) {

        Map<String, Object> result = Maps.newHashMap();
        result.put("isLoggedIn", true);
        return result;
    }
}
