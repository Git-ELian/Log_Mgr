package com.service;

import com.pojo.Log;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-25 11:20
 * @desc
 **/

public interface LogService {

    int addLog(Log log);

    int deleteLogById(Integer id);

    int updateLog(Log log);

    Log queryById(Integer id);

    List<Log> queryAllLog();
}
