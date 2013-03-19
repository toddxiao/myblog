/**
 * Description:
 * SysPropsFactory.java Create on 2013-3-19 下午4:41:09 
 * @author 肖聘   xiaopin@yhiker.com
 * @version 1.0
 * Copyright (c) 2013 Hiker,Inc. All Rights Reserved.
 */
package com.xp.myblog.core.context;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;


/** 
 * @ClassName: SysPropsFactory 
 * @Description: TODO 
 * @author 肖聘  xiaopin@yhiker.com
 * @date 2013-3-19 下午4:41:09 
 *  
 */
public class SysPropsFactory {

    private static Logger logger = LoggerFactory.getLogger(SysPropsFactory.class);
    
    private static Properties sysProps = new Properties();

    public static Properties getSysProps() {
        return sysProps;
    }
    
    public void setResource(Resource resource){
        try{
            sysProps.load(resource.getInputStream());
        }catch(Exception e){
            logger.error("初化sys.properties出错",e);
        }
    }
    
}
