package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageAdminController {
    @GetMapping("homepageAdmin")
    public String HomepageAdmin(){
        return "homepageAdmin";
    }
}
