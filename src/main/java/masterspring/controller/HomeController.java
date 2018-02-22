package masterspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lihaonan on 2/22/18.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String hello() {

        String content = "{\"name\":法国，\"type\":欧洲,\"order\":3}";
        return "resultPage";
    }
}
