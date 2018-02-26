package masterspring.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lihaonan on 2/26/18.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String authenticate() {
        return "login";
    }
}
