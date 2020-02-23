package com.hongyan.combinedemo;

import com.hongyan.combinedemo.domain.MainIC;
import com.hongyan.combinedemo.mapper.MainboardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class CombinedemoApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    MainboardMapper mainboardMapper;
    @Test
    void contextLoads() {
        //查看数据源
//        System.out.println(dataSource.getClass());
        List<MainIC> mainICS = mainboardMapper.getMainICS();
        System.out.println(mainICS);
    }

    //Error:java: 服务配置文件不正确, 或构造处理程序对象javax.annotation.processing.Processor: Provider lombok.launch.AnnotationProcessorHider$AnnotationProcessor could not be instantiated: java.lang.RuntimeException: java.lang.ClassNotFoundException: lombok.core.AnnotationProcessor时抛出异常错误

}
