package com.hongyan.combinedemo.controller;

import com.hongyan.combinedemo.domain.MainIC;
import com.hongyan.combinedemo.domain.Mainboard;
import com.hongyan.combinedemo.mapper.MainboardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;

@Controller
public class MainboardController {

    @Autowired
    MainboardMapper mainboardMapper;

    @GetMapping("/mainboard.do")
    public String toIndexPage( Model model){

        List<MainIC> mainICS = mainboardMapper.getMainICS();
        model.addAttribute("mainICS",mainICS);
        return "mainboard";
    }

    @GetMapping("/mainboard.do/{mainicid}")
    public String toIndexPage(@PathVariable("mainicid") Integer mainicid, Model model){
        List<Mainboard> mainBoardS = mainboardMapper.getMainBoardByMainICID(mainicid);
        model.addAttribute("mainBoardS",mainBoardS);
        List<MainIC> mainICS = mainboardMapper.getMainICS();
        model.addAttribute("mainICS",mainICS);
        return "mainboard";
    }
}
