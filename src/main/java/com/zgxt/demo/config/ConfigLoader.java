package com.zgxt.demo.config;

import java.io.IOException;  
import java.io.InputStream;  
import java.util.Properties;  
  
public class ConfigLoader {  
  
    public static void main(String[] args) {  
        Properties properties = new Properties();  
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("conf.properties")) {  
            if (input == null) {  
                throw new RuntimeException("conf.properties not found in the classpath");  
            }  
            properties.load(input);  
  
            // 使用properties对象中的配置信息  
            // 例如：String someProperty = properties.getProperty("some.property.key");  
  
        } catch (IOException ex) {  
            ex.printStackTrace();  
            // 处理IO异常  
        }  
    }  
}