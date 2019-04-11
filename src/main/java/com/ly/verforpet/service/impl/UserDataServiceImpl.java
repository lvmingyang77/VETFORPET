package com.ly.verforpet.service.impl;

import com.ly.verforpet.common.utils.ResultUtil;
import com.ly.verforpet.common.vo.ResultVo;
import com.ly.verforpet.dao.UserDataMapper;
import com.ly.verforpet.pojo.UserData;
import com.ly.verforpet.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataMapper userDataMapper;
    @Override
    public ResultVo save(UserData userData) {

        ResultVo resultVo = new ResultVo();
        try {
            userDataMapper.insertSelective(userData);
            resultVo = ResultUtil.exec(true, "OK", null);
        } catch (Exception e) {
            e.printStackTrace();
            resultVo = ResultUtil.exec(false, "ERROR", e.getMessage());
        }
        return resultVo;
    }
}
