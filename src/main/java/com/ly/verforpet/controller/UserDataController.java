package com.ly.verforpet.controller;

import com.ly.verforpet.common.vo.ResultVo;
import com.ly.verforpet.pojo.UserData;
import com.ly.verforpet.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @PostMapping("save.do")
    public ResultVo save(UserData userData){

        return userDataService.save(userData);
    }
}
