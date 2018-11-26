package cn.bdqn.controller;

import cn.bdqn.pojo.entry.Entry;
import cn.bdqn.service.EntryService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 雒建伟
 * @date; 2018/11/20
 * @package: cn.bdqn.controller
 * @description: TODO
 */
@Controller
@RequestMapping(value = "/entry")
public class EntryController {
    private Logger logger=Logger.getLogger(EntryController.class);
    @Resource
    private EntryService entryService;
    @RequestMapping(value = "/GetAll.html")
    public String GetEntry(HttpSession session){
        List<Entry> list=entryService.GetAllEntry();
        session.setAttribute("list",list);
        return "index";
    }
    @RequestMapping(value = "/drop")
    @ResponseBody
    public int drop(@RequestParam Integer id){
        int result=0;

        try {
            if (entryService.dropEntry(id)>0) {
                logger.info("删除成功");
                result=1;
            }

        }catch (Exception e){
            e.printStackTrace();
            result=0;
        }
        return result;
    }

}
