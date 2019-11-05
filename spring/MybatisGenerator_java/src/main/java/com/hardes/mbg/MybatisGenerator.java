package com.hardes.mbg;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class MybatisGenerator {

    public static void main (String [] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //需要全路径名，否则会报错filenotfound
        File configFile = new File("D:\\CM_Library\\java\\maven\\workspace\\spring\\MybatisGenerator_java\\src\\main\\resource\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
