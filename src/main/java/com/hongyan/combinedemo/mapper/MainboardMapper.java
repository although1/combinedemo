package com.hongyan.combinedemo.mapper;

import com.hongyan.combinedemo.domain.MainIC;
import com.hongyan.combinedemo.domain.Mainboard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
@Mapper
public interface MainboardMapper {

    @Select("select * from mainic")
     List<MainIC> getMainICS();

    @Select("select * from mainboard")
    List<Mainboard> getMainBoardS();

    @Select("select * from mainboard where mainicid = #{mainicid}")
    List<Mainboard> getMainBoardByMainICID(int mainicid);
}
