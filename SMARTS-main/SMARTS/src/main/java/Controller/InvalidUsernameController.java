package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvalidUsernameController {
    @GetMapping("invalidUsername")
    public String InvalidUsername(){
        return "invalidUsername";
    }
}
