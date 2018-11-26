package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 雒建伟
 * @date; 2018/11/9
 * @package: cn.smbms.controller
 * @description: TODO
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }



}
