package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvalidPasswordController {
    @GetMapping("invalidPassword")
    public String InvalidPassword(){
        return "invalidPassword";
    }
}
