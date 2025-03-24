package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAdminController {
    @GetMapping("userAdmin")
    public String UserAdmin(){
        return "userAdmin";
    }
}
