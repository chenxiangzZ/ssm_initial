package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yangxin
 * @time 2018/12/29  13:35
 */
@Controller
@RequestMapping(value = "/user")
public class testController {

    @RequestMapping(value = "/index.html")
    public String index(){

        return "index1";
    }
}
