/**
 * Description:
 * ApplicationController.java Create on 2013-3-19 下午4:30:55 
 * @author 肖聘   xiaopin@yhiker.com
 * @version 1.0
 * Copyright (c) 2013 Hiker,Inc. All Rights Reserved.
 */
package com.xp.myblog.common.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xp.myblog.core.context.SysPropsFactory;

/**
 * @ClassName: ApplicationController
 * @Description: TODO
 * @author 肖聘 xiaopin@yhiker.com
 * @date 2013-3-19 下午4:30:55
 * 
 */
public abstract class ApplicationController {

    /**
     * log4j 记录器
     */
    protected static final Logger log = Logger.getLogger(ApplicationController.class);

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:dd:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    /**
     * 抽象方法,用于子类初始化页面
     * 
     * @return
     */
    public abstract String execute(HttpServletRequest request, ModelMap model) throws Exception;

    @RequestMapping(method = RequestMethod.GET)
    public String initPage(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
        response.addHeader("Cache-Control", "no-cache");
        response.addHeader("Pragma", "no-cache");
        response.addHeader("Expires", "-1");
        String contextPath = request.getContextPath();
        model.addAttribute("contextPath", contextPath);
        Iterator<Entry<Object, Object>> it = SysPropsFactory.getSysProps().entrySet().iterator();  
        while (it.hasNext()) {  
            Entry<Object, Object> entry = it.next();  
            model.addAttribute((String)entry.getKey(), entry.getValue());
        }
        return execute(request, model);
    }
}
