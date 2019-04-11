package com.ly.verforpet.service;

import com.ly.verforpet.common.vo.ResultVo;
import com.ly.verforpet.pojo.UserData;

public interface UserDataService {

    // 保存用户提交信息
    ResultVo save(UserData userData);
}
