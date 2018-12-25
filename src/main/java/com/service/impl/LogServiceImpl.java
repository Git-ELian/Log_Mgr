package com.service.impl;

import com.dao.LogMapper;
import com.pojo.Log;
import com.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-25 11:37
 * @desc
 **/

@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private LogMapper logMapper;

    public int addLog(Log log) {
        return logMapper.addLog(log);
    }

    public int deleteLogById(Integer id) {
        return logMapper.deleteLogById(id);
    }

    public int updateLog(Log log) {
        return logMapper.updateLog(log);
    }

    public Log queryById(Integer id) {
        return logMapper.queryById(id);
    }

    public List<Log> queryAllLog() {
        return logMapper.queryAllLog();
    }
}
