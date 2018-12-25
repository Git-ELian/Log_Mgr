package com.controller;

import com.pojo.Log;
import com.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-25 11:43
 * @desc
 **/

@Controller
@RequestMapping("/paper")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/allPaper")
    public String list(Model model){
        List<Log> logs = logService.queryAllLog();
        model.addAttribute("logs", logs);
        return "allPaper";
    }

    @RequestMapping("toAddLog")
    public String toAddLog(){
        return "addPaper";
    }

    @RequestMapping("/addLog")
    public String addLog(Log log){
        logService.addLog(log);
        return "redirect:/paper/allPaper";
    }

    @RequestMapping("/del/{logId}")
    public String delLog(@PathVariable("logId") Integer id){
        logService.deleteLogById(id);
        return "redirect:/paper/allPaper";
    }

    @RequestMapping("toUpdateLog")
    public String toUpdatePaper(Model model,Integer id){
        model.addAttribute("log", logService.queryById(id));
        return "updatePaper";
    }

    @RequestMapping("/updateLog")
    public String updateLog(Model model,Log log){
        logService.updateLog(log);
        log = logService.queryById(log.getLogId());
        model.addAttribute("log", log);
        return "redirect:/paper/allPaper";
    }
}
